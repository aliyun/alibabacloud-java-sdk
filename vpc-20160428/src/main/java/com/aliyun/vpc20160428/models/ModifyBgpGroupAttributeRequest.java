// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeRequest extends TeaModel {
    /**
     * <p>The authentication key of the BGP group.</p>
     * 
     * <strong>example:</strong>
     * <p>!PWZ2****</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The BGP group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bgpg-wz9f62v4fbg2g****</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>Specifies whether to clear the secret key. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClearAuthKey")
    public Boolean clearAuthKey;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The BGP group description.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to use a fake AS number. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * <blockquote>
     * <p>A router that runs BGP typically belongs to only one AS. If you need to replace an AS with a new one, but you cannot immediately modify BGP configurations due to business requirements, you can specify a fake AS number to establish a connection with the local end. This ensures service continuity in scenarios such as AS migration or AS merging.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    /**
     * <p>The custom autonomous system number (ASN) of the BGP on the Alibaba Cloud side. Valid values:</p>
     * <ul>
     * <li><strong>45104</strong></li>
     * <li><strong>64512~65534</strong></li>
     * <li><strong>4200000000~4294967294</strong></li>
     * </ul>
     * <blockquote>
     * <p> <strong>65025</strong> is reserved by Alibaba Cloud. Alibaba Cloud uses <strong>45104</strong> as the <strong>local ASN</strong> by default. Custom <strong>local ASNs</strong> may cause loops in multi-line scenarios. Proceed with caution.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("LocalAsn")
    public Long localAsn;

    /**
     * <p>The BGP group name.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ASN of the gateway device in the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("PeerAsn")
    public Long peerAsn;

    /**
     * <p>The region ID of the BGP group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of routes supported by a BGP peer. Default value: <strong>110</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("RouteQuota")
    public Integer routeQuota;

    public static ModifyBgpGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeRequest self = new ModifyBgpGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBgpGroupAttributeRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ModifyBgpGroupAttributeRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public ModifyBgpGroupAttributeRequest setClearAuthKey(Boolean clearAuthKey) {
        this.clearAuthKey = clearAuthKey;
        return this;
    }
    public Boolean getClearAuthKey() {
        return this.clearAuthKey;
    }

    public ModifyBgpGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBgpGroupAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBgpGroupAttributeRequest setIsFakeAsn(Boolean isFakeAsn) {
        this.isFakeAsn = isFakeAsn;
        return this;
    }
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    public ModifyBgpGroupAttributeRequest setLocalAsn(Long localAsn) {
        this.localAsn = localAsn;
        return this;
    }
    public Long getLocalAsn() {
        return this.localAsn;
    }

    public ModifyBgpGroupAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBgpGroupAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBgpGroupAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBgpGroupAttributeRequest setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }
    public Long getPeerAsn() {
        return this.peerAsn;
    }

    public ModifyBgpGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBgpGroupAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBgpGroupAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyBgpGroupAttributeRequest setRouteQuota(Integer routeQuota) {
        this.routeQuota = routeQuota;
        return this;
    }
    public Integer getRouteQuota() {
        return this.routeQuota;
    }

}
