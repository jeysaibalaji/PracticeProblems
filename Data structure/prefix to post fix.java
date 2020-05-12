class prefix to postfix
{
string expr;
string ans;
public void getinput()
{
system.out.println("entere a prefix expression");
scanner kb = new scanner(system.in);
expr=kb.next();
}
public boolean is a operator(char symbol);
{
 switch(symbol)
 {
 case '+': return true;
 case '-':return true;
 case '*':return true;
 case '/':return true;
 case '$':return true;
 case '^':return true;
 }
 return false;
 }
 public void convPreToPost()
 {
 stack<string>stk=new stack<string>();
 for(inti=expr.length()-1;i>=0;--i)
 {
 char symbol = expr.charAt(i);
 if(! is opreator(symbol))
 {
 stk.push(symbol);
 }
 else
 {
 string opnd1=stk.pop();
 string opnd2 = stk.pop();
 string temp = opnd1+opnd2+ symbol;
 stk.push(temp);
 }
 }
 ans=stk.pop();
 }
 public void display()
 {
 system.out.printin("postfix expe equivalent of given prefix is: +ans");
 }
 }
 
 
 
 

