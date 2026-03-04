package Threads;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://www.example.com",
                "https://www.openai.com"
        );

        int count = 1;
        for (String url : urls) {
            Thread thread = new Thread(new URLFetcherThread(url));
            thread.setName("FetcherThread-" + count);
            thread.start();
            count++;
        }

        System.out.println("Main thread continues processing multiple URLs...");
    }
}