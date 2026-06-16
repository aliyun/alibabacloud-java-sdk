// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCanTrySasResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCanTrySasResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCanTrySasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCanTrySasResponseBody self = new GetCanTrySasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCanTrySasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCanTrySasResponseBody setData(GetCanTrySasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCanTrySasResponseBodyData getData() {
        return this.data;
    }

    public GetCanTrySasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCanTrySasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCanTrySasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCanTrySasResponseBodyDataBodyData extends TeaModel {
        @NameInMap("CanTry")
        public Integer canTry;

        @NameInMap("CanTryVersions")
        public java.util.List<Integer> canTryVersions;

        @NameInMap("TryType")
        public Integer tryType;

        public static GetCanTrySasResponseBodyDataBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyDataBodyData self = new GetCanTrySasResponseBodyDataBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyDataBodyData setCanTry(Integer canTry) {
            this.canTry = canTry;
            return this;
        }
        public Integer getCanTry() {
            return this.canTry;
        }

        public GetCanTrySasResponseBodyDataBodyData setCanTryVersions(java.util.List<Integer> canTryVersions) {
            this.canTryVersions = canTryVersions;
            return this;
        }
        public java.util.List<Integer> getCanTryVersions() {
            return this.canTryVersions;
        }

        public GetCanTrySasResponseBodyDataBodyData setTryType(Integer tryType) {
            this.tryType = tryType;
            return this;
        }
        public Integer getTryType() {
            return this.tryType;
        }

    }

    public static class GetCanTrySasResponseBodyDataBody extends TeaModel {
        @NameInMap("Data")
        public GetCanTrySasResponseBodyDataBodyData data;

        @NameInMap("RequestId")
        public String requestId;

        public static GetCanTrySasResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyDataBody self = new GetCanTrySasResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyDataBody setData(GetCanTrySasResponseBodyDataBodyData data) {
            this.data = data;
            return this;
        }
        public GetCanTrySasResponseBodyDataBodyData getData() {
            return this.data;
        }

        public GetCanTrySasResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetCanTrySasResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public GetCanTrySasResponseBodyDataBody body;

        public static GetCanTrySasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyData self = new GetCanTrySasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyData setBody(GetCanTrySasResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public GetCanTrySasResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
