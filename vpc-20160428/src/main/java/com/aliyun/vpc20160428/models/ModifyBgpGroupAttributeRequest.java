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
     * <p>The ID of the BGP group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bgpg-wz9f62v4fbg2g****</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>Specifies whether to clear the authentication key. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClearAuthKey")
    public Boolean clearAuthKey;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the BGP group.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to use a fake ASN. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>A router that runs BGP can belong to only one AS. When you need to replace an existing AS with a new one (for example, during AS migration or merger with another AS) and cannot immediately modify the BGP configuration due to business constraints, you can specify a fake ASN to establish a connection with the local end to ensure service continuity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    /**
     * <p>The custom Alibaba Cloud-side BGP autonomous system number (ASN). Valid values:</p>
     * <ul>
     * <li><strong>45104</strong></li>
     * <li><strong>64512 to 65534</strong></li>
     * <li><strong>4200000000 to 4294967294</strong></li>
     * </ul>
     * <blockquote>
     * <p><strong>65025</strong> is reserved by Alibaba Cloud. The Alibaba Cloud side uses <strong>45104</strong> as the default <strong>LocalAsn</strong> value. Using a custom <strong>LocalAsn</strong> value in multi-ISP access scenarios may cause BGP routing loops. Evaluate the risks before you use this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("LocalAsn")
    public Long localAsn;

    /**
     * <p>The name of the BGP group. </p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <p>The ASN of the on-premises device.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("PeerAsn")
    public Long peerAsn;

    /**
     * <p>The region ID of the BGP group. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The maximum number of routes for a BGP peer. Unit: entries. Default value: <strong>110</strong>.</p>
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
