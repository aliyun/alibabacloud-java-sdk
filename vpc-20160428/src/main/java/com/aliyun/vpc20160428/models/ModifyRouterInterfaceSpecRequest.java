// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the router interface is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the router interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urzd****</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    /**
     * <p>The specification of the router interface. Valid specifications and bandwidth values:</p>
     * <ul>
     * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
     * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
     * <li><strong>Small.1</strong>: 10 Mbit/s</li>
     * <li><strong>Small.2</strong>: 20 Mbit/s</li>
     * <li><strong>Small.5</strong>: 50 Mbit/s</li>
     * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
     * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
     * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
     * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
     * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
     * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
     * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
     * </ul>
     * <blockquote>
     * <p> When <strong>Role</strong> is set to <strong>AcceptingSide</strong>, set <strong>Spec</strong> to <strong>Negative</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Small.1</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyRouterInterfaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecRequest self = new ModifyRouterInterfaceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyRouterInterfaceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouterInterfaceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouterInterfaceSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouterInterfaceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouterInterfaceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouterInterfaceSpecRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public ModifyRouterInterfaceSpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
