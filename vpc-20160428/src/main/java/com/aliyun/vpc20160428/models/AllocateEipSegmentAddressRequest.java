// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <ul>
     * <li><p>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>500</strong>.</p>
     * </li>
     * <li><p>If <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>200</strong>.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>5</strong> Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subnet mask of the contiguous EIPs. Valid values:</p>
     * <ul>
     * <li><p><strong>28</strong>: The system allocates 16 contiguous EIPs per call.</p>
     * </li>
     * <li><p><strong>27</strong>: The system allocates 32 contiguous EIPs per call.</p>
     * </li>
     * <li><p><strong>26</strong>: The system allocates 64 contiguous EIPs per call.</p>
     * </li>
     * <li><p><strong>25</strong>: The system allocates 128 contiguous EIPs per call.</p>
     * </li>
     * <li><p><strong>24</strong>: The system allocates 256 contiguous EIPs per call.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Due to IP address reservation, the actual number of contiguous EIPs may be 1, 3, or 4 fewer than expected.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("EipMask")
    public String eipMask;

    /**
     * <p>The billable methods of the contiguous EIPs. Valid values:</p>
     * <ul>
     * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
     * </li>
     * <li><p><strong>PayByTraffic</strong>: pay-by-data-transfer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. All regions support BGP (multi-ISP) EIPs.</li>
     * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) premium line. Only Hong Kong (China), Singapore, Tokyo (Japan), Kuala Lumpur (Malaysia), Manila (Philippines), Jakarta (Indonesia), and Bangkok (Thailand) regions support BGP (multi-ISP) premium EIPs.</li>
     * </ul>
     * <p>For more information about BGP (multi-ISP) lines and BGP (multi-ISP) premium lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <p>If you are a whitelist user of single-ISP bandwidth, you can also select the following types:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom</li>
     * <li><strong>ChinaMobile</strong>: China Mobile</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
     * </ul>
     * <p>If you are an Alibaba Finance Cloud user, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The network type. Set the value to <strong>public</strong>, which specifies the public network.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the contiguous EIPs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone of the contiguous EIP group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static AllocateEipSegmentAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressRequest self = new AllocateEipSegmentAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipSegmentAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipSegmentAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateEipSegmentAddressRequest setEipMask(String eipMask) {
        this.eipMask = eipMask;
        return this;
    }
    public String getEipMask() {
        return this.eipMask;
    }

    public AllocateEipSegmentAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipSegmentAddressRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AllocateEipSegmentAddressRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipSegmentAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateEipSegmentAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateEipSegmentAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipSegmentAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipSegmentAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateEipSegmentAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateEipSegmentAddressRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
