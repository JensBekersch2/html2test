package models;

public class HtmlElements {

    private int id;
    private String elementType;
    private String elementId;
    private String elementClass;
    private String elementName;
    private String elementValue;
    private String elementXPath;
    private String elemenCssSelector;
    private String elementLinkTarget;

    public HtmlElements() {}

    public HtmlElements(int id, String elementType, String elementId, String elementClass, String elementName, String elementValue,
                        String elementXPath, String elemenCssSelector, String elementLinkTarget) {
        this.id = id;
        this.elementType = elementType;
        this.elementId = elementId;
        this.elementClass = elementClass;
        this.elementName = elementName;
        this.elementValue = elementValue;
        this.elementXPath = elementXPath;
        this.elemenCssSelector = elemenCssSelector;
        this.elementLinkTarget = elementLinkTarget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getElementClass() {
        return elementClass;
    }

    public void setElementClass(String elementClass) {
        this.elementClass = elementClass;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue;
    }

    public String getElementXPath() {
        return elementXPath;
    }

    public void setElementXPath(String elementXPath) {
        this.elementXPath = elementXPath;
    }

    public String getElemenCssSelector() {
        return elemenCssSelector;
    }

    public void setElemenCssSelector(String elemenCssSelector) {
        this.elemenCssSelector = elemenCssSelector;
    }

    public String getElementLinkTarget() {
        return elementLinkTarget;
    }

    public void setElementLinkTarget(String elementLinkTarget) {
        this.elementLinkTarget = elementLinkTarget;
    }
}
