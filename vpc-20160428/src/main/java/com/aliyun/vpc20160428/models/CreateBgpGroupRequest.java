// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupRequest extends TeaModel {
    /**
     * <p>The authentication key of the BGP group.</p>
     * 
     * <strong>example:</strong>
     * <p>!PWZ2****</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

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
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default): IPv4.</li>
     * <li><strong>IPv6</strong>: IPv6. IPv6 is supported only when the VBR for which the BGP group is created has the enable IPv6 feature turned on.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>Specifies whether to use a fake ASN. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>A router that runs BGP can belong to only one AS. When you need to replace an existing AS with a new one (for example, due to AS migration or merger with another AS) and cannot immediately modify the BGP configuration because of business or other objective factors, you can specify a fake ASN to establish a connection with the local end to ensure service continuity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    /**
     * <p>The custom ASN on the Alibaba Cloud side. Valid values:</p>
     * <ul>
     * <li><strong>45104</strong></li>
     * <li><strong>64512 to 65534</strong></li>
     * <li><strong>4200000000 to 4294967294</strong></li>
     * </ul>
     * <blockquote>
     * <p><strong>65025</strong> is reserved by Alibaba Cloud. The default value of LocalAsn on the Alibaba Cloud side is <strong>45104</strong>. Using a custom LocalAsn in multi-line access scenarios may cause BGP routing loops. Evaluate the risks before you use this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>45104</p>
     */
    @NameInMap("LocalAsn")
    public Long localAsn;

    /**
     * <p>The name of the BGP group.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
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
     * <p>The ASN of the device on the on-premises data center side.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("PeerAsn")
    public Long peerAsn;

    /**
     * <p>The region ID of the VBR. </p>
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
     * <p>The maximum number of routes for a BGP peer. Unit: routes. Default value: <strong>110</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("RouteQuota")
    public Integer routeQuota;

    /**
     * <p>The ID of the VBR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp1ctxy813985gkuk****</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    public static CreateBgpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupRequest self = new CreateBgpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateBgpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBgpGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBgpGroupRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateBgpGroupRequest setIsFakeAsn(Boolean isFakeAsn) {
        this.isFakeAsn = isFakeAsn;
        return this;
    }
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    public CreateBgpGroupRequest setLocalAsn(Long localAsn) {
        this.localAsn = localAsn;
        return this;
    }
    public Long getLocalAsn() {
        return this.localAsn;
    }

    public CreateBgpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBgpGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateBgpGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateBgpGroupRequest setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }
    public Long getPeerAsn() {
        return this.peerAsn;
    }

    public CreateBgpGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBgpGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateBgpGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateBgpGroupRequest setRouteQuota(Integer routeQuota) {
        this.routeQuota = routeQuota;
        return this;
    }
    public Integer getRouteQuota() {
        return this.routeQuota;
    }

    public CreateBgpGroupRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

}
