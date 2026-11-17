// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableOutputItemShareShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the output item.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The name of the output item. This parameter must be used together with sessionId. If multiple output items have the same name, the request is rejected and you are prompted to use outputItemId instead.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly Review.pptx</p>
     */
    @NameInMap("outputItemName")
    public String outputItemName;

    /**
     * <p>The session ID used for exact filtering. The length is 1 to 128 characters. This parameter applies to common sessions, skill sessions, and the executionId of task executions.</p>
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
     * <li>SPECIFIED: Accessible only to specified users or user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("shareAccessType")
    public String shareAccessType;

    /**
     * <p>The list of user group IDs within the specified scope.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("shareUserGroupIds")
    public String shareUserGroupIdsShrink;

    /**
     * <p>The list of platform user IDs within the specified scope.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("shareUserIds")
    public String shareUserIdsShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static EnableOutputItemShareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableOutputItemShareShrinkRequest self = new EnableOutputItemShareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableOutputItemShareShrinkRequest setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public EnableOutputItemShareShrinkRequest setOutputItemName(String outputItemName) {
        this.outputItemName = outputItemName;
        return this;
    }
    public String getOutputItemName() {
        return this.outputItemName;
    }

    public EnableOutputItemShareShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public EnableOutputItemShareShrinkRequest setShareAccessType(String shareAccessType) {
        this.shareAccessType = shareAccessType;
        return this;
    }
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    public EnableOutputItemShareShrinkRequest setShareUserGroupIdsShrink(String shareUserGroupIdsShrink) {
        this.shareUserGroupIdsShrink = shareUserGroupIdsShrink;
        return this;
    }
    public String getShareUserGroupIdsShrink() {
        return this.shareUserGroupIdsShrink;
    }

    public EnableOutputItemShareShrinkRequest setShareUserIdsShrink(String shareUserIdsShrink) {
        this.shareUserIdsShrink = shareUserIdsShrink;
        return this;
    }
    public String getShareUserIdsShrink() {
        return this.shareUserIdsShrink;
    }

    public EnableOutputItemShareShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
