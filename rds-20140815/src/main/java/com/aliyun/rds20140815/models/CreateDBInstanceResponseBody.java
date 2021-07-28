// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public Boolean dryRunResult;

    @NameInMap("TagResult")
    public Boolean tagResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Port")
    public String port;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setDryRunResult(Boolean dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public Boolean getDryRunResult() {
        return this.dryRunResult;
    }

    public CreateDBInstanceResponseBody setTagResult(Boolean tagResult) {
        this.tagResult = tagResult;
        return this;
    }
    public Boolean getTagResult() {
        return this.tagResult;
    }

    public CreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDBInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
