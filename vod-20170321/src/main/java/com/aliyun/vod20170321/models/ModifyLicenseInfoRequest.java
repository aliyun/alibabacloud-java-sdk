// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LicenseId")
    public String licenseId;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Type")
    public String type;

    public static ModifyLicenseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLicenseInfoRequest self = new ModifyLicenseInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLicenseInfoRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ModifyLicenseInfoRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public ModifyLicenseInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ModifyLicenseInfoRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public ModifyLicenseInfoRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ModifyLicenseInfoRequest setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public ModifyLicenseInfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ModifyLicenseInfoRequest setLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }
    public String getLicenseId() {
        return this.licenseId;
    }

    public ModifyLicenseInfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ModifyLicenseInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
