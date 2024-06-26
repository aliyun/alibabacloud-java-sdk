// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantTagsRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;: &quot;xxx&quot;, &quot;Value&quot;, &quot;xxx&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The JSON string of the tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;t5r0x2f6q****&quot;, &quot;t33h8y08k****&quot;, &quot;t5r41rtl7****&quot;]</p>
     */
    @NameInMap("TenantIds")
    public String tenantIds;

    public static DescribeTenantTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantTagsRequest self = new DescribeTenantTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeTenantTagsRequest setTenantIds(String tenantIds) {
        this.tenantIds = tenantIds;
        return this;
    }
    public String getTenantIds() {
        return this.tenantIds;
    }

}
