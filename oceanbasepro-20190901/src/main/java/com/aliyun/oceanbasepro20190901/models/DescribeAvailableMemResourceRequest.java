// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceRequest extends TeaModel {
    @NameInMap("CpuNum")
    public Long cpuNum;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UnitNum")
    public Long unitNum;

    public static DescribeAvailableMemResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMemResourceRequest self = new DescribeAvailableMemResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMemResourceRequest setCpuNum(Long cpuNum) {
        this.cpuNum = cpuNum;
        return this;
    }
    public Long getCpuNum() {
        return this.cpuNum;
    }

    public DescribeAvailableMemResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableMemResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeAvailableMemResourceRequest setUnitNum(Long unitNum) {
        this.unitNum = unitNum;
        return this;
    }
    public Long getUnitNum() {
        return this.unitNum;
    }

}
