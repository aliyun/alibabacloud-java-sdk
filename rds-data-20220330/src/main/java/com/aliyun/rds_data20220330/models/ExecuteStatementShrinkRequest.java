// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ExecuteStatementShrinkRequest extends TeaModel {
    @NameInMap("ContinueAfterTimeout")
    public Boolean continueAfterTimeout;

    @NameInMap("Database")
    public String database;

    @NameInMap("FormatRecordsAs")
    public String formatRecordsAs;

    @NameInMap("IncludeResultMetadata")
    public Boolean includeResultMetadata;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("ResultSetOptions")
    public String resultSetOptionsShrink;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TransactionId")
    public String transactionId;

    public static ExecuteStatementShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementShrinkRequest self = new ExecuteStatementShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementShrinkRequest setContinueAfterTimeout(Boolean continueAfterTimeout) {
        this.continueAfterTimeout = continueAfterTimeout;
        return this;
    }
    public Boolean getContinueAfterTimeout() {
        return this.continueAfterTimeout;
    }

    public ExecuteStatementShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ExecuteStatementShrinkRequest setFormatRecordsAs(String formatRecordsAs) {
        this.formatRecordsAs = formatRecordsAs;
        return this;
    }
    public String getFormatRecordsAs() {
        return this.formatRecordsAs;
    }

    public ExecuteStatementShrinkRequest setIncludeResultMetadata(Boolean includeResultMetadata) {
        this.includeResultMetadata = includeResultMetadata;
        return this;
    }
    public Boolean getIncludeResultMetadata() {
        return this.includeResultMetadata;
    }

    public ExecuteStatementShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public ExecuteStatementShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public ExecuteStatementShrinkRequest setResultSetOptionsShrink(String resultSetOptionsShrink) {
        this.resultSetOptionsShrink = resultSetOptionsShrink;
        return this;
    }
    public String getResultSetOptionsShrink() {
        return this.resultSetOptionsShrink;
    }

    public ExecuteStatementShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public ExecuteStatementShrinkRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteStatementShrinkRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
