import java.util.Scanner;
 
public class App {
    public static void main(String...s){
        String message, encryptedMessage = "";
        int key;
        char ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a message: ");
        message = scan.nextLine();
        
        System.out.println("Enter key: ");
        key = scan.nextInt();
 
        for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);
            
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);
                
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                
                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);
                
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }
                
                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        
        System.out.println("Encrypted Message = " + encryptedMessage);
    }
}