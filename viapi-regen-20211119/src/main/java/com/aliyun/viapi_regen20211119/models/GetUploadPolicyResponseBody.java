// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUploadPolicyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadPolicyResponseBody self = new GetUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadPolicyResponseBody setData(GetUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUploadPolicyResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("OriginalFilename")
        public String originalFilename;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("SignedHttpUrl")
        public String signedHttpUrl;

        public static GetUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadPolicyResponseBodyData self = new GetUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadPolicyResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetUploadPolicyResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUploadPolicyResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetUploadPolicyResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetUploadPolicyResponseBodyData setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetUploadPolicyResponseBodyData setOriginalFilename(String originalFilename) {
            this.originalFilename = originalFilename;
            return this;
        }
        public String getOriginalFilename() {
            return this.originalFilename;
        }

        public GetUploadPolicyResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetUploadPolicyResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetUploadPolicyResponseBodyData setSignedHttpUrl(String signedHttpUrl) {
            this.signedHttpUrl = signedHttpUrl;
            return this;
        }
        public String getSignedHttpUrl() {
            return this.signedHttpUrl;
        }

    }

}
