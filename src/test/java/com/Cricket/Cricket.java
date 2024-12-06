package com.Cricket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Cricket {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> teams= driver.findElements(By.xpath("//a[@class='cb-text-link']//div[@class='cb-col cb-col-84']"));
        List<WebElement> scores = driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td text-bold']"));
        for (int i = 0; i < scores.size(); i++)
        {
            int points = Integer.parseInt(scores.get(i).getText());
            if(points>=9) {
                System.out.println(teams.get(i).getText());
            }
        }

    }
        }






