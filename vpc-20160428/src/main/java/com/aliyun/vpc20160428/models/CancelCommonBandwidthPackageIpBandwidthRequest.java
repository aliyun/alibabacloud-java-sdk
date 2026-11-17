// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelCommonBandwidthPackageIpBandwidthRequest extends TeaModel {
    /**
     * <p>The instance ID of the Internet Shared Bandwidth.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-bp13d0m4e2qv8xxxxxxxx</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The ID of the EIP that is added to the Internet Shared Bandwidth instance. This parameter applies only to EIPs. For IPv6 addresses, use IpInstanceId.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zewysoansu0sxxxxxxxx</p>
     */
    @NameInMap("EipId")
    public String eipId;

    /**
     * <p>The ID of the public IP address instance for which you want to cancel the maximum available bandwidth setting in the Internet Shared Bandwidth instance. This parameter and <code>EipId</code> are mutually exclusive. We recommend that you use this parameter for new workloads. If IpType is set to <strong>VpcIpv6</strong>, specify the IPv6 instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zewysoansu0svfbg****</p>
     */
    @NameInMap("IpInstanceId")
    public String ipInstanceId;

    /**
     * <p>The resource type of the public IP address for which you want to cancel the maximum available bandwidth setting in the Internet Shared Bandwidth instance. Valid values:</p>
     * <ul>
     * <li><strong>EIP</strong>: the public IP address of an EIP.</li>
     * <li><strong>VpcIpv6</strong>: the IPv6 address of a VPC.</li>
     * </ul>
     * <p>If you do not specify this parameter, <strong>EIP</strong> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("IpType")
    public String ipType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Internet Shared Bandwidth instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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

    public static CancelCommonBandwidthPackageIpBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCommonBandwidthPackageIpBandwidthRequest self = new CancelCommonBandwidthPackageIpBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setIpInstanceId(String ipInstanceId) {
        this.ipInstanceId = ipInstanceId;
        return this;
    }
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelCommonBandwidthPackageIpBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
