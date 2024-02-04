// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberEspResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle moudle;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTrademarkDetailByApplyNumberEspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberEspResponseBody self = new QueryTrademarkDetailByApplyNumberEspResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberEspResponseBody setMoudle(QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public QueryTrademarkDetailByApplyNumberEspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode self = new QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode> leafCode;

        public static QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes self = new QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes setLeafCode(java.util.List<QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("BusinessLicenceUrl")
        public String businessLicenceUrl;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("CnInfoUrl")
        public String cnInfoUrl;

        @NameInMap("ContactAddress")
        public String contactAddress;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactPhoneNumber")
        public String contactPhoneNumber;

        @NameInMap("ContactZipCode")
        public String contactZipCode;

        @NameInMap("Country")
        public String country;

        @NameInMap("EAddress")
        public String EAddress;

        @NameInMap("EName")
        public String EName;

        @NameInMap("IdCardNumber")
        public String idCardNumber;

        @NameInMap("IdCardUrl")
        public String idCardUrl;

        @NameInMap("LoaKey")
        public String loaKey;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("PassportUrl")
        public String passportUrl;

        @NameInMap("PersonalType")
        public Integer personalType;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("Province")
        public String province;

        @NameInMap("ReasonFileOssKey")
        public String reasonFileOssKey;

        @NameInMap("Region")
        public Integer region;

        @NameInMap("ReviewFileMap")
        public java.util.Map<String, ?> reviewFileMap;

        @NameInMap("Type")
        public Integer type;

        public static QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo self = new QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }
        public String getContactPhoneNumber() {
            return this.contactPhoneNumber;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setReviewFileMap(java.util.Map<String, ?> reviewFileMap) {
            this.reviewFileMap = reviewFileMap;
            return this;
        }
        public java.util.Map<String, ?> getReviewFileMap() {
            return this.reviewFileMap;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode self = new QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle extends TeaModel {
        @NameInMap("BitFlag")
        public Integer bitFlag;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("GrayIconUrl")
        public String grayIconUrl;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("LeafCodes")
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo materialInfo;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("PrincipalKey")
        public String principalKey;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("ProduceType")
        public String produceType;

        @NameInMap("RootCode")
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode rootCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusStr")
        public String statusStr;

        @NameInMap("SubmitAuditTimeStr")
        public String submitAuditTimeStr;

        @NameInMap("SubmitAuditTimeValue")
        public Long submitAuditTimeValue;

        @NameInMap("SubmitStatus")
        public String submitStatus;

        @NameInMap("SubmitTimeStr")
        public String submitTimeStr;

        @NameInMap("SubmitTimeValue")
        public Long submitTimeValue;

        @NameInMap("SubmitTimes")
        public Integer submitTimes;

        @NameInMap("TrademarkName")
        public String trademarkName;

        @NameInMap("TrademarkNameType")
        public Integer trademarkNameType;

        @NameInMap("TrademarkNumber")
        public String trademarkNumber;

        @NameInMap("UserId")
        public String userId;

        public static QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle self = new QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setLeafCodes(QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setMaterialInfo(QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setRootCode(QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudleRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public QueryTrademarkDetailByApplyNumberEspResponseBodyMoudle setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
