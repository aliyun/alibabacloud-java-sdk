// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerRequest extends TeaModel {
    /**
     * <p>If the SLB instance that you want to delete has deletion protection enabled, the system reports an error in the following formats:</p>
     * <br>
     * <p>*   JSON format</p>
     * <br>
     * <p>    ```</p>
     * <br>
     * <p>        {</p>
     * <p>        "RequestId": "7B7AB375-1EA6-4A18-9D1C-F258F2D57638",</p>
     * <p>        "HostId": "slb.aliyuncs.com",</p>
     * <p>        "Code": "OperationDenied.DeleteProtectionIsOn",</p>
     * <p>        "Message": "The loadbalancer can\"t be deleted due to DeleteProtection is enabled."</p>
     * <p>         }</p>
     * <p>       </p>
     * <p>    ```</p>
     * <br>
     * <p>*   XML format</p>
     * <br>
     * <p>    ```</p>
     * <br>
     * <p>       <?xml version="1.0" encoding="UTF-8" ?></p>
     * <p>            <DeleteLoadBabalancerResponse></p>
     * <p>        <RequestId>7B7AB375-1EA6-4A18-9D1C-F258F2D57638</RequestId></p>
     * <p>        <HostId>slb.aliyuncs.com</HostId></p>
     * <p>        <Code>OperationDenied.DeleteProtectionIsOn</Code></p>
     * <p>        <Message>The loadbalancer can\"t be deleted due to DeleteProtection is enabled.</Message></p>
     * <p>           </DeleteLoadBabalancerResponse></p>
     * <p>       </p>
     * <p>    ```</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerRequest self = new DeleteLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DeleteLoadBalancerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteLoadBalancerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLoadBalancerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteLoadBalancerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
