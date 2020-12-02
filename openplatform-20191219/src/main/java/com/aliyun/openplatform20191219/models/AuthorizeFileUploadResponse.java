// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponse extends TeaModel {
    @NameInMap("AccessKeyId")
    @Validation(required = true)
    public String accessKeyId;

    @NameInMap("Bucket")
    @Validation(required = true)
    public String bucket;

    @NameInMap("EncodedPolicy")
    @Validation(required = true)
    public String encodedPolicy;

    @NameInMap("Endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("ObjectKey")
    @Validation(required = true)
    public String objectKey;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Signature")
    @Validation(required = true)
    public String signature;

    @NameInMap("UseAccelerate")
    @Validation(required = true)
    public Boolean useAccelerate;

    public static AuthorizeFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadResponse self = new AuthorizeFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeFileUploadResponse setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AuthorizeFileUploadResponse setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AuthorizeFileUploadResponse setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public AuthorizeFileUploadResponse setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AuthorizeFileUploadResponse setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public AuthorizeFileUploadResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeFileUploadResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public AuthorizeFileUploadResponse setUseAccelerate(Boolean useAccelerate) {
        this.useAccelerate = useAccelerate;
        return this;
    }
    public Boolean getUseAccelerate() {
        return this.useAccelerate;
    }

}
