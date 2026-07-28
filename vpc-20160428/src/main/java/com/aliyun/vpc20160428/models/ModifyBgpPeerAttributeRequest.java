// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeRequest extends TeaModel {
    /**
     * <p>The BFD hop count. Valid values: <strong>1</strong> to <strong>255</strong>.</p>
     * <p>This parameter is required when BFD is enabled.
     * Enter the BFD hop count, which specifies the maximum number of devices that data passes through from the source to the destination. You can configure different hop counts based on the actual physical link conditions.</p>
     * <blockquote>
     * <p>If you use BFD in a multi-cloud environment or a direct fiber connection topology where no bridging devices exist, change the default BFD hop count from <strong>255</strong> to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BfdMultiHop")
    public Integer bfdMultiHop;

    /**
     * <p>The ID of the BGP group to which the BGP peer belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>bgpg-m5eo12jxuw2hc0uqq****</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>The ID of the BGP peer whose attributes you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bgp-m5eoyp2mwegk8ce9v****</p>
     */
    @NameInMap("BgpPeerId")
    public String bgpPeerId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client generates the value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable Bidirectional Forwarding Detection (BFD). Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables BFD.</p>
     * </li>
     * <li><p><strong>false</strong> (default): does not enable BFD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableBfd")
    public Boolean enableBfd;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address of the BGP peer.</p>
     * 
     * <strong>example:</strong>
     * <p>116.62.XX.XX</p>
     */
    @NameInMap("PeerIpAddress")
    public String peerIpAddress;

    /**
     * <p>The region ID of the BGP group to which the BGP peer belongs. </p>
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

    public static ModifyBgpPeerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeRequest self = new ModifyBgpPeerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBgpPeerAttributeRequest setBfdMultiHop(Integer bfdMultiHop) {
        this.bfdMultiHop = bfdMultiHop;
        return this;
    }
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

    public ModifyBgpPeerAttributeRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public ModifyBgpPeerAttributeRequest setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
        return this;
    }
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    public ModifyBgpPeerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBgpPeerAttributeRequest setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }
    public Boolean getEnableBfd() {
        return this.enableBfd;
    }

    public ModifyBgpPeerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBgpPeerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBgpPeerAttributeRequest setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
        return this;
    }
    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    public ModifyBgpPeerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBgpPeerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBgpPeerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
