// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SetKnowledgeBaseVisibilityShrinkRequest extends TeaModel {
    /**
     * <p>token</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>Specifies how to handle subfolders.</p>
     * 
     * <strong>example:</strong>
     * <p>CURRENT_ONLY</p>
     */
    @NameInMap("cascadeMode")
    public String cascadeMode;

    /**
     * <p>The user code.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The target ID, which varies based on the target type.</p>
     * <ul>
     * <li>If the type is period, specify the period ID.</li>
     * <li>If the type is objective, specify the objective ID.</li>
     * <li>If the type is kr, specify the keyResult ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb_001</p>
     */
    @NameInMap("targetId")
    public String targetId;

    /**
     * <p>The type of the current permission. Valid values:</p>
     * <ul>
     * <li>period: period type</li>
     * <li>objective: objective type</li>
     * <li>kr: keyResult type</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KB</p>
     */
    @NameInMap("targetType")
    public String targetType;

    /**
     * <p>The ID of the tenant to which the resource belongs. If this parameter is not specified, the current tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The collection of user groups.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("userGroupIds")
    public String userGroupIdsShrink;

    /**
     * <p>The collection of user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10001&quot;]</p>
     */
    @NameInMap("userIds")
    public String userIdsShrink;

    /**
     * <p>The visibility scope mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED</p>
     */
    @NameInMap("visibilityMode")
    public String visibilityMode;

    public static SetKnowledgeBaseVisibilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetKnowledgeBaseVisibilityShrinkRequest self = new SetKnowledgeBaseVisibilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setCascadeMode(String cascadeMode) {
        this.cascadeMode = cascadeMode;
        return this;
    }
    public String getCascadeMode() {
        return this.cascadeMode;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

    public SetKnowledgeBaseVisibilityShrinkRequest setVisibilityMode(String visibilityMode) {
        this.visibilityMode = visibilityMode;
        return this;
    }
    public String getVisibilityMode() {
        return this.visibilityMode;
    }

}
