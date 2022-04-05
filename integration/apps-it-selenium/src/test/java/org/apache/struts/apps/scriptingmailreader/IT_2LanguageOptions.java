/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.struts.apps.scriptingmailreader;

// Generated by Selenium IDE
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Visitors can select a supported language and browse the site in that language.
 *
 * @author Stefan Graff
 * @since 1.3.11
 */
@TestMethodOrder(MethodName.class)
public class IT_2LanguageOptions {
  private WebDriver driver;
  private String home;

  @BeforeEach
  public void setUp() {
    driver = WebDriverManager.getInstance().create();
    home = "http://localhost:"
            + System.getProperty("cargo.servlet.port")
            + "/struts-scripting-mailreader/";
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test21LanguageOptionsJapanese() {
    // Test name: 2_1_Language Options (Japanese)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/Welcome.do | 
    // Open welcome action
    driver.get(home + "Welcome.do");
    // 2 | verifyTitle | MailReader Demonstration Application | 
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
    // 3 | click | linkText=Japanese | 
    // Change language (Japanese)
    driver.findElement(By.linkText("Japanese")).click();
    // 4 | verifyTitle | MailReaderデモアプリケーション | 
    // Welcome page title (Japanese)
    assertEquals("MailReaderデモアプリケーション", driver.getTitle());
    // 5 | click | linkText=MailReaderデモアプリケーション - ユーザ登録 | 
    // Click Register (Japanese)
    driver.findElement(By.linkText("MailReaderデモアプリケーション - ユーザ登録")).click();
    // 6 | verifyTitle | MailReaderデモアプリケーション - ユーザ登録 | 
    // Registration page title (Japanese)
    assertEquals("MailReaderデモアプリケーション - ユーザ登録", driver.getTitle());
    // 7 | click | linkText=MailReaderデモアプリケーション | 
    // Click Welcome (Japanese)
    driver.findElement(By.linkText("MailReaderデモアプリケーション")).click();
    // 8 | verifyTitle | MailReaderデモアプリケーション | 
    // Welcome page title (Japanese)
    assertEquals("MailReaderデモアプリケーション", driver.getTitle());
    // 9 | click | linkText=MailReaderデモアプリケーション - ログオン | 
    // Click Logon (Japanese)
    driver.findElement(By.linkText("MailReaderデモアプリケーション - ログオン")).click();
    // 10 | verifyTitle | MailReaderデモアプリケーション - ログオン | 
    // Logon page title (Japanese)
    assertEquals("MailReaderデモアプリケーション - ログオン", driver.getTitle());
    // 11 | click | linkText=MailReaderデモアプリケーション | 
    // Click Welcome (Japanese)
    driver.findElement(By.linkText("MailReaderデモアプリケーション")).click();
    // 12 | verifyTitle | MailReaderデモアプリケーション | 
    // Welcome page title (Japanese)
    assertEquals("MailReaderデモアプリケーション", driver.getTitle());
    // 13 | click | linkText=English | 
    // Change language (English)
    driver.findElement(By.linkText("English")).click();
    // 14 | verifyTitle | MailReader Demonstration Application | 
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
  }
  @Test
  public void test22LanguageOptionsRussian() {
    // Test name: 2_2_Language Options (Russian)
    // Step # | name | target | value
    // 1 | open | struts-mailreader/Welcome.do | 
    // Open welcome action
    driver.get(home + "Welcome.do");
    // 2 | verifyTitle | MailReader Demonstration Application | 
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
    // 3 | click | linkText=Russian | 
    // Change language (Russian)
    driver.findElement(By.linkText("Russian")).click();
    // 4 | verifyTitle | Демонстрационное приложение 'Чтение почты' | 
    // Welcome page title (Russian)
    assertEquals("Демонстрационное приложение \'Чтение почты\'", driver.getTitle());
    // 5 | click | linkText=Зарегистрироваться | 
    // Click Register (Russian)
    driver.findElement(By.linkText("Зарегистрироваться")).click();
    // 6 | verifyTitle | Зарегистрироваться | 
    // Registration page title (Russian)
    assertEquals("Зарегистрироваться", driver.getTitle());
    // 7 | click | linkText=Демонстрационное приложение 'Чтение почты' | 
    // Click Welcome (Russian)
    driver.findElement(By.linkText("Демонстрационное приложение \'Чтение почты\'")).click();
    // 8 | verifyTitle | Демонстрационное приложение 'Чтение почты' | 
    // Welcome page title (Russian)
    assertEquals("Демонстрационное приложение \'Чтение почты\'", driver.getTitle());
    // 9 | click | linkText=Войти как зарегистрированный пользователь | 
    // Click Logon (Russian)
    driver.findElement(By.linkText("Войти как зарегистрированный пользователь")).click();
    // 10 | verifyTitle | Демонстрационное приложение Чтение почты - Проверка имени и пароля. | 
    // Logon page title (Russian)
    assertEquals("Демонстрационное приложение Чтение почты - Проверка имени и пароля.", driver.getTitle());
    // 11 | click | linkText=Демонстрационное приложение 'Чтение почты' | 
    // Click Welcome (Russian)
    driver.findElement(By.linkText("Демонстрационное приложение \'Чтение почты\'")).click();
    // 12 | verifyTitle | Демонстрационное приложение 'Чтение почты' | 
    // Welcome page title (Russian)
    assertEquals("Демонстрационное приложение \'Чтение почты\'", driver.getTitle());
    // 13 | click | linkText=English | 
    // Change language (English)
    driver.findElement(By.linkText("English")).click();
    // 14 | verifyTitle | MailReader Demonstration Application | 
    // Welcome page title
    assertEquals("MailReader Demonstration Application", driver.getTitle());
  }

  /**
   * For JDK 1.7 compatibility
   * <em>Assert</em> that {@code expected} and {@code actual} are equal.
   * <p>If both are {@code null}, they are considered equal.
   *
   * @see Object#equals(Object)
   */
  private static void assertEquals(Object expected, Object actual) {
    Assertions.assertEquals(expected, actual);
  }
}