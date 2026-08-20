// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateConversationShrinkRequest extends TeaModel {
    /**
     * <p>A reserved field.</p>
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
     * <p>The operating object name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectNameShrink;

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

    public CreateConversationShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
