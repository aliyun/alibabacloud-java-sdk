// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableConversationShareShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the function session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The sharing scope. Valid values:</p>
     * <ul>
     * <li>PUBLIC: accessible to all users</li>
     * <li>SPECIFIED: accessible to specified users or user groups</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("shareAccessType")
    public String shareAccessType;

    /**
     * <p>The list of user group IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user list must not be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("shareUserGroupIds")
    public String shareUserGroupIdsShrink;

    /**
     * <p>The list of platform user IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user group list must not be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("shareUserIds")
    public String shareUserIdsShrink;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static EnableConversationShareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableConversationShareShrinkRequest self = new EnableConversationShareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableConversationShareShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EnableConversationShareShrinkRequest setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public EnableConversationShareShrinkRequest setShareUserGroupIdsShrink(String shareUserGroupIdsShrink) {
        this.shareUserGroupIdsShrink = shareUserGroupIdsShrink;
        return this;
    }
    public String getShareUserGroupIdsShrink() {
        return this.shareUserGroupIdsShrink;
    }

    public EnableConversationShareShrinkRequest setShareUserIdsShrink(String shareUserIdsShrink) {
        this.shareUserIdsShrink = shareUserIdsShrink;
        return this;
    }
    public String getShareUserIdsShrink() {
        return this.shareUserIdsShrink;
    }

    public EnableConversationShareShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
