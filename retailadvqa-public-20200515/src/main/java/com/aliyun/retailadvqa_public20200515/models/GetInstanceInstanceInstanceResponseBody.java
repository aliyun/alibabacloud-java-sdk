// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetInstanceInstanceInstanceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceInstanceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceInstanceResponseBody self = new GetInstanceInstanceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceInstanceResponseBody setData(GetInstanceInstanceInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceInstanceInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceInstanceInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceInstanceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceInstanceInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceInstanceInstanceResponseBodyData extends TeaModel {
        @NameInMap("RetInstanceInfo")
        public String retInstanceInfo;

        public static GetInstanceInstanceInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInstanceInstanceResponseBodyData self = new GetInstanceInstanceInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceInstanceInstanceResponseBodyData setRetInstanceInfo(String retInstanceInfo) {
            this.retInstanceInfo = retInstanceInfo;
            return this;
        }
        public String getRetInstanceInfo() {
            return this.retInstanceInfo;
        }

    }

}
