package Model;

/*
 * @author Arya Samarth
 * The Pennsylvania State University
 * aps6607@psu.edu
 */


public interface Displayable
{
   public int getFirstLineToDisplay(); 
   public int getLineToHighlight(); 
   public int getLastLineToDisplay(); 
   public int getLinesBeingDisplayed(); 
   
   public void setFirstLineToDisplay(int firstLine); 
   public void setLineToHighlight(int highlightedLine); 
   public void setLastLineToDisplay(int lastLine); 
   public void setLinesBeingDisplayed(int numberOfLines); 
   
}