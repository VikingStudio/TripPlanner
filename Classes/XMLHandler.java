package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/*
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/*
    Handles all XML interaction and storage.
 */
public class XMLHandler {

    private static String dataFile = "/Data.xml"; //contains name and path of XML data file, comes with default path

    private static String gameRulesEng; //contains game rules loaded from XML, English version.
    private static String gameRulesIce; //contains game rules loaded from XML, Icelandic version.

    //for localization where applicable, english or icelandic result enum
    public static enum Localization {
        ENGLISH, ICELANDIC
    };

    //if no xml data file path is passed to constructor, use default file
    public XMLHandler() {
        readGameRulesFromXML();
    }

    //constructor that allows passing a new data xml data path file
    public XMLHandler(String dataFilePath) {
        gameState = new GameState();
        dataFile = dataFilePath;
        readGameRulesFromXML();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
        //save XML
    }

    public String getGameRules(Localization loc) {
        if (loc == loc.ICELANDIC) {
            return this.gameRulesIce;
        } else {
            return this.gameRulesEng;
        }
    }

    /*
        read game rules from XML file and set XMLHandler.gameRulesXML string
     */
    private void readGameRulesFromXML() {
        try {
            File inputFile = new File(this.dataFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("rules");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    //read english rules
                    this.gameRulesEng = eElement
                            .getElementsByTagName("rules-eng")
                            .item(0)
                            .getTextContent();

                    //read icelandic rules
                    this.gameRulesIce = eElement
                            .getElementsByTagName("rules-ice")
                            .item(0)
                            .getTextContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        read saved game state XML file and set XMLHandler.gameStateXML class
     */
    public void readLastGameStateFromXML() {
        GameState gameState = new GameState();

        try {
            File inputFile = new File(this.dataFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("gamestate");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    gameState.playerTurn = Boolean.valueOf(eElement
                            .getElementsByTagName("playerturn")
                            .item(0)
                            .getTextContent());

                    gameState.playerStart = Boolean.valueOf(eElement
                            .getElementsByTagName("playerstart")
                            .item(0)
                            .getTextContent());

                    gameState.gameOver = Boolean.valueOf(eElement
                            .getElementsByTagName("gameover")
                            .item(0)
                            .getTextContent());

                    gameState.gameOver = Boolean.valueOf(eElement
                            .getElementsByTagName("playerwinner")
                            .item(0)
                            .getTextContent());

                    gameState.lastDiceRoll = Integer.valueOf(eElement
                            .getElementsByTagName("lastdiceroll")
                            .item(0)
                            .getTextContent());

                    gameState.locationPlayers[0] = Integer.valueOf(eElement
                            .getElementsByTagName("locationplayer")
                            .item(0)
                            .getTextContent());

                    gameState.locationPlayerToClick = Integer.valueOf(eElement
                            .getElementsByTagName("locationplayertoclick")
                            .item(0)
                            .getTextContent());

                    //read serialized snakes here
                    //read serialized ladders here
                    gameState.numberOfSnakes = Integer.valueOf(eElement
                            .getElementsByTagName("numberofsnakes")
                            .item(0)
                            .getTextContent());

                    gameState.numberOfLadders = Integer.valueOf(eElement
                            .getElementsByTagName("numberOfLadders")
                            .item(0)
                            .getTextContent());

                    gameState.computerClimbedLadder = Boolean.valueOf(eElement
                            .getElementsByTagName("computerclimbedladder")
                            .item(0)
                            .getTextContent());

                    gameState.computerSlidSnake = Boolean.valueOf(eElement
                            .getElementsByTagName("computerslidsnake")
                            .item(0)
                            .getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.gameState = gameState;
    }

    public void saveGame(GameState gameState) {
        //http://www.tutorialspoint.com/java_xml/java_jdom_modify_document.htm

        /*
        try {
            File inputFile = new File(dataFile);
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            Element rootElement = document.getRootElement();

            //get first supercar
            Element supercarElement = rootElement.getChild("supercars");

            // update supercar attribute
            Attribute attribute = supercarElement.getAttribute("company");
            attribute.setValue("Lamborigini");

            // loop the supercar child node
            List<Element> list = supercarElement.getChildren();
            for (int temp = 0; temp < list.size(); temp++) {
                Element carElement = list.get(temp);
                if ("Ferrari 101".equals(carElement.getText())) {
                    carElement.setText("Lamborigini 001");
                }
                if ("Ferrari 202".equals(carElement.getText())) {
                    carElement.setText("Lamborigini 002");
                }
            }

            //get all supercars element
            List<Element> supercarslist = rootElement.getChildren();
            for (int temp = 0; temp < supercarslist.size(); temp++) {
                Element tempElement = supercarslist.get(temp);
                if ("luxurycars".equals(tempElement.getName())) {
                    rootElement.removeContent(tempElement);
                }
            }

            XMLOutputter xmlOutput = new XMLOutputter();

            // display xml
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, System.out);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

}
