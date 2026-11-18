// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayParametersRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The plug-in type. You can use this parameter to filter the parameters of a specific plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>ai_cache</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeTairAIGatewayParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayParametersRequest self = new DescribeTairAIGatewayParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairAIGatewayParametersRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public DescribeTairAIGatewayParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTairAIGatewayParametersRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
