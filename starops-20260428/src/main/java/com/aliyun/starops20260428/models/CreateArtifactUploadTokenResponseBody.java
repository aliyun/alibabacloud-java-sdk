// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateArtifactUploadTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LTAI******</p>
     */
    @NameInMap("accessId")
    public String accessId;

    /**
     * <strong>example:</strong>
     * <p>upload/2026-05-25/</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    /**
     * <strong>example:</strong>
     * <p>agents/123/sample-agent/home/starops/upload/2026-05-25/</p>
     */
    @NameInMap("dir")
    public String dir;

    /**
     * <strong>example:</strong>
     * <p>1770000000</p>
     */
    @NameInMap("expire")
    public Long expire;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com">https://example-bucket.oss-cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>104857600</p>
     */
    @NameInMap("maxSize")
    public Long maxSize;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wNS0yMVQwODowMDowMFoifQ==</p>
     */
    @NameInMap("policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>abc123signature</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("successActionStatus")
    public String successActionStatus;

    public static CreateArtifactUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactUploadTokenResponseBody self = new CreateArtifactUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateArtifactUploadTokenResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateArtifactUploadTokenResponseBody setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
        return this;
    }
    public String getArtifactPath() {
        return this.artifactPath;
    }

    public CreateArtifactUploadTokenResponseBody setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public CreateArtifactUploadTokenResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateArtifactUploadTokenResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateArtifactUploadTokenResponseBody setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public CreateArtifactUploadTokenResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateArtifactUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateArtifactUploadTokenResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateArtifactUploadTokenResponseBody setSuccessActionStatus(String successActionStatus) {
        this.successActionStatus = successActionStatus;
        return this;
    }
    public String getSuccessActionStatus() {
        return this.successActionStatus;
    }

}
