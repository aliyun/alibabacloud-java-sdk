// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceAuthConfigShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the RDS Supabase instance.</p>
     */
    @NameInMap("ConfigList")
    public String configListShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceAuthConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceAuthConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAuthConfigShrinkRequest self = new ModifyInstanceAuthConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAuthConfigShrinkRequest setConfigListShrink(String configListShrink) {
        this.configListShrink = configListShrink;
        return this;
    }
    public String getConfigListShrink() {
        return this.configListShrink;
    }

    public ModifyInstanceAuthConfigShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAuthConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
