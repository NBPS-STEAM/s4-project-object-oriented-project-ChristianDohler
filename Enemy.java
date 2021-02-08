public class Enemy
{
  //Enemy class instance variables
  private int health;
  private String name;
  private static int enemies = 0;

  //Default enemy constructor
  public Enemy(){ 
    name = "Goblin";
    enemies++;
  }
  /**
  overloaded Enemy construction that has parameters to initialize 
  instance variables
  */
  public Enemy(String enemyName)
  {
   name = enemyName;
   enemies++;
  }
  // I can use this accessor method so i can return the value of the instance variable
  public String getEnemyName()
  {
    	return name;
  }
	//I can use this mutator method to update and change the name of an enemy whenever in main class
	public void setName(String enemyName)
	{
	    name = enemyName;
	}
  // static method that tallies the amount of enemies I created 
  public static int getNumEnemies()
	{
	    return Enemy.enemies;
	}
  /** 
  Specific type of accessor method that provides information
  on the instacnce data of an object. It provides me to provide
  a description of an object when it is called
  */
  public String toString()
  {
    	return "Enemy Name: " + name;
  }

}
