// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalUploadDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopObjectRetrievalUploadDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopObjectRetrievalUploadDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalUploadDataResponseBody self = new PopObjectRetrievalUploadDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalUploadDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopObjectRetrievalUploadDataResponseBody setData(PopObjectRetrievalUploadDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopObjectRetrievalUploadDataResponseBodyData getData() {
        return this.data;
    }

    public PopObjectRetrievalUploadDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopObjectRetrievalUploadDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopObjectRetrievalUploadDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopObjectRetrievalUploadDataResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

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

        public static PopObjectRetrievalUploadDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopObjectRetrievalUploadDataResponseBodyData self = new PopObjectRetrievalUploadDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopObjectRetrievalUploadDataResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopObjectRetrievalUploadDataResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopObjectRetrievalUploadDataResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopObjectRetrievalUploadDataResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopObjectRetrievalUploadDataResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopObjectRetrievalUploadDataResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
