// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeResPacksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ConsumeResPacksResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ConsumeResPacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConsumeResPacksResponseBody self = new ConsumeResPacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ConsumeResPacksResponseBody setData(ConsumeResPacksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConsumeResPacksResponseBodyData getData() {
        return this.data;
    }

    public ConsumeResPacksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConsumeResPacksResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ConsumeResPacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsumeResPacksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConsumeResPacksResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ConsumeResPacksResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static ConsumeResPacksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConsumeResPacksResponseBodyData self = new ConsumeResPacksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConsumeResPacksResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
