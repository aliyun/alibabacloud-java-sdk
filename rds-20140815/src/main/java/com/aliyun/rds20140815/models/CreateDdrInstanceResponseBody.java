// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceResponseBody extends TeaModel {
    /**
     * <p>The endpoint of the new instance.</p>
     * <blockquote>
     * <p>The <strong>DBInstanceNetType</strong> parameter determines whether this endpoint is an internal endpoint or a public endpoint.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID of the new instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2038691****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The port of the new instance.</p>
     * <blockquote>
     * <p>The <strong>DBInstanceNetType</strong> parameter determines whether this port is an internal port or a public port.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E52666CC-330E-418A-8E5B-A19E3FB42D13</p>
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
