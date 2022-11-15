// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class InsertShrinkRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Record")
    public String recordShrink;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Table")
    public String table;

    @NameInMap("TransactionId")
    public String transactionId;

    public static InsertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertShrinkRequest self = new InsertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public InsertShrinkRequest setRecordShrink(String recordShrink) {
        this.recordShrink = recordShrink;
        return this;
    }
    public String getRecordShrink() {
        return this.recordShrink;
    }

    public InsertShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public InsertShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public InsertShrinkRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public InsertShrinkRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
