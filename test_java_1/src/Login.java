import data.UserData;

public class Login {
    public static void main(String[] args) {
        userLogin("KokoRuyuk", "ayamayam");
        userLogin("KokoRuyu1k", "ayamayam");
        userLogin("TaraKing", "kungKing123");
    }

    public static void userLogin(String uname, String pass){
        boolean isLogin = false;
        for (String[] dataUser1 : UserData.dataUser) {
            if ((dataUser1[1].equals(uname)) && (dataUser1[2].equals(pass))) {
                isLogin = true;
                System.out.println("Hello " + dataUser1[0] + " !");
                break;
            }
        }
        if(!isLogin){
            System.out.println("Username atau Password SALAH");
        }
        
    }
}
