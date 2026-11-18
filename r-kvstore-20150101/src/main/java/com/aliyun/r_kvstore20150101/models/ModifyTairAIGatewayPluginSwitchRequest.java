// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayPluginSwitchRequest extends TeaModel {
    /**
     * <p>The Tair AI gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The plug-in switch parameters for the Tair AI gateway instance. Format: {&quot;PluginName1&quot;:&quot;true/false&quot;,&quot;PluginName2&quot;:&quot;true/false&quot;,...}. The specified values overwrite the existing values.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;lang_cache\&quot;:\&quot;false\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyTairAIGatewayPluginSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayPluginSwitchRequest self = new ModifyTairAIGatewayPluginSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayPluginSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTairAIGatewayPluginSwitchRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyTairAIGatewayPluginSwitchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTairAIGatewayPluginSwitchRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
