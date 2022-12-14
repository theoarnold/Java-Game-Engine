import java.util.LinkedList;
import java.awt.Graphics;
public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();

    private boolean up = false, down = false, right = false, left = false, run = false;

public void tick(){
    for(int i = 0; i < object.size(); i++){

        GameObject tempObject = object.get(i);;

        tempObject.tick();
    }

}

public void render(Graphics g){
    for(int i = 0; i < object.size(); i++){

        GameObject tempObject = object.get(i);;

        tempObject.render(g);
    }
}

public void addObject (GameObject tempObject){
    object.add(tempObject);
}

public void removeOject(GameObject tempObject){
    object.remove(tempObject);
}

public LinkedList<GameObject> getObject() {
	return object;
}

public void setObject(LinkedList<GameObject> object) {
	this.object = object;
}

public boolean isUp() {
	return up;
}

public void setUp(boolean up) {
	this.up = up;
}

public boolean isDown() {
	return down;
}

public void setDown(boolean down) {
	this.down = down;
}

public boolean isRight() {
	return right;
}

public void setRight(boolean right) {
	this.right = right;
}

public boolean isLeft() {
	return left;
}

public void setLeft(boolean left) {
	this.left = left;
}
public boolean isRun() {
	return run;
}

public void setRun(boolean run) {
	this.run = run;
}




}