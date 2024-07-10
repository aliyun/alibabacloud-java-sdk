// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the specified applications are stopped. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the change order.</p>
     */
    @NameInMap("Data")
    public BatchStopApplicationsResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><strong>success</strong> is returned when the request succeeds.</li>
     * <li>An error code is returned when the request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7BD8F4C7-D84C-4D46-9885-8212997E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b6e215637275918588187d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static BatchStopApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsResponseBody self = new BatchStopApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchStopApplicationsResponseBody setData(BatchStopApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchStopApplicationsResponseBodyData getData() {
        return this.data;
    }

    public BatchStopApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchStopApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchStopApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchStopApplicationsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BatchStopApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The error code.</p>
         * <ul>
         * <li>If the request is successful, this parameter is not returned.****</li>
         * <li>This parameter is returned only if the request failed.**** For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4a815998-b468-4bea-b7d8-59f52a44****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static BatchStopApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchStopApplicationsResponseBodyData self = new BatchStopApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchStopApplicationsResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
