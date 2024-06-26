// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceRequest extends TeaModel {
    /**
     * <p>The number of CPU cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("CpuNum")
    public Long cpuNum;

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
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The number of resource distribution nodes in the tenant.<br>The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
