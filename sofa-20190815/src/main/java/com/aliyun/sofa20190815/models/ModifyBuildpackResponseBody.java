// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyBuildpackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("UploadEndpoints")
    public java.util.List<ModifyBuildpackResponseBodyUploadEndpoints> uploadEndpoints;

    public static ModifyBuildpackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuildpackResponseBody self = new ModifyBuildpackResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBuildpackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBuildpackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ModifyBuildpackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ModifyBuildpackResponseBody setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public ModifyBuildpackResponseBody setUploadEndpoints(java.util.List<ModifyBuildpackResponseBodyUploadEndpoints> uploadEndpoints) {
        this.uploadEndpoints = uploadEndpoints;
        return this;
    }
    public java.util.List<ModifyBuildpackResponseBodyUploadEndpoints> getUploadEndpoints() {
        return this.uploadEndpoints;
    }

    public static class ModifyBuildpackResponseBodyUploadEndpoints extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Url")
        public String url;

        public static ModifyBuildpackResponseBodyUploadEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ModifyBuildpackResponseBodyUploadEndpoints self = new ModifyBuildpackResponseBodyUploadEndpoints();
            return TeaModel.build(map, self);
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ModifyBuildpackResponseBodyUploadEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
