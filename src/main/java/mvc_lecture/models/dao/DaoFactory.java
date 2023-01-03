package mvc_lecture.models.dao;

public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ArrayListProducts();
        }

        return productsDao;
    }
}
