/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obe;

import javax.inject.Named;
/*import javax.enterprise.context.SessionScoped;*/
import java.io.Serializable;
import javax.faces.bean.SessionScoped;
import mail.sendMenssage;

/**
 *
 * @author Vane
 */
@Named(value = "envio")
@SessionScoped
public class envio implements Serializable {

    sendMenssage envio = new sendMenssage();
    /**
     * Creates a new instance of envio
     */
    public envio() {
    }
    
    public void enviomensaje()
    {
        envio.SendMail();
    }
}
