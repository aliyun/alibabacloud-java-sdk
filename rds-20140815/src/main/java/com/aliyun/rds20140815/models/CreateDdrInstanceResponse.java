// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 新实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 订单ID。; 
    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    // description: 新实例连接地址。>参数**DBInstanceNetType**决定该地址为内网或外网。; 
    @NameInMap("ConnectionString")
    @Validation(required = true)
    public String connectionString;

    // description: 新实例连接端口。>参数**DBInstanceNetType**决定该端口为内网端口或外网端口。; 
    @NameInMap("Port")
    @Validation(required = true)
    public String port;

    public static CreateDdrInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceResponse self = new CreateDdrInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDdrInstanceResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDdrInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDdrInstanceResponse setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDdrInstanceResponse setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
