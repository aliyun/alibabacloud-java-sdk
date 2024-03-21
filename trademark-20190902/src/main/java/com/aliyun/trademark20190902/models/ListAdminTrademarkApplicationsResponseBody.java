// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TrademarkApplications")
    public java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplications> trademarkApplications;

    public static ListAdminTrademarkApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationsResponseBody self = new ListAdminTrademarkApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAdminTrademarkApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAdminTrademarkApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdminTrademarkApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAdminTrademarkApplicationsResponseBody setTrademarkApplications(java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplications> trademarkApplications) {
        this.trademarkApplications = trademarkApplications;
        return this;
    }
    public java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplications> getTrademarkApplications() {
        return this.trademarkApplications;
    }

    public static class ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification self = new ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification();
            return TeaModel.build(map, self);
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification self = new ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification();
            return TeaModel.build(map, self);
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class ListAdminTrademarkApplicationsResponseBodyTrademarkApplications extends TeaModel {
        @NameInMap("ApplicantId")
        public Long applicantId;

        @NameInMap("ApplicantName")
        public String applicantName;

        @NameInMap("ApplicationStatus")
        public Integer applicationStatus;

        @NameInMap("ApplicationType")
        public Integer applicationType;

        @NameInMap("AuthorizationUrl")
        public String authorizationUrl;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FirstClassification")
        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification firstClassification;

        @NameInMap("Flags")
        public java.util.List<String> flags;

        @NameInMap("Note")
        public String note;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("ServicePrice")
        public Float servicePrice;

        @NameInMap("SupplementId")
        public Long supplementId;

        @NameInMap("SupplementStatus")
        public Integer supplementStatus;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("ThirdClassification")
        public java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification> thirdClassification;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        @NameInMap("TrademarkIcon")
        public String trademarkIcon;

        @NameInMap("TrademarkName")
        public String trademarkName;

        @NameInMap("TrademarkNumber")
        public String trademarkNumber;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static ListAdminTrademarkApplicationsResponseBodyTrademarkApplications build(java.util.Map<String, ?> map) throws Exception {
            ListAdminTrademarkApplicationsResponseBodyTrademarkApplications self = new ListAdminTrademarkApplicationsResponseBodyTrademarkApplications();
            return TeaModel.build(map, self);
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setApplicantId(Long applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public Long getApplicantId() {
            return this.applicantId;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setApplicationStatus(Integer applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public Integer getApplicationStatus() {
            return this.applicationStatus;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setFirstClassification(ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }
        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsFirstClassification getFirstClassification() {
            return this.firstClassification;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setFlags(java.util.List<String> flags) {
            this.flags = flags;
            return this;
        }
        public java.util.List<String> getFlags() {
            return this.flags;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setServicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }
        public Float getServicePrice() {
            return this.servicePrice;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setThirdClassification(java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification> thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public java.util.List<ListAdminTrademarkApplicationsResponseBodyTrademarkApplicationsThirdClassification> getThirdClassification() {
            return this.thirdClassification;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setTrademarkIcon(String trademarkIcon) {
            this.trademarkIcon = trademarkIcon;
            return this;
        }
        public String getTrademarkIcon() {
            return this.trademarkIcon;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListAdminTrademarkApplicationsResponseBodyTrademarkApplications setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
