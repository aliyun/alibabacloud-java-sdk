// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationsRequest extends TeaModel {
    @NameInMap("ApplicantName")
    public String applicantName;

    @NameInMap("ApplicationStatus")
    public Integer applicationStatus;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("SupplementStatus")
    public Integer supplementStatus;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("TrademarkNumber")
    public String trademarkNumber;

    @NameInMap("UserId")
    public String userId;

    public static ListAdminTrademarkApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationsRequest self = new ListAdminTrademarkApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationsRequest setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public ListAdminTrademarkApplicationsRequest setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public ListAdminTrademarkApplicationsRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public ListAdminTrademarkApplicationsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAdminTrademarkApplicationsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListAdminTrademarkApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAdminTrademarkApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAdminTrademarkApplicationsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListAdminTrademarkApplicationsRequest setSupplementStatus(Integer supplementStatus) {
        this.supplementStatus = supplementStatus;
        return this;
    }
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    public ListAdminTrademarkApplicationsRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public ListAdminTrademarkApplicationsRequest setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber;
        return this;
    }
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    public ListAdminTrademarkApplicationsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
