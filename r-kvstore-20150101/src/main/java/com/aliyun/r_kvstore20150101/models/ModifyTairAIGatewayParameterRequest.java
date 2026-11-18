// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayParameterRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-2zeb1ce76fee****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The JSON-formatted text of parameters and their corresponding values. Format: {&quot;Parameter1&quot;:&quot;Value1&quot;,&quot;Parameter2&quot;:&quot;Value2&quot;,...}. The specified values overwrite the existing values.</p>
     * <blockquote>
     * <p>The parameters available for different versions are subject to the console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;access-db-id&quot;:&quot;1&quot;,&quot;cu-limit&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyTairAIGatewayParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayParameterRequest self = new ModifyTairAIGatewayParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayParameterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTairAIGatewayParameterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyTairAIGatewayParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTairAIGatewayParameterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
