// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResolveWorkItemAttachmentAccessResponseBody extends TeaModel {
    /**
     * <p>附件短期预览地址，过期前可直接 GET</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("accessUrl")
    public String accessUrl;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

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
