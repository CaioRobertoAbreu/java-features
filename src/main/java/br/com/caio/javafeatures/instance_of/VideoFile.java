package br.com.caio.javafeatures.instance_of;

public class VideoFile implements FileInterface{
    @Override
    public void play() {
        System.out.println("play video");
    }
}
