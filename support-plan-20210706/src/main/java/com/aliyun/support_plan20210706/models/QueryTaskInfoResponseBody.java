// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class QueryTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskStatus&quot;: &quot;dealingNode&quot;,&quot;orderId&quot;: &quot;E21111796147LE&quot;}</p>
     */
    @NameInMap("Data")
    public QueryTaskInfoResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43135C31-E47A-5AD7-A693-6DC635201CE4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoResponseBody self = new QueryTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskInfoResponseBody setData(QueryTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static QueryTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoResponseBodyData self = new QueryTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTaskInfoResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
