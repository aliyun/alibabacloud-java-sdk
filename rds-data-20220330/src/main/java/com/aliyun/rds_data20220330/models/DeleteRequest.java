// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class DeleteRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Filter")
    public java.util.Map<String, Selector> filter;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Table")
    public String table;

    @NameInMap("TransactionId")
    public String transactionId;

    public static DeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRequest self = new DeleteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DeleteRequest setFilter(java.util.Map<String, Selector> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, Selector> getFilter() {
        return this.filter;
    }

    public DeleteRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public DeleteRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public DeleteRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public DeleteRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
