// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class UpdateRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Filter")
    public java.util.Map<String, Selector> filter;

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

    public static UpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRequest self = new UpdateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public UpdateRequest setFilter(java.util.Map<String, Selector> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, Selector> getFilter() {
        return this.filter;
    }

    public UpdateRequest setRecord(java.util.Map<String, ?> record) {
        this.record = record;
        return this;
    }
    public java.util.Map<String, ?> getRecord() {
        return this.record;
    }

    public UpdateRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public UpdateRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public UpdateRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public UpdateRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
