// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("UseAccelerate")
    public Boolean useAccelerate;

    public static AuthorizeFileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadResponseBody self = new AuthorizeFileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeFileUploadResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AuthorizeFileUploadResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AuthorizeFileUploadResponseBody setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public AuthorizeFileUploadResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AuthorizeFileUploadResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public AuthorizeFileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeFileUploadResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public AuthorizeFileUploadResponseBody setUseAccelerate(Boolean useAccelerate) {
        this.useAccelerate = useAccelerate;
        return this;
    }
    public Boolean getUseAccelerate() {
        return this.useAccelerate;
    }

}
