// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateConversationRequest extends TeaModel {
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
    public java.util.List<?> operatingObjectName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationRequest self = new CreateConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateConversationRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateConversationRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CreateConversationRequest setOperatingObjectName(java.util.List<?> operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public java.util.List<?> getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateConversationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
