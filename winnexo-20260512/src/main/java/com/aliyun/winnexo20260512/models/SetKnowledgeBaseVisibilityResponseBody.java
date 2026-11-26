// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SetKnowledgeBaseVisibilityResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>successful</p>
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
     * <p>The target ID, which varies based on the target type.</p>
     * <ul>
     * <li>If the type is period, specify the period ID.</li>
     * <li>If the type is objective, specify the objective ID.</li>
     * <li>If the type is kr, specify the keyResult ID.</li>
     * </ul>
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
     * 
     * <strong>example:</strong>
     * <p>KB</p>
     */
    @NameInMap("targetType")
    public String targetType;

    /**
     * <p>The collection of user groups.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;group-1&quot;]</p>
     */
    @NameInMap("userGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The collection of users.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10001&quot;]</p>
     */
    @NameInMap("userIds")
    public java.util.List<String> userIds;

    /**
     * <p>The visibility scope mode.</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED</p>
     */
    @NameInMap("visibilityMode")
    public String visibilityMode;

    public static SetKnowledgeBaseVisibilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetKnowledgeBaseVisibilityResponseBody self = new SetKnowledgeBaseVisibilityResponseBody();
        return TeaModel.build(map, self);
    }

    public SetKnowledgeBaseVisibilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetKnowledgeBaseVisibilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetKnowledgeBaseVisibilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetKnowledgeBaseVisibilityResponseBody setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public SetKnowledgeBaseVisibilityResponseBody setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public SetKnowledgeBaseVisibilityResponseBody setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public SetKnowledgeBaseVisibilityResponseBody setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public SetKnowledgeBaseVisibilityResponseBody setVisibilityMode(String visibilityMode) {
        this.visibilityMode = visibilityMode;
        return this;
    }
    public String getVisibilityMode() {
        return this.visibilityMode;
    }

}
