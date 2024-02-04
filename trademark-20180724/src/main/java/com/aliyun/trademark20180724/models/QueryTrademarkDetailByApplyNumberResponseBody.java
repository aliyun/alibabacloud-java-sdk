// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkDetailByApplyNumberResponseBodyMoudle moudle;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTrademarkDetailByApplyNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberResponseBody self = new QueryTrademarkDetailByApplyNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setMoudle(QueryTrademarkDetailByApplyNumberResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkDetailByApplyNumberResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public QueryTrademarkDetailByApplyNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode self = new QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode> leafCode;

        public static QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes self = new QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes setLeafCode(java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo extends TeaModel {
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

        public static QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo self = new QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }
        public String getContactPhoneNumber() {
            return this.contactPhoneNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setReviewFileMap(java.util.Map<String, ?> reviewFileMap) {
            this.reviewFileMap = reviewFileMap;
            return this;
        }
        public java.util.Map<String, ?> getReviewFileMap() {
            return this.reviewFileMap;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode self = new QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkDetailByApplyNumberResponseBodyMoudle extends TeaModel {
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
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo materialInfo;

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
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode rootCode;

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

        public static QueryTrademarkDetailByApplyNumberResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkDetailByApplyNumberResponseBodyMoudle self = new QueryTrademarkDetailByApplyNumberResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setLeafCodes(QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setMaterialInfo(QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setRootCode(QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkDetailByApplyNumberResponseBodyMoudleRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public QueryTrademarkDetailByApplyNumberResponseBodyMoudle setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
