// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateUploadPolicyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadPolicyResponseBody self = new CreateUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadPolicyResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateUploadPolicyResponseBody setData(CreateUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public CreateUploadPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateUploadPolicyResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Callback")
        public String callback;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static CreateUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadPolicyResponseBodyData self = new CreateUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateUploadPolicyResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateUploadPolicyResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public CreateUploadPolicyResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public CreateUploadPolicyResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateUploadPolicyResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateUploadPolicyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateUploadPolicyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
