package com.baidu.duer.dcs.sample.sdk.commands;

public class BaseCommand {
    //【雪之梦】/【月光曲】/【梦中的婚礼】
    public String[] musics = new String[]{"Bandari.mp3", "Bandari2.mp3", "RichardClayderman.mp3"};
    public String command;
    public static int current = 0;

    public String getCommend() {

        if ("上一首".equalsIgnoreCase(command)) {
            switch (current) {
                case 0:
                    current = 2;
                    break;
                default:
                    --current;
                    break;
            }
        } else if ("下一首".equalsIgnoreCase(command)) {
            switch (current) {
                case 2:
                    current = 0;
                    break;
                default:
                    ++current;
            }
        } else if ("暂停".equalsIgnoreCase(command)) {
            return "暂停";
        } else if ("雪之梦".equalsIgnoreCase(command)) {
            return musics[0];
        } else if ("月光曲".equalsIgnoreCase(command)) {
            return musics[1];
        } else if ("梦中的婚礼".equalsIgnoreCase(command)) {
            return musics[2];
        }
        return musics[current];
    }
}
