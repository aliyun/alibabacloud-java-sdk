// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLicenseInfosResponseBody extends TeaModel {
    @NameInMap("LicenseList")
    public java.util.List<ListLicenseInfosResponseBodyLicenseList> licenseList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListLicenseInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLicenseInfosResponseBody self = new ListLicenseInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLicenseInfosResponseBody setLicenseList(java.util.List<ListLicenseInfosResponseBodyLicenseList> licenseList) {
        this.licenseList = licenseList;
        return this;
    }
    public java.util.List<ListLicenseInfosResponseBodyLicenseList> getLicenseList() {
        return this.licenseList;
    }

    public ListLicenseInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLicenseInfosResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListLicenseInfosResponseBodyLicenseList extends TeaModel {
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

        public static ListLicenseInfosResponseBodyLicenseList build(java.util.Map<String, ?> map) throws Exception {
            ListLicenseInfosResponseBodyLicenseList self = new ListLicenseInfosResponseBodyLicenseList();
            return TeaModel.build(map, self);
        }

        public ListLicenseInfosResponseBodyLicenseList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListLicenseInfosResponseBodyLicenseList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListLicenseInfosResponseBodyLicenseList setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListLicenseInfosResponseBodyLicenseList setContractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }
        public String getContractNo() {
            return this.contractNo;
        }

        public ListLicenseInfosResponseBodyLicenseList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLicenseInfosResponseBodyLicenseList setExpiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }
        public String getExpiredOn() {
            return this.expiredOn;
        }

        public ListLicenseInfosResponseBodyLicenseList setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ListLicenseInfosResponseBodyLicenseList setLicenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public String getLicenseId() {
            return this.licenseId;
        }

        public ListLicenseInfosResponseBodyLicenseList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListLicenseInfosResponseBodyLicenseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLicenseInfosResponseBodyLicenseList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLicenseInfosResponseBodyLicenseList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
