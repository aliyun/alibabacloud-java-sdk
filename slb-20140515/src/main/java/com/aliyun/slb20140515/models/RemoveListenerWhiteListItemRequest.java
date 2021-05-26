// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveListenerWhiteListItemRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("SourceItems")
    public String sourceItems;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    public static RemoveListenerWhiteListItemRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveListenerWhiteListItemRequest self = new RemoveListenerWhiteListItemRequest();
        return TeaModel.build(map, self);
    }

    public RemoveListenerWhiteListItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveListenerWhiteListItemRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveListenerWhiteListItemRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveListenerWhiteListItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveListenerWhiteListItemRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public RemoveListenerWhiteListItemRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public RemoveListenerWhiteListItemRequest setSourceItems(String sourceItems) {
        this.sourceItems = sourceItems;
        return this;
    }
    public String getSourceItems() {
        return this.sourceItems;
    }

    public RemoveListenerWhiteListItemRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveListenerWhiteListItemRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

}
