// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneyPotUploadPolicyInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHoneyPotUploadPolicyInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHoneyPotUploadPolicyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneyPotUploadPolicyInfoResponseBody self = new GetHoneyPotUploadPolicyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setData(GetHoneyPotUploadPolicyInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneyPotUploadPolicyInfoResponseBodyData getData() {
        return this.data;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneyPotUploadPolicyInfoResponseBodyData extends TeaModel {
        @NameInMap("Accessid")
        public String accessid;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetHoneyPotUploadPolicyInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneyPotUploadPolicyInfoResponseBodyData self = new GetHoneyPotUploadPolicyInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
