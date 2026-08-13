// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateConversationShrinkRequest extends TeaModel {
    /**
     * <p>会话元数据，可含 model 等透传字段（model 需为合法抽象模型名，否则回退默认）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("metadata")
    public String metadata;

    /**
     * <p>关联业务对象ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleObjectId</p>
     */
    @NameInMap("objectId")
    public String objectId;

    /**
     * <p>operatingObjectName</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectNameShrink;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
