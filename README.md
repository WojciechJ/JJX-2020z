# Projekty i zadania zaliczeniowe z przedmiotu "Java oraz JSON i XML"

## Warunki zaliczenia

Projekt 1 (JAVA) - 40pkt

Projekt 2 (JAVA) - 40pkt

Zadanie 1 (XML) - 20pkt

Zadanie 2 (XML) - 20pkt


## Projekt 1

### Opis projektu
Stworzenie programu, który będzie tworzyć listy mieszkańców i zapisywać je do pliku.

Użytkownik podaje korzystając z konsoli nazwę miasta i w kolejnej linii imię, nazwisko i numer PESEL mieszkańca. Numer PESEL powinien być sprawdzany względem poprawności - co najmniej w zakresie sumy kontrolnej ostatniej cyfry.  [https://pl.wikipedia.org/wiki/PESEL](https://pl.wikipedia.org/wiki/PESEL)

W przypadku złego numeru PESEL podany wpis nie jest zapisywany do pliku a użytkownik otrzymuje komunikat o błędzie.

Każde uruchomienie tworzy nowy plik odpowiedzi (program nie odczytuje żadnych danych).

W przypadku podania dwa razy tego samego numeru PESEL a innego imienia i nazwiska wpis jest nadpisywany.

Napisz co najmniej 2 testy do danych klas - co najmniej dla metody sprawdzającej poprawność numeru PESEL oraz dla jakiejś innej klasy z twojego projektu.

**Punktacja:**
Poprawne wejście (4 pkt.)
Poprawny zapis do pliku (6 pkt.)
Poprawne sprawdzanie PESELu (6 pkt.)
Poprawne testy (4 pkt.)
## Zadanie 1

Stworzyć następujący plik XSD a następnie przykładowy plik XML, który jest poprawnie wypełniony (należy wypełnić wszystkie pola).

Na uniwersytecie przechowywane są informacje dotyczące wydziałów. Dokumenty są w formacie XML. Każdy wydział ma unikalne id (xsd:ID). Dodatkowo wydział posiada nazwę oraz dowolną liczbę adresów.

Na wydziale zatrudnieni są pracownicy. Pracowników należy wdrożyć jako typ złożony. Pracownicy danego wydziału potrzebują jednego unikalnego id. Ponadto każdy pracownik posiada imię, nazwisko, tytuł i kategorię. Imię i nazwisko pracowników jest obowiązkowe, tytuł nie jest konieczny. Mamy do wyboru 3 kategorie pracowników: „naukowy”, „administracyjny” lub „techniczny”.

Każdy pracownik posiada adres. Adres musi być zaimplementowany jako typ złożony. Ulica, numer, kod pocztowy i miejscowość muszą być zapisywane w określonej kolejności. Pracownik musi mieć przypisany co najmniej jeden adres.

Wydział oferuje również zbiór przedmiotów dla studentów. Każdy przedmiot posiada unikalny kod przedmiotu. Ma także nazwę, opis oraz liczbę uczestników. Przedmiot będzie anulowany, jeśli zapisze się na niego mniej niż 6 studentów lub więcej niż 400 ze względu na maksymalną pojemność dostępnej sali wykładowej. Przedmiot będzie nauczany przez co najmniej jednego pracownika. Należy zapewnić, że będzie to pracownik już zdefinowany (xsd:IDREF).

## Zadanie 2

apisz arkusz stylów Poeci.xsl dla pliku  **Poeci.xml** Wszystkie pojawiające się elementy powinny być  sformatowane. Ponadto należy stworzyć nagłówek o nazwie „Zbiór wierszy” pojawiający się na  początku wygenerowanego dokumentu.

