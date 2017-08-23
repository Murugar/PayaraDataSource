
package com.iqmsoft.payaramicro.datasource;

import org.glassfish.api.jdbc.SQLTraceListener;
import org.glassfish.api.jdbc.SQLTraceRecord;


public class SQLTracer implements SQLTraceListener {

    @Override
    public void sqlTrace(SQLTraceRecord sqltr) {
        System.out.println("*** Tracer got record for " +sqltr.getMethodName());
    }
    
}
