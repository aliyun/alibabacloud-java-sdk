// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsShrinkRequest extends TeaModel {
    /**
     * <p>The new list of object bindings (full replacement. Pass an empty list to clear all bindings).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The ID of the personal FILE data source to be replaced (unique within the tenant).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly through winnexo-cli using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceObjectBindingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceObjectBindingsShrinkRequest self = new ReplaceObjectBindingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceObjectBindingsShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public ReplaceObjectBindingsShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceObjectBindingsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
