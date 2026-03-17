// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateEdgeFunctionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Code")
    public String codeShrink;

    @NameInMap("CustomConfig")
    public String customConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>ef-*****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    @NameInMap("Envs")
    public String envsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateEdgeFunctionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeFunctionShrinkRequest self = new CreateEdgeFunctionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeFunctionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEdgeFunctionShrinkRequest setCodeShrink(String codeShrink) {
        this.codeShrink = codeShrink;
        return this;
    }
    public String getCodeShrink() {
        return this.codeShrink;
    }

    public CreateEdgeFunctionShrinkRequest setCustomConfigShrink(String customConfigShrink) {
        this.customConfigShrink = customConfigShrink;
        return this;
    }
    public String getCustomConfigShrink() {
        return this.customConfigShrink;
    }

    public CreateEdgeFunctionShrinkRequest setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public CreateEdgeFunctionShrinkRequest setEnvsShrink(String envsShrink) {
        this.envsShrink = envsShrink;
        return this;
    }
    public String getEnvsShrink() {
        return this.envsShrink;
    }

    public CreateEdgeFunctionShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateEdgeFunctionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
