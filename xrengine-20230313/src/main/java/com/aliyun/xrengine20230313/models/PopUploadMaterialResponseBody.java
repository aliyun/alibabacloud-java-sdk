// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopUploadMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopUploadMaterialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopUploadMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopUploadMaterialResponseBody self = new PopUploadMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public PopUploadMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopUploadMaterialResponseBody setData(PopUploadMaterialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopUploadMaterialResponseBodyData getData() {
        return this.data;
    }

    public PopUploadMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopUploadMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopUploadMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopUploadMaterialResponseBodyDataPolicy extends TeaModel {
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

        public static PopUploadMaterialResponseBodyDataPolicy build(java.util.Map<String, ?> map) throws Exception {
            PopUploadMaterialResponseBodyDataPolicy self = new PopUploadMaterialResponseBodyDataPolicy();
            return TeaModel.build(map, self);
        }

        public PopUploadMaterialResponseBodyDataPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public PopUploadMaterialResponseBodyDataPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public PopUploadMaterialResponseBodyDataPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public PopUploadMaterialResponseBodyDataPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public PopUploadMaterialResponseBodyDataPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public PopUploadMaterialResponseBodyDataPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class PopUploadMaterialResponseBodyData extends TeaModel {
        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public PopUploadMaterialResponseBodyDataPolicy policy;

        public static PopUploadMaterialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopUploadMaterialResponseBodyData self = new PopUploadMaterialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopUploadMaterialResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopUploadMaterialResponseBodyData setPolicy(PopUploadMaterialResponseBodyDataPolicy policy) {
            this.policy = policy;
            return this;
        }
        public PopUploadMaterialResponseBodyDataPolicy getPolicy() {
            return this.policy;
        }

    }

}
