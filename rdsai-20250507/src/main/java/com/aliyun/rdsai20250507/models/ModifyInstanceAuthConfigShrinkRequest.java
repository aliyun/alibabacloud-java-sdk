// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceAuthConfigShrinkRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The list of authentication configurations.</p>
     */
    @NameInMap("ConfigList")
    public String configListShrink;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region.</p>
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

    public ModifyInstanceAuthConfigShrinkRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
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
