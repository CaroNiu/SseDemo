package com.sse.ssedemo.test;

import java.util.Random;

public class RandomTextGenerator {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int minLength = 15;
            int maxLength = 100;

            // 随机生成汉字短语
            String randomChinesePhrase = generateRandomChinesePhrase(minLength, maxLength);

            // 输出结果
            System.out.println("随机生成的汉字短语: " + randomChinesePhrase);
        }
    }

    private static String generateRandomChinesePhrase(int minLength, int maxLength) {
        Random random = new Random();
        int phraseLength = random.nextInt(maxLength - minLength + 1) + minLength;

        StringBuilder phraseBuilder = new StringBuilder();

        for (int i = 0; i < phraseLength; i++) {
            char randomSimplifiedChineseChar = generateRandomSimplifiedChineseChar();
            phraseBuilder.append(randomSimplifiedChineseChar);
        }

        return phraseBuilder.toString();
    }

    private static char generateRandomSimplifiedChineseChar() {
        // 常用简体字的Unicode范围
        int start = 0x4e00;
        int end = 0x9fff;

        Random random = new Random();
        return (char) (start + random.nextInt(end - start + 1));
    }
}