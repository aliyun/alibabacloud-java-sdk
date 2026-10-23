// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemAttachmentAccessResponseBody extends TeaModel {
    /**
     * <p>The short-term preview URL of the attachment. You can send a GET request to this URL before it expires.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("accessUrl")
    public String accessUrl;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ResolveWorkItemAttachmentAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResolveWorkItemAttachmentAccessResponseBody self = new ResolveWorkItemAttachmentAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public ResolveWorkItemAttachmentAccessResponseBody setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }
    public String getAccessUrl() {
        return this.accessUrl;
    }

    public ResolveWorkItemAttachmentAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResolveWorkItemAttachmentAccessResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public ResolveWorkItemAttachmentAccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResolveWorkItemAttachmentAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
