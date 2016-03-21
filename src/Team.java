/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1
 */
public class Team{

    private String nama;
    private String team;
    private int umur;
    private int nilaiPenampilan;
    private int nilaiSuara;
    private int nilaiAttitude;
    
    
    public void setName(String nama){
        this.nama = nama;
    }
    public void setTeam (String team){
        this.team = team;
    }
    public void setUmur (int umur){
        this.umur = umur;
    }
    public void setPenampilan (int nilaiPenampilan){
        this.nilaiPenampilan = nilaiPenampilan;
    }
    public void setSuara (int nilaiSuara){
        this.nilaiSuara = nilaiSuara;
    }
    public void setAttitude (int nilaiAttitude){
        this.nilaiAttitude = nilaiAttitude;
    }
    
    public String getName (){
        return nama;
    }
    public String getTeam (){
        return team;
    }
    public int getUmur (){
        return umur;
    }
    public int getNilai (){
        int nilai = (nilaiPenampilan + nilaiSuara + nilaiAttitude)/3;
        return nilai;
    }
    
}
