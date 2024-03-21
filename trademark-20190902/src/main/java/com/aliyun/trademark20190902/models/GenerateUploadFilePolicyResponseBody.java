// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyResponseBody extends TeaModel {
    /**
     * <p>OSSAccessKeyId</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <p>host</p>
     */
    @NameInMap("Host")
    public String host;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

    public static GenerateUploadFilePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyResponseBody self = new GenerateUploadFilePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GenerateUploadFilePolicyResponseBody setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public GenerateUploadFilePolicyResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GenerateUploadFilePolicyResponseBody setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }
    public String getFileDir() {
        return this.fileDir;
    }

    public GenerateUploadFilePolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GenerateUploadFilePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadFilePolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
