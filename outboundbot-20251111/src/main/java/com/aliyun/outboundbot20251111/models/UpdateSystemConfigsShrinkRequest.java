// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSystemConfigsShrinkRequest extends TeaModel {
    /**
     * <p>The list of configurations.</p>
     */
    @NameInMap("Configs")
    public String configsShrink;

    /**
     * <p>The configuration type ID. If ObjectType is set to INSTANCE, this parameter specifies the instance ID. If ObjectType is set to TENANT, this parameter specifies the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li>INSTANCE: instance level.</li>
     * <li>TENANT: tenant level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static UpdateSystemConfigsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSystemConfigsShrinkRequest self = new UpdateSystemConfigsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSystemConfigsShrinkRequest setConfigsShrink(String configsShrink) {
        this.configsShrink = configsShrink;
        return this;
    }
    public String getConfigsShrink() {
        return this.configsShrink;
    }

    public UpdateSystemConfigsShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateSystemConfigsShrinkRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
