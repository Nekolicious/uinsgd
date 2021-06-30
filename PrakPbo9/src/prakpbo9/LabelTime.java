/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author SaharasuP
 */
public class LabelTime extends JLabel implements ActionListener {

    private SimpleDateFormat format;
    private Timer timer;
    private Date date;

    public LabelTime() {
        timer = new Timer(1000, this);
        format = new SimpleDateFormat("dd MMMM yyyy HH:m:ss");
        date = new Date();
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        date.setTime(System.currentTimeMillis());
        this.setText(format.format(date));
    }
    
    public String getWaktu() {
        return format.format(date);
    }

}
