// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertListShrinkRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Records")
    public String recordsShrink;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Table")
    public String table;

    @NameInMap("TransactionId")
    public String transactionId;

    public static InsertListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertListShrinkRequest self = new InsertListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertListShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public InsertListShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

    public InsertListShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public InsertListShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public InsertListShrinkRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public InsertListShrinkRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
