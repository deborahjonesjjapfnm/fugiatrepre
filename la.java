Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.id("element-id"));
actions.moveToElement(element).click().perform();
