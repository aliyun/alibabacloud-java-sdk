// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantTagsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The JSON string of the tenant ID.</p>
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
