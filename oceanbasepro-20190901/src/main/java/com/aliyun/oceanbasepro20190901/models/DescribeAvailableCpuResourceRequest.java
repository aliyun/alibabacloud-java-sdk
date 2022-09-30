// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCpuResourceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModifyType")
    public String modifyType;

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
