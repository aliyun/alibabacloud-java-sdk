// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateConversationShrinkRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("metadata")
    public String metadata;

    /**
     * <p>The primary key ID of the associated variable.</p>
     * 
     * <strong>example:</strong>
     * <p>2676</p>
     */
    @NameInMap("objectId")
    public String objectId;

    /**
     * <p>The name of the operation object.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;item name&quot;]</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectNameShrink;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateConversationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationShrinkRequest self = new CreateConversationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateConversationShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateConversationShrinkRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateConversationShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CreateConversationShrinkRequest setOperatingObjectNameShrink(String operatingObjectNameShrink) {
        this.operatingObjectNameShrink = operatingObjectNameShrink;
        return this;
    }
    public String getOperatingObjectNameShrink() {
        return this.operatingObjectNameShrink;
    }

    public CreateConversationShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateConversationShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateConversationShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
