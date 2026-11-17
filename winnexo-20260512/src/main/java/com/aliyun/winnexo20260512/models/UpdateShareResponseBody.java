// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateShareResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The message.</p>
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
     * <p>The unique identifier of the function session.</p>
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
     * <p>SPECIFIED</p>
     */
    @NameInMap("shareAccessType")
    public String shareAccessType;

    /**
     * <p>Specifies whether sharing is enabled.</p>
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
     * <p>The relative path for in-site sharing. This parameter is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>/10001/share/output/token</p>
     */
    @NameInMap("sharePath")
    public String sharePath;

    /**
     * <p>The sharing token, which is returned when sharing is enabled. You can use this token to access the public sharing preview API.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleShareToken</p>
     */
    @NameInMap("shareToken")
    public String shareToken;

    /**
     * <p>The absolute URL of the current sharing link. This parameter is empty when sharing is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/10001/share/output/token">https://example.com/10001/share/output/token</a></p>
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
     * <p>[10001]</p>
     */
    @NameInMap("shareUserIds")
    public java.util.List<Long> shareUserIds;

    /**
     * <p>The type of the current permission. Valid values:</p>
     * <ul>
     * <li>period: Period type.</li>
     * <li>objective: Objective type.</li>
     * <li>kr: Key result type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>outputItem</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static UpdateShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareResponseBody self = new UpdateShareResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateShareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateShareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateShareResponseBody setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public UpdateShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateShareResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UpdateShareResponseBody setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public UpdateShareResponseBody setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
        return this;
    }
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    public UpdateShareResponseBody setShareEnabledAt(String shareEnabledAt) {
        this.shareEnabledAt = shareEnabledAt;
        return this;
    }
    public String getShareEnabledAt() {
        return this.shareEnabledAt;
    }

    public UpdateShareResponseBody setSharePath(String sharePath) {
        this.sharePath = sharePath;
        return this;
    }
    public String getSharePath() {
        return this.sharePath;
    }

    public UpdateShareResponseBody setShareToken(String shareToken) {
        this.shareToken = shareToken;
        return this;
    }
    public String getShareToken() {
        return this.shareToken;
    }

    public UpdateShareResponseBody setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }
    public String getShareUrl() {
        return this.shareUrl;
    }

    public UpdateShareResponseBody setShareUserGroupIds(java.util.List<String> shareUserGroupIds) {
        this.shareUserGroupIds = shareUserGroupIds;
        return this;
    }
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    public UpdateShareResponseBody setShareUserIds(java.util.List<Long> shareUserIds) {
        this.shareUserIds = shareUserIds;
        return this;
    }
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
    }

    public UpdateShareResponseBody setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
