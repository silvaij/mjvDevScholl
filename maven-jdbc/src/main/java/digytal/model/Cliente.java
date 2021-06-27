package digytal.model;

public class Cliente {
    private Integer id;
    private Integer codigo_serial;
    private char pf_pj;
    private String razao_social;
    private String cnpj_cpf;
    private String inscr_estadual_rg;
    private String telefone1;
    private String telefone2;
    private String email;
    private String ativ_profissao;
    private String cep;
    private char estado;
    private String cidade;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String site_instagem;

    public Cliente( Integer codigo_serial,char pf_pj,String razao_social,String cnpj_cpf,String inscr_estadual_rg,String telefone1,String email,String ativ_profissao
    ,String cep,char estado,String cidade,String rua,String numero,String complemento,String bairro,String site_instagem){
        this.codigo_serial = codigo_serial;
        this.pf_pj = pf_pj;
        this.razao_social = razao_social;
        this.cnpj_cpf = cnpj_cpf;
        this.inscr_estadual_rg = inscr_estadual_rg;
        this.telefone1 = telefone1;
        this.email = email;
        this.ativ_profissao = ativ_profissao;
        this.cep = cep;
        this.estado =estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.site_instagem = site_instagem;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo_serial() {
        return codigo_serial;
    }

    public void setCodigo_serial(Integer codigo_serial) {
        this.codigo_serial = codigo_serial;
    }

    public char getPf_pj() {
        return pf_pj;
    }

    public void setPf_pj(char pf_pj) {
        this.pf_pj = pf_pj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getInscr_estadual_rg() {
        return inscr_estadual_rg;
    }

    public void setInscr_estadual_rg(String inscr_estadual_rg) {
        this.inscr_estadual_rg = inscr_estadual_rg;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAtiv_profissao() {
        return ativ_profissao;
    }

    public void setAtiv_profissao(String ativ_profissao) {
        this.ativ_profissao = ativ_profissao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getSite_instagem() {
        return site_instagem;
    }

    public void setSite_instagem(String site_instagem) {
        this.site_instagem = site_instagem;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", codigo_serial=" + codigo_serial +
                ", pf_pj=" + pf_pj +
                ", razao_social='" + razao_social + '\'' +
                ", cnpj_cpf='" + cnpj_cpf + '\'' +
                ", inscr_estadual_rg='" + inscr_estadual_rg + '\'' +
                ", telefone1='" + telefone1 + '\'' +
                ", telefone2='" + telefone2 + '\'' +
                ", email='" + email + '\'' +
                ", ativ_profissao='" + ativ_profissao + '\'' +
                ", cep='" + cep + '\'' +
                ", estado=" + estado +
                ", cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", site_instagem='" + site_instagem + '\'' +
                '}';
    }
}
