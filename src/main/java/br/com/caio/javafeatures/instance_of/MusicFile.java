package br.com.caio.javafeatures.instance_of;

public class MusicFile implements FileInterface{
    @Override
    public void play() {
        System.out.println("play music");
    }
}
