// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossBackupRegionsRequest extends TeaModel {
    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 最大返回的region数目，默认为2
    @NameInMap("MaxRegionNum")
    public Integer maxRegionNum;

    // 租户ID
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAvailableCrossBackupRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossBackupRegionsRequest self = new DescribeAvailableCrossBackupRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossBackupRegionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableCrossBackupRegionsRequest setMaxRegionNum(Integer maxRegionNum) {
        this.maxRegionNum = maxRegionNum;
        return this;
    }
    public Integer getMaxRegionNum() {
        return this.maxRegionNum;
    }

    public DescribeAvailableCrossBackupRegionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
