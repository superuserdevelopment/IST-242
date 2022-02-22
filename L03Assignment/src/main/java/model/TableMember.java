package model;
/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */
import java.util.ArrayList;

public interface TableMember
{

    public String getAttribute(int n);

    public ArrayList<String> getAttributes();

    public String getAttributeName(int n);

    public ArrayList<String> getAttributeNames();
}