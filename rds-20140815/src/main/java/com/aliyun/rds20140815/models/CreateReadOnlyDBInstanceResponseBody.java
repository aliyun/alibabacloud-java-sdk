// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReadOnlyDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The internal endpoint that is used to connect to the read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rr-****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rr-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>10078937****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The internal port number that is used to connect to the read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateReadOnlyDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyDBInstanceResponseBody self = new CreateReadOnlyDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateReadOnlyDBInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateReadOnlyDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateReadOnlyDBInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateReadOnlyDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
