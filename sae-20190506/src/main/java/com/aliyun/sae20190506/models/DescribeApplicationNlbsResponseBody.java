// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationNlbsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationNlbsResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidApplication.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. If the request is successful, success is returned. If the request fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the binding is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The binding is successful.</li>
     * <li><strong>false</strong>: The binding failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The trace ID used to query call details.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationNlbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationNlbsResponseBody self = new DescribeApplicationNlbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationNlbsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationNlbsResponseBody setData(DescribeApplicationNlbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationNlbsResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationNlbsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationNlbsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationNlbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationNlbsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeApplicationNlbsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationNlbsResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instances")
        public java.util.Map<String, DataInstancesValue> instances;

        public static DescribeApplicationNlbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationNlbsResponseBodyData self = new DescribeApplicationNlbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationNlbsResponseBodyData setInstances(java.util.Map<String, DataInstancesValue> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.Map<String, DataInstancesValue> getInstances() {
            return this.instances;
        }

    }

}
