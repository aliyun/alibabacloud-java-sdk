// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceRAGConfigShrinkRequest extends TeaModel {
    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the RAG agent. If you do not configure this parameter, the RAG agent state remains unchanged. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     */
    @NameInMap("ConfigList")
    public String configListShrink;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceRAGConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyInstanceRAGConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRAGConfigShrinkRequest self = new ModifyInstanceRAGConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRAGConfigShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceRAGConfigShrinkRequest setConfigListShrink(String configListShrink) {
        this.configListShrink = configListShrink;
        return this;
    }
    public String getConfigListShrink() {
        return this.configListShrink;
    }

    public ModifyInstanceRAGConfigShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceRAGConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceRAGConfigShrinkRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
