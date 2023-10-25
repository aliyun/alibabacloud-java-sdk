// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetListenerAccessControlStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the whitelist. Valid values:</p>
     * <br>
     * <p>*   **open_white_list**: enables the whitelist.</p>
     * <p>*   **close**: disables the whitelist.</p>
     * <br>
     * <p>>  After the whitelist is enabled, if no IP address is added to the whitelist, the CLB instance does not distribute network traffic.</p>
     */
    @NameInMap("AccessControlStatus")
    public String accessControlStatus;

    /**
     * <p>The frontend port that is used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1 to 65535**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The frontend protocol that is used by the CLB instance.</p>
     * <br>
     * <p>>  This parameter is required when listeners that use different protocols listen on the same port.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the Classic Load Balancer (CLB) instance is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetListenerAccessControlStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetListenerAccessControlStatusRequest self = new SetListenerAccessControlStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetListenerAccessControlStatusRequest setAccessControlStatus(String accessControlStatus) {
        this.accessControlStatus = accessControlStatus;
        return this;
    }
    public String getAccessControlStatus() {
        return this.accessControlStatus;
    }

    public SetListenerAccessControlStatusRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetListenerAccessControlStatusRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public SetListenerAccessControlStatusRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetListenerAccessControlStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetListenerAccessControlStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetListenerAccessControlStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetListenerAccessControlStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetListenerAccessControlStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
