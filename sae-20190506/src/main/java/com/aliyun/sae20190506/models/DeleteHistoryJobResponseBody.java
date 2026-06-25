// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteHistoryJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The call was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The call failed.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;msg&quot;: &quot;&quot;,&quot;code&quot;: 200,&quot;success&quot;: true}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</p>
     * </li>
     * <li><p>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <ul>
     * <li><p>success: If the call is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>An error code: If the call fails, an error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the job was deleted. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The job was deleted.</p>
     * </li>
     * <li><p><strong>false</strong>: The job failed to be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteHistoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHistoryJobResponseBody self = new DeleteHistoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHistoryJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteHistoryJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteHistoryJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteHistoryJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHistoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHistoryJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteHistoryJobResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
