// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Record")
    public java.util.Map<String, ?> record;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Table")
    public String table;

    @NameInMap("TransactionId")
    public String transactionId;

    public static InsertRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRequest self = new InsertRequest();
        return TeaModel.build(map, self);
    }

    public InsertRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public InsertRequest setRecord(java.util.Map<String, ?> record) {
        this.record = record;
        return this;
    }
    public java.util.Map<String, ?> getRecord() {
        return this.record;
    }

    public InsertRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public InsertRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public InsertRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public InsertRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
