package lesson7.Tours;

public class Tour {
    private int id;
    private String[] countries = new String[15];
    private int days;
    private String typeOfTransport;
    private int stars;
    private int price;
    private String service;

    public Tour() {

    }

    public Tour(int id, int days, String typeOfTransport, int stars, int price, String service) {
        this.id = id;
        this.days = days;
        this.typeOfTransport = typeOfTransport;
        this.stars = stars;
        this.price = price;
        this.service = service;
    }

    public void addCountry(String country) {
        // Цель - добавить в массив со странами В ПЕРВУЮ СВОБОДНУЮ ЯЧЕЙКУ данную страну
        // {"Италия", null, null, null, null, null, null, null, null, null, null, null, null, null, null}

        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = country;
                break;
            }
        }
    }

    /**
     * На все поля сделать методы set
     * На все поля сделать методы get (вернуть значение поля)
     */

}
