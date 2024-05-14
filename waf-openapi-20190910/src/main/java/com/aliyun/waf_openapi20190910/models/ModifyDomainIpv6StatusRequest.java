// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainIpv6StatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDomainIpv6StatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainIpv6StatusRequest self = new ModifyDomainIpv6StatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainIpv6StatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainIpv6StatusRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public ModifyDomainIpv6StatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainIpv6StatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDomainIpv6StatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
