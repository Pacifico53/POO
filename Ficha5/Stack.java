import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Stack
{
    private ArrayList<String> stack;
    /**
     * Constructor vazio
     */
    public Stack()
    {
        stack = new ArrayList<>();
    }
    /**
     * Constructor copia
     */
    public Stack(Stack o)
    {
        stack = o.getStack();
    }
    /**
     * Constructor parameterizado
     */
    public Stack(ArrayList<String>s)
    {
        stack = new ArrayList<>(s.size());
        for(String str:s){
            stack.add(str);
        }
    }
    public ArrayList<String> getStack(){
        return this.stack;
    }
    public void setStack(ArrayList<String>s){
        stack = new ArrayList<>(s.size());
        for(String str:s){
            stack.add(str);
        }
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(this.getClass() != o.getClass())
        return false;
        Stack s = (Stack) o;
        return stack.equals(s.getStack());
    }
    public Stack clone(){
        return new Stack(this);
    }
    public String toString(){
        return "Stack" + stack.toString();
    }
    public String top(){
        return stack.get(stack.size()-1);
    }
    public void push(String s){
        stack.add(s);
    }
    public void pop(){
        if(stack.isEmpty())
            stack.remove(stack.size()-1);
    }
    public boolean empty(){
        return stack.isEmpty();
    }
    public int length(){
        return stack.size();
    }
}