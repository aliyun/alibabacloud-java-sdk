// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicenseInfoResponseBody extends TeaModel {
    @NameInMap("LicenseInfo")
    public GetLicenseInfoResponseBodyLicenseInfo licenseInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLicenseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseInfoResponseBody self = new GetLicenseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseInfoResponseBody setLicenseInfo(GetLicenseInfoResponseBodyLicenseInfo licenseInfo) {
        this.licenseInfo = licenseInfo;
        return this;
    }
    public GetLicenseInfoResponseBodyLicenseInfo getLicenseInfo() {
        return this.licenseInfo;
    }

    public GetLicenseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLicenseInfoResponseBodyLicenseInfo extends TeaModel {
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

        public static GetLicenseInfoResponseBodyLicenseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLicenseInfoResponseBodyLicenseInfo self = new GetLicenseInfoResponseBodyLicenseInfo();
            return TeaModel.build(map, self);
        }

        public GetLicenseInfoResponseBodyLicenseInfo setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setContractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }
        public String getContractNo() {
            return this.contractNo;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setExpiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }
        public String getExpiredOn() {
            return this.expiredOn;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setLicenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public String getLicenseId() {
            return this.licenseId;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLicenseInfoResponseBodyLicenseInfo setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
