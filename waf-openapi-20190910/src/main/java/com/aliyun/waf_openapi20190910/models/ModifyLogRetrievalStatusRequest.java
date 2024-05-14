// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogRetrievalStatusRequest extends TeaModel {
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

    public static ModifyLogRetrievalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogRetrievalStatusRequest self = new ModifyLogRetrievalStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogRetrievalStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyLogRetrievalStatusRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

    public ModifyLogRetrievalStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLogRetrievalStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLogRetrievalStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
