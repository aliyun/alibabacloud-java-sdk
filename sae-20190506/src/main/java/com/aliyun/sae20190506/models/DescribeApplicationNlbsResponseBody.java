// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationNlbsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
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
     * <p>The status code. Value values:</p>
     * <ul>
     * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. Valid values:If the request was successful, success is returned. If the request failed, an error code is returned.</p>
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
     * <p>Indicates whether the NLB instance was successfully associated with the application. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The application was associated.</li>
     * <li><strong>false</strong>: The application failed to be associated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
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
         * <p>The details of the instance.</p>
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
