// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether you already have an SAG device. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AlreadyHaveSag")
    public Boolean alreadyHaveSag;

    /**
     * <p>Specifies whether to enable auto-payment for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <p>If you set the parameter to false, go to Billing Management to complete the payment after you call this operation. After you complete the payment, the instance can be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The remarks left by the buyer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("BuyerMessage")
    public String buyerMessage;

    /**
     * <p>The edition of SAG when you create an SAG vCPE instance.</p>
     * <p>Set the value to <strong>basic</strong>, which specifies Basic Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("CPEVersion")
    public String CPEVersion;

    /**
     * <p>The billing method of the SAG instance.</p>
     * <p>Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The description of the SAG instance.</p>
     * <p>The description must be 2 to 256 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The deployment mode. Valid values:</p>
     * <ul>
     * <li><strong>no_backup</strong>: You buy only one SAG device to connect private networks to Alibaba Cloud.</li>
     * <li><strong>cold_backup</strong>: You buy two SAG devices in active-standby mode. One SAG device serves as an active device and the other serves as a standby device. Only the active device is connected to Alibaba Cloud. If the active device is not working as expected, you must manually perform a switchover.</li>
     * <li><strong>warm_backup</strong>: You buy two SAG devices in active-active mode. Both SAG devices are connected to Alibaba Cloud. If an active device is not working as expected, a failover is automatically performed.</li>
     * </ul>
     * <blockquote>
     * <p> If you want to create an SAG vCPE instance, set the value to <strong>warm_backup</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>no_backup</p>
     */
    @NameInMap("HaType")
    public String haType;

    /**
     * <p>The type of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>sag-100wm</strong></li>
     * <li><strong>sag-1000</strong></li>
     * <li><strong>sag-vcpe</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-100wm</p>
     */
    @NameInMap("HardWareSpec")
    public String hardWareSpec;

    /**
     * <p>The bandwidth of the SAG instance.</p>
     * <ul>
     * <li>If you want to create an SAG CPE instance and the model is <strong>sag-100wm</strong>, valid values of this parameter are <strong>2</strong> to <strong>50</strong>. Unit: Mbit/s.</li>
     * <li>If you want to create an SAG CPE instance and the model is <strong>sag-1000</strong>, valid values of this parameter are <strong>10</strong> to <strong>500</strong>. Unit: Mbit/s.</li>
     * <li>If you want to create an SAG vCPE instance, valid values of this parameter are <strong>10</strong> to <strong>1000</strong>. Unit: Mbit/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MaxBandWidth")
    public Integer maxBandWidth;

    /**
     * <p>The name of the SAG instance.</p>
     * <p>The name must be 2 to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the SAG instance. Unit: months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The detailed address of the recipient.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>No.XX</p>
     */
    @NameInMap("ReceiverAddress")
    public String receiverAddress;

    /**
     * <p>The city of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("ReceiverCity")
    public String receiverCity;

    /**
     * <p>The country of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("ReceiverCountry")
    public String receiverCountry;

    /**
     * <p>The district of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>West Lake</p>
     */
    @NameInMap("ReceiverDistrict")
    public String receiverDistrict;

    /**
     * <p>The email address of the recipient.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xx@example.com">xx@example.com</a></p>
     */
    @NameInMap("ReceiverEmail")
    public String receiverEmail;

    /**
     * <p>The mobile phone number of the recipient.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1884085****</p>
     */
    @NameInMap("ReceiverMobile")
    public String receiverMobile;

    /**
     * <p>The name of the recipient.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("ReceiverName")
    public String receiverName;

    /**
     * <p>The landline phone number of the recipient.</p>
     * 
     * <strong>example:</strong>
     * <p>8585****</p>
     */
    @NameInMap("ReceiverPhone")
    public String receiverPhone;

    /**
     * <p>The province of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhejiang</p>
     */
    @NameInMap("ReceiverState")
    public String receiverState;

    /**
     * <p>The town of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhuan Tang</p>
     */
    @NameInMap("ReceiverTown")
    public String receiverTown;

    /**
     * <p>The postcode of the recipient address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>310000</p>
     */
    @NameInMap("ReceiverZip")
    public String receiverZip;

    /**
     * <p>The ID of the region where you want to deploy the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
