// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationDetailResponseBody extends TeaModel {
    @NameInMap("AcceptUrl")
    public String acceptUrl;

    @NameInMap("AdminUploads")
    public QueryTradeMarkApplicationDetailResponseBodyAdminUploads adminUploads;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("ExtendInfo")
    public java.util.Map<String, ?> extendInfo;

    @NameInMap("FirstClassification")
    public QueryTradeMarkApplicationDetailResponseBodyFirstClassification firstClassification;

    @NameInMap("Flags")
    public QueryTradeMarkApplicationDetailResponseBodyFlags flags;

    @NameInMap("GrayIconUrl")
    public String grayIconUrl;

    @NameInMap("JudgeResultUrl")
    public QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl judgeResultUrl;

    @NameInMap("LegalNoticeUrl")
    public String legalNoticeUrl;

    @NameInMap("LoaUrl")
    public String loaUrl;

    @NameInMap("LogisticsCertificateUrl")
    public String logisticsCertificateUrl;

    @NameInMap("LogisticsNo")
    public String logisticsNo;

    @NameInMap("MaterialDetail")
    public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail materialDetail;

    @NameInMap("MaterialId")
    public Long materialId;

    @NameInMap("NotAcceptUrl")
    public String notAcceptUrl;

    @NameInMap("Note")
    public String note;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderPrice")
    public Float orderPrice;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("PartnerMobile")
    public String partnerMobile;

    @NameInMap("PartnerName")
    public String partnerName;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("ReceiptUrl")
    public QueryTradeMarkApplicationDetailResponseBodyReceiptUrl receiptUrl;

    @NameInMap("RecvUserLogistics")
    public String recvUserLogistics;

    @NameInMap("RenewResponse")
    public QueryTradeMarkApplicationDetailResponseBodyRenewResponse renewResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReviewOfficialFiles")
    public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles reviewOfficialFiles;

    @NameInMap("SendSbjLogistics")
    public String sendSbjLogistics;

    @NameInMap("SendTime")
    public String sendTime;

    @NameInMap("SendUserLogistics")
    public String sendUserLogistics;

    @NameInMap("ServicePrice")
    public Float servicePrice;

    @NameInMap("Specification")
    public Integer specification;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SubmitAuditTime")
    public Long submitAuditTime;

    @NameInMap("SubmitTime")
    public Long submitTime;

    @NameInMap("Supplements")
    public QueryTradeMarkApplicationDetailResponseBodySupplements supplements;

    @NameInMap("SystemVersion")
    public String systemVersion;

    @NameInMap("ThirdClassification")
    public QueryTradeMarkApplicationDetailResponseBodyThirdClassification thirdClassification;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmNameType")
    public Integer tmNameType;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("TotalPrice")
    public Float totalPrice;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static QueryTradeMarkApplicationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationDetailResponseBody self = new QueryTradeMarkApplicationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationDetailResponseBody setAcceptUrl(String acceptUrl) {
        this.acceptUrl = acceptUrl;
        return this;
    }
    public String getAcceptUrl() {
        return this.acceptUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setAdminUploads(QueryTradeMarkApplicationDetailResponseBodyAdminUploads adminUploads) {
        this.adminUploads = adminUploads;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyAdminUploads getAdminUploads() {
        return this.adminUploads;
    }

    public QueryTradeMarkApplicationDetailResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTradeMarkApplicationDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryTradeMarkApplicationDetailResponseBody setExtendInfo(java.util.Map<String, ?> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtendInfo() {
        return this.extendInfo;
    }

    public QueryTradeMarkApplicationDetailResponseBody setFirstClassification(QueryTradeMarkApplicationDetailResponseBodyFirstClassification firstClassification) {
        this.firstClassification = firstClassification;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyFirstClassification getFirstClassification() {
        return this.firstClassification;
    }

    public QueryTradeMarkApplicationDetailResponseBody setFlags(QueryTradeMarkApplicationDetailResponseBodyFlags flags) {
        this.flags = flags;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyFlags getFlags() {
        return this.flags;
    }

    public QueryTradeMarkApplicationDetailResponseBody setGrayIconUrl(String grayIconUrl) {
        this.grayIconUrl = grayIconUrl;
        return this;
    }
    public String getGrayIconUrl() {
        return this.grayIconUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setJudgeResultUrl(QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl judgeResultUrl) {
        this.judgeResultUrl = judgeResultUrl;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl getJudgeResultUrl() {
        return this.judgeResultUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setLegalNoticeUrl(String legalNoticeUrl) {
        this.legalNoticeUrl = legalNoticeUrl;
        return this;
    }
    public String getLegalNoticeUrl() {
        return this.legalNoticeUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setLoaUrl(String loaUrl) {
        this.loaUrl = loaUrl;
        return this;
    }
    public String getLoaUrl() {
        return this.loaUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setLogisticsCertificateUrl(String logisticsCertificateUrl) {
        this.logisticsCertificateUrl = logisticsCertificateUrl;
        return this;
    }
    public String getLogisticsCertificateUrl() {
        return this.logisticsCertificateUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public QueryTradeMarkApplicationDetailResponseBody setMaterialDetail(QueryTradeMarkApplicationDetailResponseBodyMaterialDetail materialDetail) {
        this.materialDetail = materialDetail;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail getMaterialDetail() {
        return this.materialDetail;
    }

    public QueryTradeMarkApplicationDetailResponseBody setMaterialId(Long materialId) {
        this.materialId = materialId;
        return this;
    }
    public Long getMaterialId() {
        return this.materialId;
    }

    public QueryTradeMarkApplicationDetailResponseBody setNotAcceptUrl(String notAcceptUrl) {
        this.notAcceptUrl = notAcceptUrl;
        return this;
    }
    public String getNotAcceptUrl() {
        return this.notAcceptUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public QueryTradeMarkApplicationDetailResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryTradeMarkApplicationDetailResponseBody setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Float getOrderPrice() {
        return this.orderPrice;
    }

    public QueryTradeMarkApplicationDetailResponseBody setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public QueryTradeMarkApplicationDetailResponseBody setPartnerMobile(String partnerMobile) {
        this.partnerMobile = partnerMobile;
        return this;
    }
    public String getPartnerMobile() {
        return this.partnerMobile;
    }

    public QueryTradeMarkApplicationDetailResponseBody setPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }
    public String getPartnerName() {
        return this.partnerName;
    }

    public QueryTradeMarkApplicationDetailResponseBody setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public QueryTradeMarkApplicationDetailResponseBody setReceiptUrl(QueryTradeMarkApplicationDetailResponseBodyReceiptUrl receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyReceiptUrl getReceiptUrl() {
        return this.receiptUrl;
    }

    public QueryTradeMarkApplicationDetailResponseBody setRecvUserLogistics(String recvUserLogistics) {
        this.recvUserLogistics = recvUserLogistics;
        return this;
    }
    public String getRecvUserLogistics() {
        return this.recvUserLogistics;
    }

    public QueryTradeMarkApplicationDetailResponseBody setRenewResponse(QueryTradeMarkApplicationDetailResponseBodyRenewResponse renewResponse) {
        this.renewResponse = renewResponse;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyRenewResponse getRenewResponse() {
        return this.renewResponse;
    }

    public QueryTradeMarkApplicationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTradeMarkApplicationDetailResponseBody setReviewOfficialFiles(QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles reviewOfficialFiles) {
        this.reviewOfficialFiles = reviewOfficialFiles;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles getReviewOfficialFiles() {
        return this.reviewOfficialFiles;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSendSbjLogistics(String sendSbjLogistics) {
        this.sendSbjLogistics = sendSbjLogistics;
        return this;
    }
    public String getSendSbjLogistics() {
        return this.sendSbjLogistics;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSendUserLogistics(String sendUserLogistics) {
        this.sendUserLogistics = sendUserLogistics;
        return this;
    }
    public String getSendUserLogistics() {
        return this.sendUserLogistics;
    }

    public QueryTradeMarkApplicationDetailResponseBody setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
        return this;
    }
    public Float getServicePrice() {
        return this.servicePrice;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSpecification(Integer specification) {
        this.specification = specification;
        return this;
    }
    public Integer getSpecification() {
        return this.specification;
    }

    public QueryTradeMarkApplicationDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSubmitAuditTime(Long submitAuditTime) {
        this.submitAuditTime = submitAuditTime;
        return this;
    }
    public Long getSubmitAuditTime() {
        return this.submitAuditTime;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public Long getSubmitTime() {
        return this.submitTime;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSupplements(QueryTradeMarkApplicationDetailResponseBodySupplements supplements) {
        this.supplements = supplements;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodySupplements getSupplements() {
        return this.supplements;
    }

    public QueryTradeMarkApplicationDetailResponseBody setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

    public QueryTradeMarkApplicationDetailResponseBody setThirdClassification(QueryTradeMarkApplicationDetailResponseBodyThirdClassification thirdClassification) {
        this.thirdClassification = thirdClassification;
        return this;
    }
    public QueryTradeMarkApplicationDetailResponseBodyThirdClassification getThirdClassification() {
        return this.thirdClassification;
    }

    public QueryTradeMarkApplicationDetailResponseBody setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public QueryTradeMarkApplicationDetailResponseBody setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTradeMarkApplicationDetailResponseBody setTmNameType(Integer tmNameType) {
        this.tmNameType = tmNameType;
        return this;
    }
    public Integer getTmNameType() {
        return this.tmNameType;
    }

    public QueryTradeMarkApplicationDetailResponseBody setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public QueryTradeMarkApplicationDetailResponseBody setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public QueryTradeMarkApplicationDetailResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryTradeMarkApplicationDetailResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class QueryTradeMarkApplicationDetailResponseBodyAdminUploads extends TeaModel {
        @NameInMap("LicensePicUrl")
        public String licensePicUrl;

        @NameInMap("LoaPicUrl")
        public String loaPicUrl;

        public static QueryTradeMarkApplicationDetailResponseBodyAdminUploads build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyAdminUploads self = new QueryTradeMarkApplicationDetailResponseBodyAdminUploads();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyAdminUploads setLicensePicUrl(String licensePicUrl) {
            this.licensePicUrl = licensePicUrl;
            return this;
        }
        public String getLicensePicUrl() {
            return this.licensePicUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyAdminUploads setLoaPicUrl(String loaPicUrl) {
            this.loaPicUrl = loaPicUrl;
            return this;
        }
        public String getLoaPicUrl() {
            return this.loaPicUrl;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyFirstClassification extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static QueryTradeMarkApplicationDetailResponseBodyFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyFirstClassification self = new QueryTradeMarkApplicationDetailResponseBodyFirstClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyFirstClassification setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTradeMarkApplicationDetailResponseBodyFirstClassification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyFlags extends TeaModel {
        @NameInMap("Flag")
        public java.util.List<Integer> flag;

        public static QueryTradeMarkApplicationDetailResponseBodyFlags build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyFlags self = new QueryTradeMarkApplicationDetailResponseBodyFlags();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyFlags setFlag(java.util.List<Integer> flag) {
            this.flag = flag;
            return this;
        }
        public java.util.List<Integer> getFlag() {
            return this.flag;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl extends TeaModel {
        @NameInMap("JudgeResultUrl")
        public java.util.List<String> judgeResultUrl;

        public static QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl self = new QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyJudgeResultUrl setJudgeResultUrl(java.util.List<String> judgeResultUrl) {
            this.judgeResultUrl = judgeResultUrl;
            return this;
        }
        public java.util.List<String> getJudgeResultUrl() {
            return this.judgeResultUrl;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles extends TeaModel {
        @NameInMap("ReviewAdditionalFile")
        public java.util.List<String> reviewAdditionalFile;

        public static QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles self = new QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles setReviewAdditionalFile(java.util.List<String> reviewAdditionalFile) {
            this.reviewAdditionalFile = reviewAdditionalFile;
            return this;
        }
        public java.util.List<String> getReviewAdditionalFile() {
            return this.reviewAdditionalFile;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyMaterialDetail extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("BusinessLicenceUrl")
        public String businessLicenceUrl;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("City")
        public String city;

        @NameInMap("ContactAddress")
        public String contactAddress;

        @NameInMap("ContactCity")
        public String contactCity;

        @NameInMap("ContactDistrict")
        public String contactDistrict;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactNumber")
        public String contactNumber;

        @NameInMap("ContactProvince")
        public String contactProvince;

        @NameInMap("ContactZipcode")
        public String contactZipcode;

        @NameInMap("Country")
        public String country;

        @NameInMap("DetailedContactAddress")
        public String detailedContactAddress;

        @NameInMap("EAddress")
        public String EAddress;

        @NameInMap("EName")
        public String EName;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("FactAndReasonPdfPath")
        public String factAndReasonPdfPath;

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("IdCardNumber")
        public String idCardNumber;

        @NameInMap("IdCardUrl")
        public String idCardUrl;

        @NameInMap("LegalNoticeUrl")
        public String legalNoticeUrl;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("MaterialVersion")
        public String materialVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("PassportUrl")
        public String passportUrl;

        @NameInMap("PersonalType")
        public Long personalType;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("Province")
        public String province;

        @NameInMap("Region")
        public Integer region;

        @NameInMap("ReviewAdditionalFiles")
        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles reviewAdditionalFiles;

        @NameInMap("ReviewApplicationFile")
        public String reviewApplicationFile;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplementEvidenceCatalogFile")
        public String supplementEvidenceCatalogFile;

        @NameInMap("SupplementEvidenceMaterialFile")
        public String supplementEvidenceMaterialFile;

        @NameInMap("SupplementReasonFile")
        public String supplementReasonFile;

        @NameInMap("Town")
        public String town;

        @NameInMap("Type")
        public Integer type;

        public static QueryTradeMarkApplicationDetailResponseBodyMaterialDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyMaterialDetail self = new QueryTradeMarkApplicationDetailResponseBodyMaterialDetail();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactCity(String contactCity) {
            this.contactCity = contactCity;
            return this;
        }
        public String getContactCity() {
            return this.contactCity;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactDistrict(String contactDistrict) {
            this.contactDistrict = contactDistrict;
            return this;
        }
        public String getContactDistrict() {
            return this.contactDistrict;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public String getContactNumber() {
            return this.contactNumber;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactProvince(String contactProvince) {
            this.contactProvince = contactProvince;
            return this;
        }
        public String getContactProvince() {
            return this.contactProvince;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setContactZipcode(String contactZipcode) {
            this.contactZipcode = contactZipcode;
            return this;
        }
        public String getContactZipcode() {
            return this.contactZipcode;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setDetailedContactAddress(String detailedContactAddress) {
            this.detailedContactAddress = detailedContactAddress;
            return this;
        }
        public String getDetailedContactAddress() {
            return this.detailedContactAddress;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setFactAndReasonPdfPath(String factAndReasonPdfPath) {
            this.factAndReasonPdfPath = factAndReasonPdfPath;
            return this;
        }
        public String getFactAndReasonPdfPath() {
            return this.factAndReasonPdfPath;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setLegalNoticeUrl(String legalNoticeUrl) {
            this.legalNoticeUrl = legalNoticeUrl;
            return this;
        }
        public String getLegalNoticeUrl() {
            return this.legalNoticeUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setMaterialVersion(String materialVersion) {
            this.materialVersion = materialVersion;
            return this;
        }
        public String getMaterialVersion() {
            return this.materialVersion;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setPersonalType(Long personalType) {
            this.personalType = personalType;
            return this;
        }
        public Long getPersonalType() {
            return this.personalType;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setReviewAdditionalFiles(QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles reviewAdditionalFiles) {
            this.reviewAdditionalFiles = reviewAdditionalFiles;
            return this;
        }
        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetailReviewAdditionalFiles getReviewAdditionalFiles() {
            return this.reviewAdditionalFiles;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setReviewApplicationFile(String reviewApplicationFile) {
            this.reviewApplicationFile = reviewApplicationFile;
            return this;
        }
        public String getReviewApplicationFile() {
            return this.reviewApplicationFile;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setSupplementEvidenceCatalogFile(String supplementEvidenceCatalogFile) {
            this.supplementEvidenceCatalogFile = supplementEvidenceCatalogFile;
            return this;
        }
        public String getSupplementEvidenceCatalogFile() {
            return this.supplementEvidenceCatalogFile;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setSupplementEvidenceMaterialFile(String supplementEvidenceMaterialFile) {
            this.supplementEvidenceMaterialFile = supplementEvidenceMaterialFile;
            return this;
        }
        public String getSupplementEvidenceMaterialFile() {
            return this.supplementEvidenceMaterialFile;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setSupplementReasonFile(String supplementReasonFile) {
            this.supplementReasonFile = supplementReasonFile;
            return this;
        }
        public String getSupplementReasonFile() {
            return this.supplementReasonFile;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setTown(String town) {
            this.town = town;
            return this;
        }
        public String getTown() {
            return this.town;
        }

        public QueryTradeMarkApplicationDetailResponseBodyMaterialDetail setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyReceiptUrl extends TeaModel {
        @NameInMap("ReceiptUrl")
        public java.util.List<String> receiptUrl;

        public static QueryTradeMarkApplicationDetailResponseBodyReceiptUrl build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyReceiptUrl self = new QueryTradeMarkApplicationDetailResponseBodyReceiptUrl();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyReceiptUrl setReceiptUrl(java.util.List<String> receiptUrl) {
            this.receiptUrl = receiptUrl;
            return this;
        }
        public java.util.List<String> getReceiptUrl() {
            return this.receiptUrl;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyRenewResponse extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("EngAddress")
        public String engAddress;

        @NameInMap("EngName")
        public String engName;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("SubmitSbjtime")
        public Long submitSbjtime;

        public static QueryTradeMarkApplicationDetailResponseBodyRenewResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyRenewResponse self = new QueryTradeMarkApplicationDetailResponseBodyRenewResponse();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setEngAddress(String engAddress) {
            this.engAddress = engAddress;
            return this;
        }
        public String getEngAddress() {
            return this.engAddress;
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setEngName(String engName) {
            this.engName = engName;
            return this;
        }
        public String getEngName() {
            return this.engName;
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodyRenewResponse setSubmitSbjtime(Long submitSbjtime) {
            this.submitSbjtime = submitSbjtime;
            return this;
        }
        public Long getSubmitSbjtime() {
            return this.submitSbjtime;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements extends TeaModel {
        @NameInMap("ReviewSupplement")
        public java.util.List<String> reviewSupplement;

        public static QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements self = new QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements setReviewSupplement(java.util.List<String> reviewSupplement) {
            this.reviewSupplement = reviewSupplement;
            return this;
        }
        public java.util.List<String> getReviewSupplement() {
            return this.reviewSupplement;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles extends TeaModel {
        @NameInMap("ReviewAudit")
        public String reviewAudit;

        @NameInMap("ReviewKeep")
        public String reviewKeep;

        @NameInMap("ReviewPart")
        public String reviewPart;

        @NameInMap("ReviewPass")
        public String reviewPass;

        @NameInMap("ReviewSupplements")
        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements reviewSupplements;

        public static QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles self = new QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles setReviewAudit(String reviewAudit) {
            this.reviewAudit = reviewAudit;
            return this;
        }
        public String getReviewAudit() {
            return this.reviewAudit;
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles setReviewKeep(String reviewKeep) {
            this.reviewKeep = reviewKeep;
            return this;
        }
        public String getReviewKeep() {
            return this.reviewKeep;
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles setReviewPart(String reviewPart) {
            this.reviewPart = reviewPart;
            return this;
        }
        public String getReviewPart() {
            return this.reviewPart;
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles setReviewPass(String reviewPass) {
            this.reviewPass = reviewPass;
            return this;
        }
        public String getReviewPass() {
            return this.reviewPass;
        }

        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFiles setReviewSupplements(QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements reviewSupplements) {
            this.reviewSupplements = reviewSupplements;
            return this;
        }
        public QueryTradeMarkApplicationDetailResponseBodyReviewOfficialFilesReviewSupplements getReviewSupplements() {
            return this.reviewSupplements;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls extends TeaModel {
        @NameInMap("FileTemplateUrls")
        public java.util.List<String> fileTemplateUrls;

        public static QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls self = new QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls setFileTemplateUrls(java.util.List<String> fileTemplateUrls) {
            this.fileTemplateUrls = fileTemplateUrls;
            return this;
        }
        public java.util.List<String> getFileTemplateUrls() {
            return this.fileTemplateUrls;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements extends TeaModel {
        @NameInMap("AcceptDeadTime")
        public Long acceptDeadTime;

        @NameInMap("AcceptTime")
        public Long acceptTime;

        @NameInMap("BatchNum")
        public String batchNum;

        @NameInMap("Content")
        public String content;

        @NameInMap("FileTemplateUrls")
        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls fileTemplateUrls;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("SbjDeadTime")
        public Long sbjDeadTime;

        @NameInMap("SendTime")
        public Long sendTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UploadFileTemplateUrl")
        public String uploadFileTemplateUrl;

        public static QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements self = new QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setAcceptDeadTime(Long acceptDeadTime) {
            this.acceptDeadTime = acceptDeadTime;
            return this;
        }
        public Long getAcceptDeadTime() {
            return this.acceptDeadTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setAcceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public Long getAcceptTime() {
            return this.acceptTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setBatchNum(String batchNum) {
            this.batchNum = batchNum;
            return this;
        }
        public String getBatchNum() {
            return this.batchNum;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setFileTemplateUrls(QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls fileTemplateUrls) {
            this.fileTemplateUrls = fileTemplateUrls;
            return this;
        }
        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplementsFileTemplateUrls getFileTemplateUrls() {
            return this.fileTemplateUrls;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setSbjDeadTime(Long sbjDeadTime) {
            this.sbjDeadTime = sbjDeadTime;
            return this;
        }
        public Long getSbjDeadTime() {
            return this.sbjDeadTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setSendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Long getSendTime() {
            return this.sendTime;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements setUploadFileTemplateUrl(String uploadFileTemplateUrl) {
            this.uploadFileTemplateUrl = uploadFileTemplateUrl;
            return this;
        }
        public String getUploadFileTemplateUrl() {
            return this.uploadFileTemplateUrl;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodySupplements extends TeaModel {
        @NameInMap("Supplements")
        public java.util.List<QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements> supplements;

        public static QueryTradeMarkApplicationDetailResponseBodySupplements build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodySupplements self = new QueryTradeMarkApplicationDetailResponseBodySupplements();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodySupplements setSupplements(java.util.List<QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements> supplements) {
            this.supplements = supplements;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationDetailResponseBodySupplementsSupplements> getSupplements() {
            return this.supplements;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications self = new QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryTradeMarkApplicationDetailResponseBodyThirdClassification extends TeaModel {
        @NameInMap("ThirdClassifications")
        public java.util.List<QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications> thirdClassifications;

        public static QueryTradeMarkApplicationDetailResponseBodyThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationDetailResponseBodyThirdClassification self = new QueryTradeMarkApplicationDetailResponseBodyThirdClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationDetailResponseBodyThirdClassification setThirdClassifications(java.util.List<QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications> thirdClassifications) {
            this.thirdClassifications = thirdClassifications;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationDetailResponseBodyThirdClassificationThirdClassifications> getThirdClassifications() {
            return this.thirdClassifications;
        }

    }

}
