// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ReduceApplicationCapacityByInstanceIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReduceApplicationCapacityByInstanceIdsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ReduceApplicationCapacityByInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReduceApplicationCapacityByInstanceIdsResponseBody self = new ReduceApplicationCapacityByInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setData(ReduceApplicationCapacityByInstanceIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReduceApplicationCapacityByInstanceIdsResponseBodyData getData() {
        return this.data;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ReduceApplicationCapacityByInstanceIdsResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static ReduceApplicationCapacityByInstanceIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReduceApplicationCapacityByInstanceIdsResponseBodyData self = new ReduceApplicationCapacityByInstanceIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReduceApplicationCapacityByInstanceIdsResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
