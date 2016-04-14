package pl.pgs.tree;

public class TreeCreator {
  
  
  private StringBuilder add(int length, String sign) {
    StringBuilder stringbuilder = new StringBuilder();

    for (int i = 0; i < length; i++) {
      stringbuilder.append(sign);
    }

    return stringbuilder;
  }
  
  private String printlevel(int nOflevels, int currentlevel, String sign, String direction) {

    String level = "";

    switch (direction) {
    case "up": {
      level += add(nOflevels - currentlevel - 1, " ");
      level += add(2 * currentlevel + 1, sign);
      
      if (currentlevel + 1 != nOflevels) {
        level += "\n";
      }

      
      break;
    }
    
    case "down": {
      level += add(currentlevel, " ");
      level += add(2*nOflevels-2 - (2*currentlevel-1), sign);
      
      if (currentlevel + 1 != nOflevels) {
        level += "\n";
      }

      
      break;
    }

    case "right": {
      if(currentlevel<=nOflevels){
        level += add(currentlevel, sign);
        }
        if(currentlevel==nOflevels-1&&currentlevel!=0)
          {
          level+="\n";}
      if(currentlevel>nOflevels){
          level+= add(2*nOflevels-currentlevel,sign);
        }
      if (currentlevel + 1 != nOflevels&&currentlevel>0&&currentlevel+1<2*nOflevels) {
        level += "\n";
      }

      
      break;
    }
//current-aktualny(idzie od 0), nOflevels-liczba poziomow(od uzytkownika)
    case "left": {
      if(currentlevel<nOflevels){
      level += add(nOflevels - currentlevel-1, " ");
      level += add(currentlevel + 1, sign);
      }
      if(currentlevel==nOflevels&&nOflevels>1)
        {
        level+="\n";}
      if(currentlevel>=nOflevels&&currentlevel<2*nOflevels-1){
      
        level+= add(currentlevel-nOflevels+1," ");
        level+= add(2*nOflevels-currentlevel-1,sign);
       }
      
      if (currentlevel + 1 != nOflevels&&currentlevel+1<2*nOflevels-1) {
        level += "\n";
      }
      
      break;
    }
    

    default:
      System.out.println("Wprowadzony znak jest niepoprawny.");
    }
    

    
    return level;
  }

  
  
  public  String tree(int nOflevel, String sign, String direction) {
    String tree = "";
    
    if (direction.equals("up")|| direction.equals("down")){
    for (int i = 0; i < nOflevel; i++) {
      {
        tree += printlevel(nOflevel, i, sign, direction);
      }
    }}
    
    else if (direction.equals("left")|| direction.equals("right"))
    {
      for (int i = 0; i < 2*nOflevel; i++) {
        {
          tree += printlevel(nOflevel, i, sign, direction);
        }
      }  
    }
    return tree;

  }

}