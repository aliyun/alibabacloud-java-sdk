// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExecuteSqlStatementResponseBody extends TeaModel {
    /**
     * <p>The result of the SQL statement execution for metadata.</p>
     */
    @NameInMap("data")
    public SqlStatementExecuteResult data;

    /**
     * <ul>
     * <li><p>If \<code>success\\</code> is \<code>false\\</code>, an error code is returned.</p>
     * </li>
     * <li><p>If \<code>success\\</code> is \<code>true\\</code>, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li><p>If \<code>success\\</code> is \<code>false\\</code>, an error message is returned.</p>
     * </li>
     * <li><p>If \<code>success\\</code> is \<code>true\\</code>, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The status code. The value is always 200. Use the \<code>success\\</code> parameter to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteSqlStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlStatementResponseBody self = new ExecuteSqlStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlStatementResponseBody setData(SqlStatementExecuteResult data) {
        this.data = data;
        return this;
    }
    public SqlStatementExecuteResult getData() {
        return this.data;
    }

    public ExecuteSqlStatementResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExecuteSqlStatementResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecuteSqlStatementResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ExecuteSqlStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteSqlStatementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
