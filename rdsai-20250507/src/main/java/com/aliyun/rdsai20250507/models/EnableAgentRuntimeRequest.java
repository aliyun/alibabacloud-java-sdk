// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class EnableAgentRuntimeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    /**
     * <strong>example:</strong>
     * <p>sg-bp179qkbvlj8ym*****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>vsw-9dp2hkpm22gxscfgy****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static EnableAgentRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAgentRuntimeRequest self = new EnableAgentRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public EnableAgentRuntimeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableAgentRuntimeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public EnableAgentRuntimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableAgentRuntimeRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public EnableAgentRuntimeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
