// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BatchExecuteStatementRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("ParameterSets")
    public java.util.List<java.util.List<SqlParameter>> parameterSets;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TransactionId")
    public String transactionId;

    public static BatchExecuteStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExecuteStatementRequest self = new BatchExecuteStatementRequest();
        return TeaModel.build(map, self);
    }

    public BatchExecuteStatementRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public BatchExecuteStatementRequest setParameterSets(java.util.List<java.util.List<SqlParameter>> parameterSets) {
        this.parameterSets = parameterSets;
        return this;
    }
    public java.util.List<java.util.List<SqlParameter>> getParameterSets() {
        return this.parameterSets;
    }

    public BatchExecuteStatementRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public BatchExecuteStatementRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public BatchExecuteStatementRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public BatchExecuteStatementRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
