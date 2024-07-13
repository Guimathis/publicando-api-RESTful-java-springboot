package API.RESTful.java.domain.model;

import jakarta.persistence.*;



@Entity(name = "tb_socials")
public class WebSocials {
    @Id
    private String instagram;
    @Column(unique = true)
    private String whatsapp;

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
