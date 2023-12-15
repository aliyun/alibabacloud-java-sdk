// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceResponseBody extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the destination instance.</p>
     * <br>
     * <p>>  The **DBInstanceNetType** parameter indicates whether the endpoint is internal or public.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The destination instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The port number that is used to connect to the destination instance.</p>
     * <br>
     * <p>> **DBInstanceNetType** indicates whether the port is internal or public.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDdrInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceResponseBody self = new CreateDdrInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDdrInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDdrInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDdrInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDdrInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
