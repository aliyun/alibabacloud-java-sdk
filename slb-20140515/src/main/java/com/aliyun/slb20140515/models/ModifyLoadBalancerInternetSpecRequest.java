// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerInternetSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically pay the subscription fee of the Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payments. This is the default value.</li>
     * <li><strong>false</strong>: disables automatic payment. You must complete the payment in Order Center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the Internet-facing CLB instance that uses the pay-by-bandwidth metering method. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>1 to 5000</strong>. The maximum bandwidth varies based on the region where the CLB instance is created.****</p>
     * <blockquote>
     * <p> You do not need to specify this parameter if you set <strong>InternetChargeType</strong> to <strong>paybytraffic</strong> (pay-by-data-transfer).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>paybybandwidth</strong>: pay-by-bandwidth</li>
     * <li><strong>paybytraffic</strong>: pay-by-data-transfer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>paybytraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1b6c719dfa08ex******</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static ModifyLoadBalancerInternetSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerInternetSpecRequest self = new ModifyLoadBalancerInternetSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerInternetSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyLoadBalancerInternetSpecRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyLoadBalancerInternetSpecRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ModifyLoadBalancerInternetSpecRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public ModifyLoadBalancerInternetSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLoadBalancerInternetSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLoadBalancerInternetSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLoadBalancerInternetSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLoadBalancerInternetSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
