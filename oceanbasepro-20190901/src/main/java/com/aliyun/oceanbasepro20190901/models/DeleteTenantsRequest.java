// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户的ID列表。 其为Json格式的数组，数组中每个对象都为租户名称的字符串。
    @NameInMap("TenantIds")
    public String tenantIds;

    public static DeleteTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantsRequest self = new DeleteTenantsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTenantsRequest setTenantIds(String tenantIds) {
        this.tenantIds = tenantIds;
        return this;
    }
    public String getTenantIds() {
        return this.tenantIds;
    }

}
