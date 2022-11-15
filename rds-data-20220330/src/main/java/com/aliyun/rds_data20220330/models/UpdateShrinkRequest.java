// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class UpdateShrinkRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("Filter")
    public String filterShrink;

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

    public static UpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShrinkRequest self = new UpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public UpdateShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public UpdateShrinkRequest setRecordShrink(String recordShrink) {
        this.recordShrink = recordShrink;
        return this;
    }
    public String getRecordShrink() {
        return this.recordShrink;
    }

    public UpdateShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public UpdateShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public UpdateShrinkRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public UpdateShrinkRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
