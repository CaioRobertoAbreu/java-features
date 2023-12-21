package br.com.caio.javafeatures.instance_of;

import java.util.Random;

public class InstanceOf {

    public static void main(String[] args) {

        var random = new Random();
        FileInterface file;

        for(int i = 0; i < 100; i++){
            if (random.nextInt(1, 3) == 1)
                file = new VideoFile();
            else
                file = new MusicFile();

            if (file instanceof MusicFile) {
                var musicFile = (MusicFile) file;
                musicFile.play();
            } else {
                System.out.println("value is not music");
            }

            /**
             * @implNote new version
             *
             */
            if (file instanceof MusicFile newFileTypeMusicFile)
                newFileTypeMusicFile.play();
        }
    }
}
