// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationsRequest extends TeaModel {
    @NameInMap("ApplicantName")
    public String applicantName;

    @NameInMap("ApplicationStatus")
    public Integer applicationStatus;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CreateTimeLeft")
    public Long createTimeLeft;

    @NameInMap("CreateTimeRight")
    public Long createTimeRight;

    @NameInMap("Flag")
    public Integer flag;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("QueryVoucherOrderDoneFlag")
    public Boolean queryVoucherOrderDoneFlag;

    @NameInMap("QueryVoucherOrderFlag")
    public Boolean queryVoucherOrderFlag;

    @NameInMap("SortFiled")
    public String sortFiled;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("SupplementStatus")
    public Integer supplementStatus;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("TrademarkNumber")
    public String trademarkNumber;

    public static ListTrademarkApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationsRequest self = new ListTrademarkApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationsRequest setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public ListTrademarkApplicationsRequest setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public ListTrademarkApplicationsRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public ListTrademarkApplicationsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListTrademarkApplicationsRequest setCreateTimeLeft(Long createTimeLeft) {
        this.createTimeLeft = createTimeLeft;
        return this;
    }
    public Long getCreateTimeLeft() {
        return this.createTimeLeft;
    }

    public ListTrademarkApplicationsRequest setCreateTimeRight(Long createTimeRight) {
        this.createTimeRight = createTimeRight;
        return this;
    }
    public Long getCreateTimeRight() {
        return this.createTimeRight;
    }

    public ListTrademarkApplicationsRequest setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }
    public Integer getFlag() {
        return this.flag;
    }

    public ListTrademarkApplicationsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListTrademarkApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrademarkApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrademarkApplicationsRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public ListTrademarkApplicationsRequest setQueryVoucherOrderDoneFlag(Boolean queryVoucherOrderDoneFlag) {
        this.queryVoucherOrderDoneFlag = queryVoucherOrderDoneFlag;
        return this;
    }
    public Boolean getQueryVoucherOrderDoneFlag() {
        return this.queryVoucherOrderDoneFlag;
    }

    public ListTrademarkApplicationsRequest setQueryVoucherOrderFlag(Boolean queryVoucherOrderFlag) {
        this.queryVoucherOrderFlag = queryVoucherOrderFlag;
        return this;
    }
    public Boolean getQueryVoucherOrderFlag() {
        return this.queryVoucherOrderFlag;
    }

    public ListTrademarkApplicationsRequest setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }
    public String getSortFiled() {
        return this.sortFiled;
    }

    public ListTrademarkApplicationsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTrademarkApplicationsRequest setSupplementStatus(Integer supplementStatus) {
        this.supplementStatus = supplementStatus;
        return this;
    }
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    public ListTrademarkApplicationsRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public ListTrademarkApplicationsRequest setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber;
        return this;
    }
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

}
