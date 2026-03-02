// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatementExecuteResult extends TeaModel {
    /**
     * <p>The error details returned.</p>
     */
    @NameInMap("errorDetails")
    public ErrorDetails errorDetails;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("executeSuccess")
    public Boolean executeSuccess;

    /**
     * <p>The statement that was executed.</p>
     * 
     * <strong>example:</strong>
     * <p>“show create table order”</p>
     */
    @NameInMap("statement")
    public String statement;

    public static SqlStatementExecuteResult build(java.util.Map<String, ?> map) throws Exception {
        SqlStatementExecuteResult self = new SqlStatementExecuteResult();
        return TeaModel.build(map, self);
    }

    public SqlStatementExecuteResult setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }
    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    public SqlStatementExecuteResult setExecuteSuccess(Boolean executeSuccess) {
        this.executeSuccess = executeSuccess;
        return this;
    }
    public Boolean getExecuteSuccess() {
        return this.executeSuccess;
    }

    public SqlStatementExecuteResult setStatement(String statement) {
        this.statement = statement;
        return this;
    }
    public String getStatement() {
        return this.statement;
    }

}
