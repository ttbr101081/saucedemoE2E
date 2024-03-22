package bdd.step;
import bdd.page.login;
public class loginstep {
    public login logins(){return new login();}
    public void stepIniciarNavegador(String url) {
        logins().iniciarNavegador(url);
    }
    public void  inuser(String user){logins().inuser(user);}
    public void inpass(String password){logins().inpass(password);}
    public void btnlogin(){logins().btlogin();}
    public void esperalogin(){logins().esperLogin();}

}
