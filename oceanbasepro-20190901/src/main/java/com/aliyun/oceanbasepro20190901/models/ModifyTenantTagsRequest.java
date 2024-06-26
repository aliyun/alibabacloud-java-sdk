// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantTagsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;: &quot;xxx&quot;, &quot;Value&quot;, &quot;xxx&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t33h8y08k****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantTagsRequest self = new ModifyTenantTagsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyTenantTagsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
