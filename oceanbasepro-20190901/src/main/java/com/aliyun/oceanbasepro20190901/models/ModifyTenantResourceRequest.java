// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantResourceRequest extends TeaModel {
    /**
     * <p>The memory size of the tenant, in GB.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **ModifyTenantResource**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The information about the CPU resources of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantResourceRequest self = new ModifyTenantResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantResourceRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ModifyTenantResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantResourceRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModifyTenantResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
