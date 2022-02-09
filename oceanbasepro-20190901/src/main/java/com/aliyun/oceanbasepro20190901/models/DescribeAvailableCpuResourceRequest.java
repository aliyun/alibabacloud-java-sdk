// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCpuResourceRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 用户权限修改类型。 可支持以下几种方式： update：全量更新权限，默认值； add：新增权限； delete：删除权限。 默认值：update。
    @NameInMap("ModifyType")
    public String modifyType;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAvailableCpuResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCpuResourceRequest self = new DescribeAvailableCpuResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCpuResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableCpuResourceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public DescribeAvailableCpuResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
