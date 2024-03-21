// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TrademarkApplications")
    public ListTrademarkApplicationsResponseBodyTrademarkApplications trademarkApplications;

    public static ListTrademarkApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationsResponseBody self = new ListTrademarkApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrademarkApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrademarkApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrademarkApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrademarkApplicationsResponseBody setTrademarkApplications(ListTrademarkApplicationsResponseBodyTrademarkApplications trademarkApplications) {
        this.trademarkApplications = trademarkApplications;
        return this;
    }
    public ListTrademarkApplicationsResponseBodyTrademarkApplications getTrademarkApplications() {
        return this.trademarkApplications;
    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification self = new ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags extends TeaModel {
        @NameInMap("Flags")
        public java.util.List<String> flags;

        public static ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags self = new ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags setFlags(java.util.List<String> flags) {
            this.flags = flags;
            return this;
        }
        public java.util.List<String> getFlags() {
            return this.flags;
        }

    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification self = new ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification extends TeaModel {
        @NameInMap("ThirdClassification")
        public java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification> thirdClassification;

        public static ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification self = new ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification setThirdClassification(java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification> thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassificationThirdClassification> getThirdClassification() {
            return this.thirdClassification;
        }

    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication extends TeaModel {
        @NameInMap("AgreementId")
        public String agreementId;

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
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification firstClassification;

        @NameInMap("Flags")
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags flags;

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
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification thirdClassification;

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

        public static ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication self = new ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setAgreementId(String agreementId) {
            this.agreementId = agreementId;
            return this;
        }
        public String getAgreementId() {
            return this.agreementId;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setApplicantId(Long applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public Long getApplicantId() {
            return this.applicantId;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setApplicationStatus(Integer applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public Integer getApplicationStatus() {
            return this.applicationStatus;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setFirstClassification(ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFirstClassification getFirstClassification() {
            return this.firstClassification;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setFlags(ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags flags) {
            this.flags = flags;
            return this;
        }
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationFlags getFlags() {
            return this.flags;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setServicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }
        public Float getServicePrice() {
            return this.servicePrice;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setThirdClassification(ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplicationThirdClassification getThirdClassification() {
            return this.thirdClassification;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setTrademarkIcon(String trademarkIcon) {
            this.trademarkIcon = trademarkIcon;
            return this;
        }
        public String getTrademarkIcon() {
            return this.trademarkIcon;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListTrademarkApplicationsResponseBodyTrademarkApplications extends TeaModel {
        @NameInMap("TrademarkApplication")
        public java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication> trademarkApplication;

        public static ListTrademarkApplicationsResponseBodyTrademarkApplications build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationsResponseBodyTrademarkApplications self = new ListTrademarkApplicationsResponseBodyTrademarkApplications();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationsResponseBodyTrademarkApplications setTrademarkApplication(java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication> trademarkApplication) {
            this.trademarkApplication = trademarkApplication;
            return this;
        }
        public java.util.List<ListTrademarkApplicationsResponseBodyTrademarkApplicationsTrademarkApplication> getTrademarkApplication() {
            return this.trademarkApplication;
        }

    }

}
