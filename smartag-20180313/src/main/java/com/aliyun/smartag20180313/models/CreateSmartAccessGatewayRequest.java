// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayRequest extends TeaModel {
    @NameInMap("AlreadyHaveSag")
    public Boolean alreadyHaveSag;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("BuyerMessage")
    public String buyerMessage;

    @NameInMap("CPEVersion")
    public String CPEVersion;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Description")
    public String description;

    @NameInMap("HaType")
    public String haType;

    @NameInMap("HardWareSpec")
    public String hardWareSpec;

    @NameInMap("MaxBandWidth")
    public Integer maxBandWidth;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("ReceiverAddress")
    public String receiverAddress;

    @NameInMap("ReceiverCity")
    public String receiverCity;

    @NameInMap("ReceiverCountry")
    public String receiverCountry;

    @NameInMap("ReceiverDistrict")
    public String receiverDistrict;

    @NameInMap("ReceiverEmail")
    public String receiverEmail;

    @NameInMap("ReceiverMobile")
    public String receiverMobile;

    @NameInMap("ReceiverName")
    public String receiverName;

    @NameInMap("ReceiverPhone")
    public String receiverPhone;

    @NameInMap("ReceiverState")
    public String receiverState;

    @NameInMap("ReceiverTown")
    public String receiverTown;

    @NameInMap("ReceiverZip")
    public String receiverZip;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSmartAccessGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayRequest self = new CreateSmartAccessGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayRequest setAlreadyHaveSag(Boolean alreadyHaveSag) {
        this.alreadyHaveSag = alreadyHaveSag;
        return this;
    }
    public Boolean getAlreadyHaveSag() {
        return this.alreadyHaveSag;
    }

    public CreateSmartAccessGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateSmartAccessGatewayRequest setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
        return this;
    }
    public String getBuyerMessage() {
        return this.buyerMessage;
    }

    public CreateSmartAccessGatewayRequest setCPEVersion(String CPEVersion) {
        this.CPEVersion = CPEVersion;
        return this;
    }
    public String getCPEVersion() {
        return this.CPEVersion;
    }

    public CreateSmartAccessGatewayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateSmartAccessGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSmartAccessGatewayRequest setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public CreateSmartAccessGatewayRequest setHardWareSpec(String hardWareSpec) {
        this.hardWareSpec = hardWareSpec;
        return this;
    }
    public String getHardWareSpec() {
        return this.hardWareSpec;
    }

    public CreateSmartAccessGatewayRequest setMaxBandWidth(Integer maxBandWidth) {
        this.maxBandWidth = maxBandWidth;
        return this;
    }
    public Integer getMaxBandWidth() {
        return this.maxBandWidth;
    }

    public CreateSmartAccessGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSmartAccessGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSmartAccessGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmartAccessGatewayRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateSmartAccessGatewayRequest setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public CreateSmartAccessGatewayRequest setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
        return this;
    }
    public String getReceiverCity() {
        return this.receiverCity;
    }

    public CreateSmartAccessGatewayRequest setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
        return this;
    }
    public String getReceiverCountry() {
        return this.receiverCountry;
    }

    public CreateSmartAccessGatewayRequest setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
        return this;
    }
    public String getReceiverDistrict() {
        return this.receiverDistrict;
    }

    public CreateSmartAccessGatewayRequest setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
        return this;
    }
    public String getReceiverEmail() {
        return this.receiverEmail;
    }

    public CreateSmartAccessGatewayRequest setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
        return this;
    }
    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public CreateSmartAccessGatewayRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public CreateSmartAccessGatewayRequest setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public CreateSmartAccessGatewayRequest setReceiverState(String receiverState) {
        this.receiverState = receiverState;
        return this;
    }
    public String getReceiverState() {
        return this.receiverState;
    }

    public CreateSmartAccessGatewayRequest setReceiverTown(String receiverTown) {
        this.receiverTown = receiverTown;
        return this;
    }
    public String getReceiverTown() {
        return this.receiverTown;
    }

    public CreateSmartAccessGatewayRequest setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
        return this;
    }
    public String getReceiverZip() {
        return this.receiverZip;
    }

    public CreateSmartAccessGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSmartAccessGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmartAccessGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
