// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.</p>
     * <ul>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>: <strong>1</strong> to <strong>500</strong>.****</li>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>: <strong>1</strong> to <strong>200</strong>.****</li>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>: <strong>1</strong> to <strong>1000</strong>.****</li>
     * </ul>
     * <p>Default value: <strong>5</strong>. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subnet mask of the contiguous EIP group. Valid values:</p>
     * <ul>
     * <li><strong>28</strong>: applies for 16 contiguous EIPs in each call.</li>
     * <li><strong>27</strong>: applies for 32 contiguous EIPs in each call.</li>
     * <li><strong>26</strong>: applies for 64 contiguous EIPs in each call.</li>
     * <li><strong>25</strong>: applies for 128 contiguous EIPs in each call.</li>
     * <li><strong>24</strong>: applies for 256 contiguous EIPs in each call.</li>
     * </ul>
     * <blockquote>
     * <p> Some IP address are reserved for specific purposes. Therefore, the actual number of the contiguous EIPs may be one, three, or four less than the expected number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("EipMask")
    public String eipMask;

    /**
     * <p>The metering method of the contiguous EIP group. Valid values:</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong> (default)</li>
     * <li><strong>PayByTraffic</strong></li>
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
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
     * </ul>
     * <p>For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <p>If you are allowed to use single-ISP bandwidth, you can also use one of the following values:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaTelecom_L2</strong></li>
     * <li><strong>ChinaUnicom_L2</strong></li>
     * <li><strong>ChinaMobile_L2</strong></li>
     * </ul>
     * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The network type. Set the value to <strong>public</strong>, which specifies the public network type.</p>
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
     * <p>The ID of the region in which the contiguous EIP group resides.</p>
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
