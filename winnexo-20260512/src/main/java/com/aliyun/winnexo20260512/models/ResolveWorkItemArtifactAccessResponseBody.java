// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemArtifactAccessResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The short-term signed download URL of the artifact. You can send a GET request directly to this URL before it expires.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the URL in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("expiresAt")
    public String expiresAt;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
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
