// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateBuildpackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("UploadEndpoints")
    public java.util.List<CreateBuildpackResponseBodyUploadEndpoints> uploadEndpoints;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateBuildpackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackResponseBody self = new CreateBuildpackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBuildpackResponseBody setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public CreateBuildpackResponseBody setUploadEndpoints(java.util.List<CreateBuildpackResponseBodyUploadEndpoints> uploadEndpoints) {
        this.uploadEndpoints = uploadEndpoints;
        return this;
    }
    public java.util.List<CreateBuildpackResponseBodyUploadEndpoints> getUploadEndpoints() {
        return this.uploadEndpoints;
    }

    public CreateBuildpackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateBuildpackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateBuildpackResponseBodyUploadEndpoints extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("Url")
        public String url;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Bucket")
        public String bucket;

        public static CreateBuildpackResponseBodyUploadEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateBuildpackResponseBodyUploadEndpoints self = new CreateBuildpackResponseBodyUploadEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateBuildpackResponseBodyUploadEndpoints setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateBuildpackResponseBodyUploadEndpoints setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

}
