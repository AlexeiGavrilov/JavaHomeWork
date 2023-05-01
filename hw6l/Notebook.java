public class Notebook {
    String brand;
    String color;
    
    
    public Notebook(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Laptop {brand = %s, color = %s}", brand, color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (brand != other.brand)
            return false;
        if (color != other.color)
            return false;
        return true;
    }
    public void showInfo(){
        System.out.println(String.format("Brand: %s\nЦвет: %s\n",this.brand,this.color));
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    
}
