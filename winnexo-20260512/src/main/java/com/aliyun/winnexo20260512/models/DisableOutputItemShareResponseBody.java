// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableOutputItemShareResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid request parameters</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The output item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The most recently configured sharing scope.</p>
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
     * <p>false</p>
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
     * <p>The relative path for internal sharing. This value is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("sharePath")
    public String sharePath;

    /**
     * <p>The sharing token. This token exists when sharing is enabled and can be used to access the public sharing preview API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("shareToken")
    public String shareToken;

    /**
     * <p>The current absolute sharing URL. This value is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("shareUrl")
    public String shareUrl;

    /**
     * <p>The list of specified user group IDs from the most recent configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("shareUserGroupIds")
    public java.util.List<String> shareUserGroupIds;

    /**
     * <p>The list of specified user IDs from the most recent configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("shareUserIds")
    public java.util.List<Long> shareUserIds;

    public static DisableOutputItemShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableOutputItemShareResponseBody self = new DisableOutputItemShareResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableOutputItemShareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableOutputItemShareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableOutputItemShareResponseBody setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public DisableOutputItemShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableOutputItemShareResponseBody setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public DisableOutputItemShareResponseBody setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
        return this;
    }
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    public DisableOutputItemShareResponseBody setShareEnabledAt(String shareEnabledAt) {
        this.shareEnabledAt = shareEnabledAt;
        return this;
    }
    public String getShareEnabledAt() {
        return this.shareEnabledAt;
    }

    public DisableOutputItemShareResponseBody setSharePath(String sharePath) {
        this.sharePath = sharePath;
        return this;
    }
    public String getSharePath() {
        return this.sharePath;
    }

    public DisableOutputItemShareResponseBody setShareToken(String shareToken) {
        this.shareToken = shareToken;
        return this;
    }
    public String getShareToken() {
        return this.shareToken;
    }

    public DisableOutputItemShareResponseBody setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }
    public String getShareUrl() {
        return this.shareUrl;
    }

    public DisableOutputItemShareResponseBody setShareUserGroupIds(java.util.List<String> shareUserGroupIds) {
        this.shareUserGroupIds = shareUserGroupIds;
        return this;
    }
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    public DisableOutputItemShareResponseBody setShareUserIds(java.util.List<Long> shareUserIds) {
        this.shareUserIds = shareUserIds;
        return this;
    }
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
    }

}
