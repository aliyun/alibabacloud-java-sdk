// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeTrademarkApplicationResponseBody extends TeaModel {
    @NameInMap("AcceptUrl")
    public String acceptUrl;

    @NameInMap("AgreementId")
    public String agreementId;

    @NameInMap("Applicant")
    public DescribeTrademarkApplicationResponseBodyApplicant applicant;

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
    public DescribeTrademarkApplicationResponseBodyFirstClassification firstClassification;

    @NameInMap("Flags")
    public DescribeTrademarkApplicationResponseBodyFlags flags;

    @NameInMap("JudgeResultUrls")
    public DescribeTrademarkApplicationResponseBodyJudgeResultUrls judgeResultUrls;

    @NameInMap("Note")
    public String note;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderPrice")
    public Float orderPrice;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("ReceiptUrls")
    public DescribeTrademarkApplicationResponseBodyReceiptUrls receiptUrls;

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
    public DescribeTrademarkApplicationResponseBodySupplements supplements;

    @NameInMap("ThirdClassifications")
    public DescribeTrademarkApplicationResponseBodyThirdClassifications thirdClassifications;

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

    public static DescribeTrademarkApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrademarkApplicationResponseBody self = new DescribeTrademarkApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrademarkApplicationResponseBody setAcceptUrl(String acceptUrl) {
        this.acceptUrl = acceptUrl;
        return this;
    }
    public String getAcceptUrl() {
        return this.acceptUrl;
    }

    public DescribeTrademarkApplicationResponseBody setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public DescribeTrademarkApplicationResponseBody setApplicant(DescribeTrademarkApplicationResponseBodyApplicant applicant) {
        this.applicant = applicant;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyApplicant getApplicant() {
        return this.applicant;
    }

    public DescribeTrademarkApplicationResponseBody setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

    public DescribeTrademarkApplicationResponseBody setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public DescribeTrademarkApplicationResponseBody setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public Integer getApplicationType() {
        return this.applicationType;
    }

    public DescribeTrademarkApplicationResponseBody setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public DescribeTrademarkApplicationResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeTrademarkApplicationResponseBody setBlackAndWhiteIconUrl(String blackAndWhiteIconUrl) {
        this.blackAndWhiteIconUrl = blackAndWhiteIconUrl;
        return this;
    }
    public String getBlackAndWhiteIconUrl() {
        return this.blackAndWhiteIconUrl;
    }

    public DescribeTrademarkApplicationResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeTrademarkApplicationResponseBody setExtendInfo(java.util.Map<String, ?> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtendInfo() {
        return this.extendInfo;
    }

    public DescribeTrademarkApplicationResponseBody setFirstClassification(DescribeTrademarkApplicationResponseBodyFirstClassification firstClassification) {
        this.firstClassification = firstClassification;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyFirstClassification getFirstClassification() {
        return this.firstClassification;
    }

    public DescribeTrademarkApplicationResponseBody setFlags(DescribeTrademarkApplicationResponseBodyFlags flags) {
        this.flags = flags;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyFlags getFlags() {
        return this.flags;
    }

    public DescribeTrademarkApplicationResponseBody setJudgeResultUrls(DescribeTrademarkApplicationResponseBodyJudgeResultUrls judgeResultUrls) {
        this.judgeResultUrls = judgeResultUrls;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyJudgeResultUrls getJudgeResultUrls() {
        return this.judgeResultUrls;
    }

    public DescribeTrademarkApplicationResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public DescribeTrademarkApplicationResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeTrademarkApplicationResponseBody setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Float getOrderPrice() {
        return this.orderPrice;
    }

    public DescribeTrademarkApplicationResponseBody setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public DescribeTrademarkApplicationResponseBody setReceiptUrls(DescribeTrademarkApplicationResponseBodyReceiptUrls receiptUrls) {
        this.receiptUrls = receiptUrls;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyReceiptUrls getReceiptUrls() {
        return this.receiptUrls;
    }

    public DescribeTrademarkApplicationResponseBody setRecvUserLogistics(String recvUserLogistics) {
        this.recvUserLogistics = recvUserLogistics;
        return this;
    }
    public String getRecvUserLogistics() {
        return this.recvUserLogistics;
    }

    public DescribeTrademarkApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrademarkApplicationResponseBody setSendSbjLogistics(String sendSbjLogistics) {
        this.sendSbjLogistics = sendSbjLogistics;
        return this;
    }
    public String getSendSbjLogistics() {
        return this.sendSbjLogistics;
    }

    public DescribeTrademarkApplicationResponseBody setSendUserLogistics(String sendUserLogistics) {
        this.sendUserLogistics = sendUserLogistics;
        return this;
    }
    public String getSendUserLogistics() {
        return this.sendUserLogistics;
    }

    public DescribeTrademarkApplicationResponseBody setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
        return this;
    }
    public Float getServicePrice() {
        return this.servicePrice;
    }

    public DescribeTrademarkApplicationResponseBody setSupplements(DescribeTrademarkApplicationResponseBodySupplements supplements) {
        this.supplements = supplements;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodySupplements getSupplements() {
        return this.supplements;
    }

    public DescribeTrademarkApplicationResponseBody setThirdClassifications(DescribeTrademarkApplicationResponseBodyThirdClassifications thirdClassifications) {
        this.thirdClassifications = thirdClassifications;
        return this;
    }
    public DescribeTrademarkApplicationResponseBodyThirdClassifications getThirdClassifications() {
        return this.thirdClassifications;
    }

    public DescribeTrademarkApplicationResponseBody setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public DescribeTrademarkApplicationResponseBody setTrademarkIcon(String trademarkIcon) {
        this.trademarkIcon = trademarkIcon;
        return this;
    }
    public String getTrademarkIcon() {
        return this.trademarkIcon;
    }

    public DescribeTrademarkApplicationResponseBody setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public DescribeTrademarkApplicationResponseBody setTrademarkNameType(Integer trademarkNameType) {
        this.trademarkNameType = trademarkNameType;
        return this;
    }
    public Integer getTrademarkNameType() {
        return this.trademarkNameType;
    }

    public DescribeTrademarkApplicationResponseBody setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber;
        return this;
    }
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    public DescribeTrademarkApplicationResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribeTrademarkApplicationResponseBodyApplicant extends TeaModel {
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

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("IdCardNumber")
        public String idCardNumber;

        @NameInMap("IdCardUrl")
        public String idCardUrl;

        @NameInMap("LegalNoticeUrl")
        public String legalNoticeUrl;

        @NameInMap("PassportUrl")
        public String passportUrl;

        @NameInMap("PersonalType")
        public Long personalType;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("Province")
        public String province;

        public static DescribeTrademarkApplicationResponseBodyApplicant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyApplicant self = new DescribeTrademarkApplicationResponseBodyApplicant();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setApplicantRegion(Integer applicantRegion) {
            this.applicantRegion = applicantRegion;
            return this;
        }
        public Integer getApplicantRegion() {
            return this.applicantRegion;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setApplicantType(Integer applicantType) {
            this.applicantType = applicantType;
            return this;
        }
        public Integer getApplicantType() {
            return this.applicantType;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public String getContactNumber() {
            return this.contactNumber;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setContactZipcode(String contactZipcode) {
            this.contactZipcode = contactZipcode;
            return this;
        }
        public String getContactZipcode() {
            return this.contactZipcode;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setLegalNoticeUrl(String legalNoticeUrl) {
            this.legalNoticeUrl = legalNoticeUrl;
            return this;
        }
        public String getLegalNoticeUrl() {
            return this.legalNoticeUrl;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setPersonalType(Long personalType) {
            this.personalType = personalType;
            return this;
        }
        public Long getPersonalType() {
            return this.personalType;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public DescribeTrademarkApplicationResponseBodyApplicant setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyFirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static DescribeTrademarkApplicationResponseBodyFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyFirstClassification self = new DescribeTrademarkApplicationResponseBodyFirstClassification();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public DescribeTrademarkApplicationResponseBodyFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyFlags extends TeaModel {
        @NameInMap("Flag")
        public java.util.List<Integer> flag;

        public static DescribeTrademarkApplicationResponseBodyFlags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyFlags self = new DescribeTrademarkApplicationResponseBodyFlags();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyFlags setFlag(java.util.List<Integer> flag) {
            this.flag = flag;
            return this;
        }
        public java.util.List<Integer> getFlag() {
            return this.flag;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyJudgeResultUrls extends TeaModel {
        @NameInMap("JudgeResultUrl")
        public java.util.List<String> judgeResultUrl;

        public static DescribeTrademarkApplicationResponseBodyJudgeResultUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyJudgeResultUrls self = new DescribeTrademarkApplicationResponseBodyJudgeResultUrls();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyJudgeResultUrls setJudgeResultUrl(java.util.List<String> judgeResultUrl) {
            this.judgeResultUrl = judgeResultUrl;
            return this;
        }
        public java.util.List<String> getJudgeResultUrl() {
            return this.judgeResultUrl;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyReceiptUrls extends TeaModel {
        @NameInMap("ReceiptUrl")
        public java.util.List<String> receiptUrl;

        public static DescribeTrademarkApplicationResponseBodyReceiptUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyReceiptUrls self = new DescribeTrademarkApplicationResponseBodyReceiptUrls();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyReceiptUrls setReceiptUrl(java.util.List<String> receiptUrl) {
            this.receiptUrl = receiptUrl;
            return this;
        }
        public java.util.List<String> getReceiptUrl() {
            return this.receiptUrl;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles extends TeaModel {
        @NameInMap("UserFile")
        public java.util.List<String> userFile;

        public static DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles self = new DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles setUserFile(java.util.List<String> userFile) {
            this.userFile = userFile;
            return this;
        }
        public java.util.List<String> getUserFile() {
            return this.userFile;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodySupplementsSupplement extends TeaModel {
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
        public DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles userFiles;

        public static DescribeTrademarkApplicationResponseBodySupplementsSupplement build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodySupplementsSupplement self = new DescribeTrademarkApplicationResponseBodySupplementsSupplement();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setAcceptExpirationDate(Long acceptExpirationDate) {
            this.acceptExpirationDate = acceptExpirationDate;
            return this;
        }
        public Long getAcceptExpirationDate() {
            return this.acceptExpirationDate;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setAcceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public Long getAcceptTime() {
            return this.acceptTime;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setApplicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public Integer getApplicationType() {
            return this.applicationType;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setOfficialFile(String officialFile) {
            this.officialFile = officialFile;
            return this;
        }
        public String getOfficialFile() {
            return this.officialFile;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setSbjExpirationDate(Long sbjExpirationDate) {
            this.sbjExpirationDate = sbjExpirationDate;
            return this;
        }
        public Long getSbjExpirationDate() {
            return this.sbjExpirationDate;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public DescribeTrademarkApplicationResponseBodySupplementsSupplement setUserFiles(DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles userFiles) {
            this.userFiles = userFiles;
            return this;
        }
        public DescribeTrademarkApplicationResponseBodySupplementsSupplementUserFiles getUserFiles() {
            return this.userFiles;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodySupplements extends TeaModel {
        @NameInMap("Supplement")
        public java.util.List<DescribeTrademarkApplicationResponseBodySupplementsSupplement> supplement;

        public static DescribeTrademarkApplicationResponseBodySupplements build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodySupplements self = new DescribeTrademarkApplicationResponseBodySupplements();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodySupplements setSupplement(java.util.List<DescribeTrademarkApplicationResponseBodySupplementsSupplement> supplement) {
            this.supplement = supplement;
            return this;
        }
        public java.util.List<DescribeTrademarkApplicationResponseBodySupplementsSupplement> getSupplement() {
            return this.supplement;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification self = new DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class DescribeTrademarkApplicationResponseBodyThirdClassifications extends TeaModel {
        @NameInMap("ThirdClassification")
        public java.util.List<DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification> thirdClassification;

        public static DescribeTrademarkApplicationResponseBodyThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrademarkApplicationResponseBodyThirdClassifications self = new DescribeTrademarkApplicationResponseBodyThirdClassifications();
            return TeaModel.build(map, self);
        }

        public DescribeTrademarkApplicationResponseBodyThirdClassifications setThirdClassification(java.util.List<DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification> thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public java.util.List<DescribeTrademarkApplicationResponseBodyThirdClassificationsThirdClassification> getThirdClassification() {
            return this.thirdClassification;
        }

    }

}
