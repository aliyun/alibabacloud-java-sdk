// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddListenerWhiteListItemRequest extends TeaModel {
    /**
     * <p>The frontend port that is used by the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The frontend protocol that is used by the CLB instance.</p>
     * <blockquote>
     * <p> This parameter is required when listeners that use different protocols listen on the same port.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1o94dp5i6ea*******</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP addresses or CIDR blocks that you want to add to the whitelist.</p>
     * <p>This parameter takes effect when the <strong>AccessControlStatus</strong> parameter of the listener is set to <strong>open_white_list</strong>.</p>
     * <p>Separate multiple IP addresses or CIDR blocks with commas (,).</p>
     * <p>You cannot enter <strong>0.0.0.0</strong> or <strong>0.0.0.0/0</strong>. To disable access control, you can call the <a href="https://help.aliyun.com/document_detail/27599.html">SetListenerAccessControlStatus</a> operation to set the value of the <strong>AccessControlStatus</strong> parameter to <strong>close</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceItems")
    public String sourceItems;

    public static AddListenerWhiteListItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddListenerWhiteListItemRequest self = new AddListenerWhiteListItemRequest();
        return TeaModel.build(map, self);
    }

    public AddListenerWhiteListItemRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public AddListenerWhiteListItemRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public AddListenerWhiteListItemRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public AddListenerWhiteListItemRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddListenerWhiteListItemRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddListenerWhiteListItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddListenerWhiteListItemRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddListenerWhiteListItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddListenerWhiteListItemRequest setSourceItems(String sourceItems) {
        this.sourceItems = sourceItems;
        return this;
    }
    public String getSourceItems() {
        return this.sourceItems;
    }

}
