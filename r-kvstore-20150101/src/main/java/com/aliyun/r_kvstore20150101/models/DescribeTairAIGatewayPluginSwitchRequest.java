// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayPluginSwitchRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

    public static DescribeTairAIGatewayPluginSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayPluginSwitchRequest self = new DescribeTairAIGatewayPluginSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayPluginSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairAIGatewayPluginSwitchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTairAIGatewayPluginSwitchRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
