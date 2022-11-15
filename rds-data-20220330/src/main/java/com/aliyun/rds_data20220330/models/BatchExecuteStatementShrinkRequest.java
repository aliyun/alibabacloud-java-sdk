// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BatchExecuteStatementShrinkRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("ParameterSets")
    public String parameterSetsShrink;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TransactionId")
    public String transactionId;

    public static BatchExecuteStatementShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExecuteStatementShrinkRequest self = new BatchExecuteStatementShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchExecuteStatementShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public BatchExecuteStatementShrinkRequest setParameterSetsShrink(String parameterSetsShrink) {
        this.parameterSetsShrink = parameterSetsShrink;
        return this;
    }
    public String getParameterSetsShrink() {
        return this.parameterSetsShrink;
    }

    public BatchExecuteStatementShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public BatchExecuteStatementShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public BatchExecuteStatementShrinkRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public BatchExecuteStatementShrinkRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
