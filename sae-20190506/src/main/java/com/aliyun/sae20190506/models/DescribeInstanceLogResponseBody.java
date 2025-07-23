// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogResponseBody extends TeaModel {
    /**
     * <p>The interface state or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information of instance logs.</p>
     * 
     * <strong>example:</strong>
     * <p>hello\nsae\n</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Error code.</p>
     * <ul>
     * <li><p>No error code returned if the request succeeded.</p>
     * </li>
     * <li><p>Error code returned if the request failed. Refer to error code list below for details.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <p>success is returned when the request succeeds.
     * An error code is returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the logs of the instance is obtained.</p>
     * <ul>
     * <li><p>true: logs obtained.</p>
     * </li>
     * <li><p>false: failed to obtain logs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogResponseBody self = new DescribeInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceLogResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeInstanceLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeInstanceLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceLogResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
