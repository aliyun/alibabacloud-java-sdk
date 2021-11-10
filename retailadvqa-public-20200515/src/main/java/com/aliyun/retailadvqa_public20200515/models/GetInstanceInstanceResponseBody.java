// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetInstanceInstanceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetInstanceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceResponseBody self = new GetInstanceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceResponseBody setData(GetInstanceInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceInstanceResponseBodyData extends TeaModel {
        @NameInMap("RetInstanceInfo")
        public String retInstanceInfo;

        public static GetInstanceInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInstanceResponseBodyData self = new GetInstanceInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceInstanceResponseBodyData setRetInstanceInfo(String retInstanceInfo) {
            this.retInstanceInfo = retInstanceInfo;
            return this;
        }
        public String getRetInstanceInfo() {
            return this.retInstanceInfo;
        }

    }

}
