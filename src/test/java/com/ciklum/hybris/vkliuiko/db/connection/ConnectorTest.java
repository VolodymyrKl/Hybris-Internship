package com.ciklum.hybris.vkliuiko.db.connection;

import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;

public class ConnectorTest {
    Connector connector = Mockito.mock(Connector.class);

    @Test
    public void shouldReturnConnectToDataBase() throws SQLException {
        Connector.getConnection();
        Mockito.verify(connector);
    }
}