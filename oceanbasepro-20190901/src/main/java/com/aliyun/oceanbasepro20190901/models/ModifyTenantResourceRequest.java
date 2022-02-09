// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantResourceRequest extends TeaModel {
    @NameInMap("Cpu")
    public Integer cpu;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户内存大小，单位GB。
    @NameInMap("Memory")
    public Integer memory;

    // 租户ID。
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
