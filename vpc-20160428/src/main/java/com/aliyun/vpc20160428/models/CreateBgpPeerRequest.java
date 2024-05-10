// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerRequest extends TeaModel {
    /**
     * <p>The BFD hop count. Valid values: **1** to **255**.</p>
     * <br>
     * <p>This parameter is required only if you enable BFD.</p>
     * <br>
     * <p>The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. Set a value based on your network topology.</p>
     */
    @NameInMap("BfdMultiHop")
    public Integer bfdMultiHop;

    /**
     * <p>The ID of the BGP group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses the value of **RequestId** as **ClientToken**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the Bidirectional Forwarding Detection (BFD) feature. Valid values:</p>
     * <br>
     * <p>*   **true**: enables BFD.</p>
     * <p>*   **false**: disables BFD.</p>
     */
    @NameInMap("EnableBfd")
    public Boolean enableBfd;

    /**
     * <p>The IP version. Valid values:</p>
     * <br>
     * <p>*   **IPv4**: This is the default value.</p>
     * <p>*   **IPv6**: IPv6 is supported only if the VBR for which you want to create the BGP group has IPv6 enabled.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address of the BGP peer.</p>
     */
    @NameInMap("PeerIpAddress")
    public String peerIpAddress;

    /**
     * <p>The ID of the region to which the BGP group belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateBgpPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerRequest self = new CreateBgpPeerRequest();
        return TeaModel.build(map, self);
    }

    public CreateBgpPeerRequest setBfdMultiHop(Integer bfdMultiHop) {
        this.bfdMultiHop = bfdMultiHop;
        return this;
    }
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

    public CreateBgpPeerRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public CreateBgpPeerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBgpPeerRequest setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }
    public Boolean getEnableBfd() {
        return this.enableBfd;
    }

    public CreateBgpPeerRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateBgpPeerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateBgpPeerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateBgpPeerRequest setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
        return this;
    }
    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    public CreateBgpPeerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBgpPeerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateBgpPeerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
