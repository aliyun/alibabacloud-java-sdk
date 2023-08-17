// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the VPC peering connection that you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static GetVpcPeerConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPeerConnectionAttributeRequest self = new GetVpcPeerConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcPeerConnectionAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVpcPeerConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
