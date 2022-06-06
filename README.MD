# Testing project on ikea.lt website
## Setup
### Packages used

- TestNG
- Selenium
- WebDriverManager

### Website used for testing
<a href="https://www.ikea.lt/">Ikea.lt</a>
## Test cases:
### Test nr. 1 -  Test or item added to the cart

Testing <a href="https://www.ikea.lt/">website</a>
1. Enter item words in the search box
2. Click the search button
3. Click on the item
4. Click add to cart button
5. Check or item added in the cart (expected message equal actual message). Test passed.

### Test nr. 2 -  Test or item deleted from the cart

Testing <a href="https://www.ikea.lt/">website</a>

1. Enter item words in the search box
2. Click the search button
3. Click on the item
4. Click add to cart button
5. Click check item to cart button
6. Click delete item
7. Check or item deleted from the cart (expected message equal actual message). Test passed.

### Test nr. 3 -  Test or possible to loggIn with valid data

Testing <a href="https://www.ikea.lt/lt/client">website</a>
1. Enter email
2. Enter password
3. Click the Login button
4. Check or logging in with valid data (expected message equal actual message). Test passed.

### Test nr. 4 -  Test or possible to order e. discount card

Testing <a href="https://www.ikea.lt/lt/client/quickfamily">website</a>
1. Enter email
2. Click the Order discount card button
3. Check or discount card  is ordered (expected message equal actual message). Test passed.

### Test nr. 5 -  Test or show stock information

Testing <a href="https://www.ikea.lt/lt/products/valgomasis/valgomojo-stalai/stalai">website</a>
1. Click on the item
2. Click on the Stock information button
3. Check or show stock information (expected message equal actual message). Test passed.