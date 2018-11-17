
package daoAccessors;

import javax.sql.DataSource;

public abstract class DatabaseDatasourceAccessor {
    public DataSource load() {
        return null;
    }
    public abstract String getHost();
    public abstract int getPort();
}
