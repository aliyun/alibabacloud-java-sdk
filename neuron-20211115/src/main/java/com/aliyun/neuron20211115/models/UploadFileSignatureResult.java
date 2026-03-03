// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UploadFileSignatureResult extends TeaModel {
    @NameInMap("expiredTime")
    public Long expiredTime;

    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("host")
    public String host;

    @NameInMap("keyId")
    public String keyId;

    @NameInMap("path")
    public String path;

    @NameInMap("policy")
    public String policy;

    @NameInMap("signature")
    public String signature;

    @NameInMap("thumbUrl")
    public String thumbUrl;

    public static UploadFileSignatureResult build(java.util.Map<String, ?> map) throws Exception {
        UploadFileSignatureResult self = new UploadFileSignatureResult();
        return TeaModel.build(map, self);
    }

    public UploadFileSignatureResult setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public UploadFileSignatureResult setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadFileSignatureResult setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UploadFileSignatureResult setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public UploadFileSignatureResult setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UploadFileSignatureResult setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UploadFileSignatureResult setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public UploadFileSignatureResult setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }
    public String getThumbUrl() {
        return this.thumbUrl;
    }

}
