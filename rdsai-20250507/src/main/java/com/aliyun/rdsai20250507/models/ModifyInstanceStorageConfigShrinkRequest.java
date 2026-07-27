// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageConfigShrinkRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, which ensures that the request is not repeated.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of storage configurations.</p>
     */
    @NameInMap("ConfigList")
    public String configListShrink;

    /**
     * <p>The instance ID of the AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceStorageConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageConfigShrinkRequest self = new ModifyInstanceStorageConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageConfigShrinkRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public ModifyInstanceStorageConfigShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceStorageConfigShrinkRequest setConfigListShrink(String configListShrink) {
        this.configListShrink = configListShrink;
        return this;
    }
    public String getConfigListShrink() {
        return this.configListShrink;
    }

    public ModifyInstanceStorageConfigShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceStorageConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
