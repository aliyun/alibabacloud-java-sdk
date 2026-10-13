// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateUploadUrlResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadUrlResponseBody self = new GenerateUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateUploadUrlResponseBody setData(GenerateUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GenerateUploadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateUploadUrlResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Expire")
        public Integer expire;

        @NameInMap("Folder")
        public String folder;

        @NameInMap("Host")
        public String host;

        @NameInMap("Message")
        public String message;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Success")
        public Boolean success;

        public static GenerateUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadUrlResponseBodyData self = new GenerateUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateUploadUrlResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GenerateUploadUrlResponseBodyData setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

        public GenerateUploadUrlResponseBodyData setFolder(String folder) {
            this.folder = folder;
            return this;
        }
        public String getFolder() {
            return this.folder;
        }

        public GenerateUploadUrlResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateUploadUrlResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GenerateUploadUrlResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateUploadUrlResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateUploadUrlResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
