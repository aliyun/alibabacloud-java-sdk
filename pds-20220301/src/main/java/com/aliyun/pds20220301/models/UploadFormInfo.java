// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UploadFormInfo extends TeaModel {
    @NameInMap("bucket_name")
    public String bucketName;

    @NameInMap("object_key")
    public String objectKey;

    @NameInMap("oss_access_key_id")
    public String ossAccessKeyId;

    @NameInMap("oss_end_point")
    public String ossEndPoint;

    @NameInMap("oss_security_token")
    public String ossSecurityToken;

    @NameInMap("policy")
    public String policy;

    @NameInMap("signature")
    public String signature;

    public static UploadFormInfo build(java.util.Map<String, ?> map) throws Exception {
        UploadFormInfo self = new UploadFormInfo();
        return TeaModel.build(map, self);
    }

    public UploadFormInfo setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public UploadFormInfo setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public UploadFormInfo setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public UploadFormInfo setOssEndPoint(String ossEndPoint) {
        this.ossEndPoint = ossEndPoint;
        return this;
    }
    public String getOssEndPoint() {
        return this.ossEndPoint;
    }

    public UploadFormInfo setOssSecurityToken(String ossSecurityToken) {
        this.ossSecurityToken = ossSecurityToken;
        return this;
    }
    public String getOssSecurityToken() {
        return this.ossSecurityToken;
    }

    public UploadFormInfo setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UploadFormInfo setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
