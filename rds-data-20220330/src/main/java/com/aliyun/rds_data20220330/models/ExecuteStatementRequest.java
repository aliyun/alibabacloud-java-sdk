// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ExecuteStatementRequest extends TeaModel {
    @NameInMap("ContinueAfterTimeout")
    public Boolean continueAfterTimeout;

    @NameInMap("Database")
    public String database;

    @NameInMap("FormatRecordsAs")
    public String formatRecordsAs;

    @NameInMap("IncludeResultMetadata")
    public Boolean includeResultMetadata;

    @NameInMap("Parameters")
    public java.util.List<SqlParameter> parameters;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("ResultSetOptions")
    public ExecuteStatementRequestResultSetOptions resultSetOptions;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("TransactionId")
    public String transactionId;

    public static ExecuteStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementRequest self = new ExecuteStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementRequest setContinueAfterTimeout(Boolean continueAfterTimeout) {
        this.continueAfterTimeout = continueAfterTimeout;
        return this;
    }
    public Boolean getContinueAfterTimeout() {
        return this.continueAfterTimeout;
    }

    public ExecuteStatementRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ExecuteStatementRequest setFormatRecordsAs(String formatRecordsAs) {
        this.formatRecordsAs = formatRecordsAs;
        return this;
    }
    public String getFormatRecordsAs() {
        return this.formatRecordsAs;
    }

    public ExecuteStatementRequest setIncludeResultMetadata(Boolean includeResultMetadata) {
        this.includeResultMetadata = includeResultMetadata;
        return this;
    }
    public Boolean getIncludeResultMetadata() {
        return this.includeResultMetadata;
    }

    public ExecuteStatementRequest setParameters(java.util.List<SqlParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<SqlParameter> getParameters() {
        return this.parameters;
    }

    public ExecuteStatementRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public ExecuteStatementRequest setResultSetOptions(ExecuteStatementRequestResultSetOptions resultSetOptions) {
        this.resultSetOptions = resultSetOptions;
        return this;
    }
    public ExecuteStatementRequestResultSetOptions getResultSetOptions() {
        return this.resultSetOptions;
    }

    public ExecuteStatementRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public ExecuteStatementRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteStatementRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public static class ExecuteStatementRequestResultSetOptions extends TeaModel {
        @NameInMap("DecimalReturnType")
        public String decimalReturnType;

        @NameInMap("LongReturnType")
        public String longReturnType;

        public static ExecuteStatementRequestResultSetOptions build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementRequestResultSetOptions self = new ExecuteStatementRequestResultSetOptions();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementRequestResultSetOptions setDecimalReturnType(String decimalReturnType) {
            this.decimalReturnType = decimalReturnType;
            return this;
        }
        public String getDecimalReturnType() {
            return this.decimalReturnType;
        }

        public ExecuteStatementRequestResultSetOptions setLongReturnType(String longReturnType) {
            this.longReturnType = longReturnType;
            return this;
        }
        public String getLongReturnType() {
            return this.longReturnType;
        }

    }

}
