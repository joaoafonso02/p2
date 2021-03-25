public class Contacto {
  private String nome;
  private String telefone;
  private String eMail;


public Contacto(String name, String phone) {
  nome = name;
  telefone = phone;
}

public Contacto(String name, String phone, String mail) {
  nome = name;
  telefone = phone;
  eMail = mail;
}

public String nome(){ return nome.toUpperCase(); }
public String telefone(){ return telefone; }
public String eMail(){ return eMail; }
}
