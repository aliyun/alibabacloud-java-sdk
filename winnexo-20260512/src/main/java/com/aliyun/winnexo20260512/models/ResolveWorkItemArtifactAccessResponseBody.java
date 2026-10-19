// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemArtifactAccessResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>产物短期签名下载地址，过期前可直接 GET</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>地址过期时间(ISO8601)</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("expiresAt")
    public String expiresAt;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ResolveWorkItemArtifactAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResolveWorkItemArtifactAccessResponseBody self = new ResolveWorkItemArtifactAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public ResolveWorkItemArtifactAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResolveWorkItemArtifactAccessResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public ResolveWorkItemArtifactAccessResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public ResolveWorkItemArtifactAccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResolveWorkItemArtifactAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
