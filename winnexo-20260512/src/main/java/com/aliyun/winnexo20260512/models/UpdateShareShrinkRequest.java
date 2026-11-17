// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateShareShrinkRequest extends TeaModel {
    /**
     * <p>The output item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The name of the output item. This parameter must be used together with sessionId.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly Review.pptx</p>
     */
    @NameInMap("outputItemName")
    public String outputItemName;

    /**
     * <p>Specifies whether to refresh the sharing link. This is supported only for output items that have sharing enabled or are being enabled in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("refreshShareLink")
    public Boolean refreshShareLink;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The sharing scope. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Accessible to all users.</li>
     * <li>SPECIFIED: Accessible to specified users or user groups.</li>
     * </ul>
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
     * <p>The list of user group IDs within the specified scope. Pass an empty array to clear the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("shareUserGroupIds")
    public String shareUserGroupIdsShrink;

    /**
     * <p>The list of platform user IDs within the specified scope. Pass an empty array to clear the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("shareUserIds")
    public String shareUserIdsShrink;

    /**
     * <p>The type of the current permission. Valid values:</p>
     * <ul>
     * <li>period: Period type.</li>
     * <li>objective: Objective type.</li>
     * <li>kr: Key result type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>outputItem</p>
     */
    @NameInMap("targetType")
    public String targetType;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateShareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareShrinkRequest self = new UpdateShareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShareShrinkRequest setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public UpdateShareShrinkRequest setOutputItemName(String outputItemName) {
        this.outputItemName = outputItemName;
        return this;
    }
    public String getOutputItemName() {
        return this.outputItemName;
    }

    public UpdateShareShrinkRequest setRefreshShareLink(Boolean refreshShareLink) {
        this.refreshShareLink = refreshShareLink;
        return this;
    }
    public Boolean getRefreshShareLink() {
        return this.refreshShareLink;
    }

    public UpdateShareShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UpdateShareShrinkRequest setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public UpdateShareShrinkRequest setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
        return this;
    }
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    public UpdateShareShrinkRequest setShareUserGroupIdsShrink(String shareUserGroupIdsShrink) {
        this.shareUserGroupIdsShrink = shareUserGroupIdsShrink;
        return this;
    }
    public String getShareUserGroupIdsShrink() {
        return this.shareUserGroupIdsShrink;
    }

    public UpdateShareShrinkRequest setShareUserIdsShrink(String shareUserIdsShrink) {
        this.shareUserIdsShrink = shareUserIdsShrink;
        return this;
    }
    public String getShareUserIdsShrink() {
        return this.shareUserIdsShrink;
    }

    public UpdateShareShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateShareShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
