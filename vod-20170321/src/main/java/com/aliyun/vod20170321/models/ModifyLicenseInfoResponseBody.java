// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoResponseBody extends TeaModel {
    @NameInMap("LicenseInfo")
    public ModifyLicenseInfoResponseBodyLicenseInfo licenseInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLicenseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLicenseInfoResponseBody self = new ModifyLicenseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLicenseInfoResponseBody setLicenseInfo(ModifyLicenseInfoResponseBodyLicenseInfo licenseInfo) {
        this.licenseInfo = licenseInfo;
        return this;
    }
    public ModifyLicenseInfoResponseBodyLicenseInfo getLicenseInfo() {
        return this.licenseInfo;
    }

    public ModifyLicenseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLicenseInfoResponseBodyLicenseInfo extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("ContractNo")
        public String contractNo;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpiredOn")
        public String expiredOn;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("LicenseId")
        public String licenseId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public Long userId;

        public static ModifyLicenseInfoResponseBodyLicenseInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyLicenseInfoResponseBodyLicenseInfo self = new ModifyLicenseInfoResponseBodyLicenseInfo();
            return TeaModel.build(map, self);
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setContractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }
        public String getContractNo() {
            return this.contractNo;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setExpiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }
        public String getExpiredOn() {
            return this.expiredOn;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setLicenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public String getLicenseId() {
            return this.licenseId;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyLicenseInfoResponseBodyLicenseInfo setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
