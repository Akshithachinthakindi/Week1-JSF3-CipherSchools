package Inventory;

public class Stock {
    public String iAmAccessibleEveryWhere;
//    Public classes are accessed by everything even out of the package
    private String iamAccessibleOnlyHere;
//    Private classes can only be accessed by this class. we cannot use
//    private string out of this class.
    protected String iAmAccessibleToDerivedClasses;
//    Protected classes can be accessed by this class and sub-Classes of this class.
    String iAMAccessibleToAllClassInSamePackage;
//    This one can be accessed by everywhere in this package but not out of this package.

}
