import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://production.contosotraders.com/');
  await page.getByPlaceholder('Search by product name or').click();
  await page.getByRole('link', { name: 'Mobiles' }).click();
  await page.getByRole('banner').getByRole('link').click();
  await page.locator('.courousel-style > div > div:nth-child(2)').first().click();
  await page.locator('.courousel-style > div > div:nth-child(2)').first().click();
  await page.getByRole('button', { name: 'All Categories' }).click();
  await page.locator('#customized-menu').getByText('Laptops').click();
  await page.getByRole('heading', { name: '$254.00' }).click();
  await page.getByRole('button', { name: '+' }).click();
  await page.getByText('Microsoft Surface Laptop 4 AMD Ryzen 5 4680U 13.5 inches$254.00$299.0015%').click();
  await page.getByRole('button', { name: 'Add To Bag' }).click();
  await page.getByRole('banner').getByRole('link').click();
  await page.locator('header').filter({ hasText: 'Login1' }).getByRole('link').click();
  await page.getByRole('link', { name: 'Laptops' }).first().click();
  await page.getByRole('img', { name: 'Microsoft Surface Laptop 4' }).click();
  await page.getByText('$254.00').click();
});