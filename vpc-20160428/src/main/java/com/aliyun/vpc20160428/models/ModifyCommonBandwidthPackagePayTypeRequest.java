// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("KbpsBandwidth")
    public String kbpsBandwidth;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceBid")
    public String resourceBid;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    public static ModifyCommonBandwidthPackagePayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeRequest self = new ModifyCommonBandwidthPackagePayTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setKbpsBandwidth(String kbpsBandwidth) {
        this.kbpsBandwidth = kbpsBandwidth;
        return this;
    }
    public String getKbpsBandwidth() {
        return this.kbpsBandwidth;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setResourceBid(String resourceBid) {
        this.resourceBid = resourceBid;
        return this;
    }
    public String getResourceBid() {
        return this.resourceBid;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCommonBandwidthPackagePayTypeRequest setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

}
