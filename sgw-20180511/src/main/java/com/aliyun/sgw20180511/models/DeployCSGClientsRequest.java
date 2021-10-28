// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployCSGClientsRequest extends TeaModel {
    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("EcsInstanceIds")
    public java.util.List<String> ecsInstanceIds;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcId")
    public String vpcId;

    public static DeployCSGClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployCSGClientsRequest self = new DeployCSGClientsRequest();
        return TeaModel.build(map, self);
    }

    public DeployCSGClientsRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DeployCSGClientsRequest setEcsInstanceIds(java.util.List<String> ecsInstanceIds) {
        this.ecsInstanceIds = ecsInstanceIds;
        return this;
    }
    public java.util.List<String> getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    public DeployCSGClientsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeployCSGClientsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
