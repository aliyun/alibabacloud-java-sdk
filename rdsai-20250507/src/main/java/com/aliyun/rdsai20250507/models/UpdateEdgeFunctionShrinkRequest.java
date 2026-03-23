// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateEdgeFunctionShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The error code that is returned if the request failed. For more information, see the &quot;Error codes&quot; section of the topic.</p>
     */
    @NameInMap("Code")
    public String codeShrink;

    /**
     * <p>The configuration parameters of the edge function.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomConfig")
    public String customConfigShrink;

    /**
     * <p>fc-xxxx</p>
     * 
     * <strong>example:</strong>
     * <p>ef-****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    /**
     * <p>The environment variables of the edge function.</p>
     */
    @NameInMap("Envs")
    public String envsShrink;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
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

    public static UpdateEdgeFunctionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeFunctionShrinkRequest self = new UpdateEdgeFunctionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeFunctionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEdgeFunctionShrinkRequest setCodeShrink(String codeShrink) {
        this.codeShrink = codeShrink;
        return this;
    }
    public String getCodeShrink() {
        return this.codeShrink;
    }

    public UpdateEdgeFunctionShrinkRequest setCustomConfigShrink(String customConfigShrink) {
        this.customConfigShrink = customConfigShrink;
        return this;
    }
    public String getCustomConfigShrink() {
        return this.customConfigShrink;
    }

    public UpdateEdgeFunctionShrinkRequest setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public UpdateEdgeFunctionShrinkRequest setEnvsShrink(String envsShrink) {
        this.envsShrink = envsShrink;
        return this;
    }
    public String getEnvsShrink() {
        return this.envsShrink;
    }

    public UpdateEdgeFunctionShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateEdgeFunctionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
