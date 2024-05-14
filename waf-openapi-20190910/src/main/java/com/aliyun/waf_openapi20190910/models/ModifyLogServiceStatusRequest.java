// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enabled")
    public Integer enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyLogServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusRequest self = new ModifyLogServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyLogServiceStatusRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

    public ModifyLogServiceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLogServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLogServiceStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
