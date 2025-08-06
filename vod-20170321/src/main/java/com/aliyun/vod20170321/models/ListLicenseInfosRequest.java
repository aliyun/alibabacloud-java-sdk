// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLicenseInfosRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("EndBeginTime")
    public String endBeginTime;

    @NameInMap("EndExpiredOn")
    public String endExpiredOn;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("LicenseId")
    public String licenseId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StartBeginTime")
    public String startBeginTime;

    @NameInMap("StartExpiredOn")
    public String startExpiredOn;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static ListLicenseInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLicenseInfosRequest self = new ListLicenseInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListLicenseInfosRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListLicenseInfosRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListLicenseInfosRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public ListLicenseInfosRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ListLicenseInfosRequest setEndBeginTime(String endBeginTime) {
        this.endBeginTime = endBeginTime;
        return this;
    }
    public String getEndBeginTime() {
        return this.endBeginTime;
    }

    public ListLicenseInfosRequest setEndExpiredOn(String endExpiredOn) {
        this.endExpiredOn = endExpiredOn;
        return this;
    }
    public String getEndExpiredOn() {
        return this.endExpiredOn;
    }

    public ListLicenseInfosRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ListLicenseInfosRequest setLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }
    public String getLicenseId() {
        return this.licenseId;
    }

    public ListLicenseInfosRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLicenseInfosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLicenseInfosRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLicenseInfosRequest setStartBeginTime(String startBeginTime) {
        this.startBeginTime = startBeginTime;
        return this;
    }
    public String getStartBeginTime() {
        return this.startBeginTime;
    }

    public ListLicenseInfosRequest setStartExpiredOn(String startExpiredOn) {
        this.startExpiredOn = startExpiredOn;
        return this;
    }
    public String getStartExpiredOn() {
        return this.startExpiredOn;
    }

    public ListLicenseInfosRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListLicenseInfosRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
