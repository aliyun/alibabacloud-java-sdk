// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribePartnerTrademarkApplicationResponseBody extends TeaModel {
    @NameInMap("AcceptUrl")
    public String acceptUrl;

    @NameInMap("Applicant")
    public DescribePartnerTrademarkApplicationResponseBodyApplicant applicant;

    @NameInMap("ApplicantId")
    public Long applicantId;

    @NameInMap("ApplicationStatus")
    public Integer applicationStatus;

    @NameInMap("ApplicationType")
    public Integer applicationType;

    @NameInMap("AuthorizationUrl")
    public String authorizationUrl;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BlackAndWhiteIconUrl")
    public String blackAndWhiteIconUrl;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("ExtendInfo")
    public java.util.Map<String, ?> extendInfo;

    @NameInMap("FirstClassification")
    public DescribePartnerTrademarkApplicationResponseBodyFirstClassification firstClassification;

    @NameInMap("JudgeResultUrls")
    public java.util.List<String> judgeResultUrls;

    @NameInMap("Note")
    public String note;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderPrice")
    public Float orderPrice;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("ReceiptUrls")
    public java.util.List<String> receiptUrls;

    @NameInMap("RecvUserLogistics")
    public String recvUserLogistics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SendSbjLogistics")
    public String sendSbjLogistics;

    @NameInMap("SendUserLogistics")
    public String sendUserLogistics;

    @NameInMap("ServicePrice")
    public Float servicePrice;

    @NameInMap("Supplements")
    public java.util.List<DescribePartnerTrademarkApplicationResponseBodySupplements> supplements;

    @NameInMap("ThirdClassifications")
    public java.util.List<DescribePartnerTrademarkApplicationResponseBodyThirdClassifications> thirdClassifications;

    @NameInMap("TotalPrice")
    public Float totalPrice;

    @NameInMap("TrademarkIcon")
    public String trademarkIcon;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("TrademarkNameType")
    public Integer trademarkNameType;

    @NameInMap("TrademarkNumber")
    public String trademarkNumber;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static DescribePartnerTrademarkApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerTrademarkApplicationResponseBody self = new DescribePartnerTrademarkApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePartnerTrademarkApplicationResponseBody setAcceptUrl(String acceptUrl) {
        this.acceptUrl = acceptUrl;
        return this;
    }
    public String getAcceptUrl() {
        return this.acceptUrl;
    }

    public DescribePartnerTrademarkApplicationResponseBody setApplicant(DescribePartnerTrademarkApplicationResponseBodyApplicant applicant) {
        this.applicant = applicant;
        return this;
    }
    public DescribePartnerTrademarkApplicationResponseBodyApplicant getApplicant() {
        return this.applicant;
    }

    public DescribePartnerTrademarkApplicationResponseBody setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

    public DescribePartnerTrademarkApplicationResponseBody setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public DescribePartnerTrademarkApplicationResponseBody setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public Integer getApplicationType() {
        return this.applicationType;
    }

    public DescribePartnerTrademarkApplicationResponseBody setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public DescribePartnerTrademarkApplicationResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribePartnerTrademarkApplicationResponseBody setBlackAndWhiteIconUrl(String blackAndWhiteIconUrl) {
        this.blackAndWhiteIconUrl = blackAndWhiteIconUrl;
        return this;
    }
    public String getBlackAndWhiteIconUrl() {
        return this.blackAndWhiteIconUrl;
    }

    public DescribePartnerTrademarkApplicationResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribePartnerTrademarkApplicationResponseBody setExtendInfo(java.util.Map<String, ?> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtendInfo() {
        return this.extendInfo;
    }

    public DescribePartnerTrademarkApplicationResponseBody setFirstClassification(DescribePartnerTrademarkApplicationResponseBodyFirstClassification firstClassification) {
        this.firstClassification = firstClassification;
        return this;
    }
    public DescribePartnerTrademarkApplicationResponseBodyFirstClassification getFirstClassification() {
        return this.firstClassification;
    }

    public DescribePartnerTrademarkApplicationResponseBody setJudgeResultUrls(java.util.List<String> judgeResultUrls) {
        this.judgeResultUrls = judgeResultUrls;
        return this;
    }
    public java.util.List<String> getJudgeResultUrls() {
        return this.judgeResultUrls;
    }

    public DescribePartnerTrademarkApplicationResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public DescribePartnerTrademarkApplicationResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribePartnerTrademarkApplicationResponseBody setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Float getOrderPrice() {
        return this.orderPrice;
    }

    public DescribePartnerTrademarkApplicationResponseBody setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public DescribePartnerTrademarkApplicationResponseBody setReceiptUrls(java.util.List<String> receiptUrls) {
        this.receiptUrls = receiptUrls;
        return this;
    }
    public java.util.List<String> getReceiptUrls() {
        return this.receiptUrls;
    }

    public DescribePartnerTrademarkApplicationResponseBody setRecvUserLogistics(String recvUserLogistics) {
        this.recvUserLogistics = recvUserLogistics;
        return this;
    }
    public String getRecvUserLogistics() {
        return this.recvUserLogistics;
    }

    public DescribePartnerTrademarkApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePartnerTrademarkApplicationResponseBody setSendSbjLogistics(String sendSbjLogistics) {
        this.sendSbjLogistics = sendSbjLogistics;
        return this;
    }
    public String getSendSbjLogistics() {
        return this.sendSbjLogistics;
    }

    public DescribePartnerTrademarkApplicationResponseBody setSendUserLogistics(String sendUserLogistics) {
        this.sendUserLogistics = sendUserLogistics;
        return this;
    }
    public String getSendUserLogistics() {
        return this.sendUserLogistics;
    }

    public DescribePartnerTrademarkApplicationResponseBody setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
        return this;
    }
    public Float getServicePrice() {
        return this.servicePrice;
    }

    public DescribePartnerTrademarkApplicationResponseBody setSupplements(java.util.List<DescribePartnerTrademarkApplicationResponseBodySupplements> supplements) {
        this.supplements = supplements;
        return this;
    }
    public java.util.List<DescribePartnerTrademarkApplicationResponseBodySupplements> getSupplements() {
        return this.supplements;
    }

    public DescribePartnerTrademarkApplicationResponseBody setThirdClassifications(java.util.List<DescribePartnerTrademarkApplicationResponseBodyThirdClassifications> thirdClassifications) {
        this.thirdClassifications = thirdClassifications;
        return this;
    }
    public java.util.List<DescribePartnerTrademarkApplicationResponseBodyThirdClassifications> getThirdClassifications() {
        return this.thirdClassifications;
    }

    public DescribePartnerTrademarkApplicationResponseBody setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public DescribePartnerTrademarkApplicationResponseBody setTrademarkIcon(String trademarkIcon) {
        this.trademarkIcon = trademarkIcon;
        return this;
    }
    public String getTrademarkIcon() {
        return this.trademarkIcon;
    }

    public DescribePartnerTrademarkApplicationResponseBody setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public DescribePartnerTrademarkApplicationResponseBody setTrademarkNameType(Integer trademarkNameType) {
        this.trademarkNameType = trademarkNameType;
        return this;
    }
    public Integer getTrademarkNameType() {
        return this.trademarkNameType;
    }

    public DescribePartnerTrademarkApplicationResponseBody setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber;
        return this;
    }
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    public DescribePartnerTrademarkApplicationResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribePartnerTrademarkApplicationResponseBodyApplicant extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("ApplicantName")
        public String applicantName;

        @NameInMap("ApplicantRegion")
        public Integer applicantRegion;

        @NameInMap("ApplicantType")
        public Integer applicantType;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("AuthorizationUrl")
        public String authorizationUrl;

        @NameInMap("BusinessLicenceUrl")
        public String businessLicenceUrl;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("ContactAddress")
        public String contactAddress;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactNumber")
        public String contactNumber;

        @NameInMap("ContactZipcode")
        public String contactZipcode;

        @NameInMap("Country")
        public String country;

        @NameInMap("EAddress")
        public String EAddress;

        @NameInMap("EName")
        public String EName;

        @NameInMap("IdCardUrl")
        public String idCardUrl;

        @NameInMap("LegalNoticeUrl")
        public String legalNoticeUrl;

        @NameInMap("PassportUrl")
        public String passportUrl;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("Province")
        public String province;

        public static DescribePartnerTrademarkApplicationResponseBodyApplicant build(java.util.Map<String, ?> map) throws Exception {
            DescribePartnerTrademarkApplicationResponseBodyApplicant self = new DescribePartnerTrademarkApplicationResponseBodyApplicant();
            return TeaModel.build(map, self);
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setApplicantRegion(Integer applicantRegion) {
            this.applicantRegion = applicantRegion;
            return this;
        }
        public Integer getApplicantRegion() {
            return this.applicantRegion;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setApplicantType(Integer applicantType) {
            this.applicantType = applicantType;
            return this;
        }
        public Integer getApplicantType() {
            return this.applicantType;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public String getContactNumber() {
            return this.contactNumber;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setContactZipcode(String contactZipcode) {
            this.contactZipcode = contactZipcode;
            return this;
        }
        public String getContactZipcode() {
            return this.contactZipcode;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setLegalNoticeUrl(String legalNoticeUrl) {
            this.legalNoticeUrl = legalNoticeUrl;
            return this;
        }
        public String getLegalNoticeUrl() {
            return this.legalNoticeUrl;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public DescribePartnerTrademarkApplicationResponseBodyApplicant setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribePartnerTrademarkApplicationResponseBodyFirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static DescribePartnerTrademarkApplicationResponseBodyFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            DescribePartnerTrademarkApplicationResponseBodyFirstClassification self = new DescribePartnerTrademarkApplicationResponseBodyFirstClassification();
            return TeaModel.build(map, self);
        }

        public DescribePartnerTrademarkApplicationResponseBodyFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public DescribePartnerTrademarkApplicationResponseBodyFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class DescribePartnerTrademarkApplicationResponseBodySupplements extends TeaModel {
        @NameInMap("AcceptExpirationDate")
        public Long acceptExpirationDate;

        @NameInMap("AcceptTime")
        public Long acceptTime;

        @NameInMap("ApplicationType")
        public Integer applicationType;

        @NameInMap("Content")
        public String content;

        @NameInMap("OfficialFile")
        public String officialFile;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("SbjExpirationDate")
        public Long sbjExpirationDate;

        @NameInMap("SendTime")
        public Long sendTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SupplementId")
        public Long supplementId;

        @NameInMap("SupplementStatus")
        public Integer supplementStatus;

        @NameInMap("TrademarkNumber")
        public String trademarkNumber;

        @NameInMap("UserFiles")
        public java.util.List<String> userFiles;

        public static DescribePartnerTrademarkApplicationResponseBodySupplements build(java.util.Map<String, ?> map) throws Exception {
            DescribePartnerTrademarkApplicationResponseBodySupplements self = new DescribePartnerTrademarkApplicationResponseBodySupplements();
            return TeaModel.build(map, self);
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setAcceptExpirationDate(Long acceptExpirationDate) {
            this.acceptExpirationDate = acceptExpirationDate;
            return this;
        }
        public Long getAcceptExpirationDate() {
            return this.acceptExpirationDate;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setAcceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public Long getAcceptTime() {
            return this.acceptTime;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setOfficialFile(String officialFile) {
            this.officialFile = officialFile;
            return this;
        }
        public String getOfficialFile() {
            return this.officialFile;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setSbjExpirationDate(Long sbjExpirationDate) {
            this.sbjExpirationDate = sbjExpirationDate;
            return this;
        }
        public Long getSbjExpirationDate() {
            return this.sbjExpirationDate;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public DescribePartnerTrademarkApplicationResponseBodySupplements setUserFiles(java.util.List<String> userFiles) {
            this.userFiles = userFiles;
            return this;
        }
        public java.util.List<String> getUserFiles() {
            return this.userFiles;
        }

    }

    public static class DescribePartnerTrademarkApplicationResponseBodyThirdClassifications extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static DescribePartnerTrademarkApplicationResponseBodyThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            DescribePartnerTrademarkApplicationResponseBodyThirdClassifications self = new DescribePartnerTrademarkApplicationResponseBodyThirdClassifications();
            return TeaModel.build(map, self);
        }

        public DescribePartnerTrademarkApplicationResponseBodyThirdClassifications setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public DescribePartnerTrademarkApplicationResponseBodyThirdClassifications setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

}
