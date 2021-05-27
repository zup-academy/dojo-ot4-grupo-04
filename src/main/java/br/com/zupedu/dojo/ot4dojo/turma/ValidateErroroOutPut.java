package br.com.zupedu.dojo.ot4dojo.turma;

public class ValidateErroroOutPut {

    private String erro;
    private String campo;

    public ValidateErroroOutPut(String erro, String campo) {
        this.erro = erro;
        this.campo = campo;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
