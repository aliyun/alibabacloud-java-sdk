// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelDetailResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkModelDetailResponseBodyMoudle moudle;

    public static QueryTrademarkModelDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelDetailResponseBody self = new QueryTrademarkModelDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelDetailResponseBody setMoudle(QueryTrademarkModelDetailResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkModelDetailResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public static class QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode self = new QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelDetailResponseBodyMoudleLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode> leafCode;

        public static QueryTrademarkModelDetailResponseBodyMoudleLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelDetailResponseBodyMoudleLeafCodes self = new QueryTrademarkModelDetailResponseBodyMoudleLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelDetailResponseBodyMoudleLeafCodes setLeafCode(java.util.List<QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkModelDetailResponseBodyMoudleLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo extends TeaModel {
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

        public static QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo self = new QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }
        public String getContactPhoneNumber() {
            return this.contactPhoneNumber;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setReviewFileMap(java.util.Map<String, ?> reviewFileMap) {
            this.reviewFileMap = reviewFileMap;
            return this;
        }
        public java.util.Map<String, ?> getReviewFileMap() {
            return this.reviewFileMap;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkModelDetailResponseBodyMoudleRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelDetailResponseBodyMoudleRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelDetailResponseBodyMoudleRootCode self = new QueryTrademarkModelDetailResponseBodyMoudleRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelDetailResponseBodyMoudleRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudleRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelDetailResponseBodyMoudle extends TeaModel {
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
        public QueryTrademarkModelDetailResponseBodyMoudleLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo materialInfo;

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

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RootCode")
        public QueryTrademarkModelDetailResponseBodyMoudleRootCode rootCode;

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

        public static QueryTrademarkModelDetailResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelDetailResponseBodyMoudle self = new QueryTrademarkModelDetailResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setLeafCodes(QueryTrademarkModelDetailResponseBodyMoudleLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkModelDetailResponseBodyMoudleLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setMaterialInfo(QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkModelDetailResponseBodyMoudleMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setRootCode(QueryTrademarkModelDetailResponseBodyMoudleRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkModelDetailResponseBodyMoudleRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public QueryTrademarkModelDetailResponseBodyMoudle setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
