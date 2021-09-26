// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class GenerateUploadAuthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadConfig")
    public GenerateUploadAuthResponseBodyUploadConfig uploadConfig;

    public static GenerateUploadAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadAuthResponseBody self = new GenerateUploadAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadAuthResponseBody setUploadConfig(GenerateUploadAuthResponseBodyUploadConfig uploadConfig) {
        this.uploadConfig = uploadConfig;
        return this;
    }
    public GenerateUploadAuthResponseBodyUploadConfig getUploadConfig() {
        return this.uploadConfig;
    }

    public static class GenerateUploadAuthResponseBodyUploadConfig extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("UploadHost")
        public String uploadHost;

        @NameInMap("AccessId")
        public String accessId;

        public static GenerateUploadAuthResponseBodyUploadConfig build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadAuthResponseBodyUploadConfig self = new GenerateUploadAuthResponseBodyUploadConfig();
            return TeaModel.build(map, self);
        }

        public GenerateUploadAuthResponseBodyUploadConfig setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateUploadAuthResponseBodyUploadConfig setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GenerateUploadAuthResponseBodyUploadConfig setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateUploadAuthResponseBodyUploadConfig setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GenerateUploadAuthResponseBodyUploadConfig setUploadHost(String uploadHost) {
            this.uploadHost = uploadHost;
            return this;
        }
        public String getUploadHost() {
            return this.uploadHost;
        }

        public GenerateUploadAuthResponseBodyUploadConfig setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

    }

}
