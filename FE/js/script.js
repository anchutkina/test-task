let url = new URL('http://localhost:8080/api/v1/currency');
let currencies;
url.searchParams.set('usedb', false)
fetch(url)
  .then(response => response.json())
  .then(data => currencies = data);

let btnGet = document.querySelector('button');
let myTable = document.querySelector('#table');

let headers = ['id','Short Name', 'Date', 'Name', 'Country', 'Move', 'Amount', 'ValBuy', 'ValSell', 'ValMid', 'CurrBuy', 'CurrSell', 'CurrMid', 'Version', 'CnbMid', 'EcbMid'];
btnGet.addEventListener('click', () => {
  let table = document.createElement('table');
  let headerRow = document.createElement('tr');

  headers.forEach(headerText => {
    let header = document.createElement('th');
    let textNode = document.createTextNode(headerText);
    header.appendChild(textNode);
    headerRow.appendChild(header);
  });
  table.appendChild(headerRow);

  currencies.forEach(emp => {
    let row = document.createElement('tr');

    Object.values(emp).forEach(text => {
      let cell = document.createElement('td');
      let textNode = document.createTextNode(text);
      cell.appendChild(textNode);
      row.appendChild(cell);
    });

    table.appendChild(row);
  });
  myTable.appendChild(table);
});
