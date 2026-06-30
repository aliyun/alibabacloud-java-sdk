// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class EnableAgentRuntimeRequest extends TeaModel {
    /**
     * <p>The idempotence parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The security group ID used to create an endpoint.</p>
     * <p><strong>If not specified</strong>: The system automatically creates a security group named <strong>sg-aliyun-rds-created-supabase-sandbox</strong> in the VPC where the instance resides. No manual operation is required.</p>
     * <p><strong>If specified</strong>: Ensure that the specified security group allows the CIDR block of the VPC where the Supabase instance resides (both inbound and outbound directions must be allowed). Otherwise, network connectivity issues may occur.</p>
     * <blockquote>
     * <p>Notice: The endpoint is created only once. When the first Supabase instance in a VPC enables the sandbox and Edge Routine capabilities, the system automatically creates the endpoint. When subsequent Supabase instances in the same VPC enable this capability, the existing endpoint is reused and no new endpoint is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp179qkbvlj8ym*****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The vSwitch ID used to create an endpoint. If this parameter is not specified, the vSwitch of the Supabase instance is used by default.</p>
     * <blockquote>
     * <p>Notice: The endpoint is created only once. When the first Supabase instance in a VPC enables the sandbox and Edge Routine capabilities, the system automatically creates the endpoint. When subsequent Supabase instances in the same VPC enable this capability, the existing endpoint is reused and no new endpoint is created.</p>
     * </blockquote>
     * 
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
