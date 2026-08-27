// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateArtifactUploadTokenResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID used for OSS uploads.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI******</p>
     */
    @NameInMap("accessId")
    public String accessId;

    /**
     * <p>The normalized logical upload directory on the server side, relative to the digital human artifact root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>upload/2026-05-25/</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    /**
     * <p>The allowed OSS object prefix for uploads.</p>
     * 
     * <strong>example:</strong>
     * <p>agents/123/sample-agent/home/starops/upload/2026-05-25/</p>
     */
    @NameInMap("dir")
    public String dir;

    /**
     * <p>The expiration time of the upload credential. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1770000000</p>
     */
    @NameInMap("expire")
    public Long expire;

    /**
     * <p>The OSS form upload URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com">https://example-bucket.oss-cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <p>The maximum size of a single file upload, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>104857600</p>
     */
    @NameInMap("maxSize")
    public Long maxSize;

    /**
     * <p>The Base64-encoded OSS Post Policy.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wNS0yMVQwODowMDowMFoifQ==</p>
     */
    @NameInMap("policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The OSS Post Policy signature.</p>
     * 
     * <strong>example:</strong>
     * <p>abc123signature</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The status code returned upon a successful OSS upload.</p>
     * 
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
