// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableConversationShareResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of SUCCESS indicates success. For failures, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid request parameters</p>
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

    /**
     * <p>The ID of the source single-chat session.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The current sharing scope. Valid values: PUBLIC and SPECIFIED.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("shareAccessType")
    public String shareAccessType;

    /**
     * <p>Indicates whether sharing is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("shareEnabled")
    public Boolean shareEnabled;

    /**
     * <p>The time when sharing was most recently enabled, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-16T13:00:00+00:00</p>
     */
    @NameInMap("shareEnabledAt")
    public String shareEnabledAt;

    /**
     * <p>The relative path for in-site sharing. This value is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>/10001/share/chat/token</p>
     */
    @NameInMap("sharePath")
    public String sharePath;

    /**
     * <p>The sharing token. This token is present when sharing is enabled and can be used to access the public sharing preview API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleShareToken</p>
     */
    @NameInMap("shareToken")
    public String shareToken;

    /**
     * <p>The absolute URL of the current sharing link. This value is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/10001/share/chat/token">https://example.com/10001/share/chat/token</a></p>
     */
    @NameInMap("shareUrl")
    public String shareUrl;

    /**
     * <p>The list of currently specified user group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("shareUserGroupIds")
    public java.util.List<String> shareUserGroupIds;

    /**
     * <p>The list of currently specified user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("shareUserIds")
    public java.util.List<Long> shareUserIds;

    public static EnableConversationShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableConversationShareResponseBody self = new EnableConversationShareResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableConversationShareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableConversationShareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableConversationShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableConversationShareResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EnableConversationShareResponseBody setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public EnableConversationShareResponseBody setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
        return this;
    }
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    public EnableConversationShareResponseBody setShareEnabledAt(String shareEnabledAt) {
        this.shareEnabledAt = shareEnabledAt;
        return this;
    }
    public String getShareEnabledAt() {
        return this.shareEnabledAt;
    }

    public EnableConversationShareResponseBody setSharePath(String sharePath) {
        this.sharePath = sharePath;
        return this;
    }
    public String getSharePath() {
        return this.sharePath;
    }

    public EnableConversationShareResponseBody setShareToken(String shareToken) {
        this.shareToken = shareToken;
        return this;
    }
    public String getShareToken() {
        return this.shareToken;
    }

    public EnableConversationShareResponseBody setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }
    public String getShareUrl() {
        return this.shareUrl;
    }

    public EnableConversationShareResponseBody setShareUserGroupIds(java.util.List<String> shareUserGroupIds) {
        this.shareUserGroupIds = shareUserGroupIds;
        return this;
    }
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    public EnableConversationShareResponseBody setShareUserIds(java.util.List<Long> shareUserIds) {
        this.shareUserIds = shareUserIds;
        return this;
    }
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
    }

}
