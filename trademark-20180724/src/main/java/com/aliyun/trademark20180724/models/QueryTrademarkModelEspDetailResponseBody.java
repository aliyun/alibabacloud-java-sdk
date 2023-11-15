// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspDetailResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkModelEspDetailResponseBodyMoudle moudle;

    public static QueryTrademarkModelEspDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspDetailResponseBody self = new QueryTrademarkModelEspDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspDetailResponseBody setMoudle(QueryTrademarkModelEspDetailResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkModelEspDetailResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public static class QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode self = new QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode> leafCode;

        public static QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes self = new QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes setLeafCode(java.util.List<QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo extends TeaModel {
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
        public String personalType;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("Province")
        public String province;

        @NameInMap("ReasonFileOssKey")
        public String reasonFileOssKey;

        @NameInMap("Region")
        public Integer region;

        @NameInMap("Type")
        public Integer type;

        public static QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo self = new QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setPersonalType(String personalType) {
            this.personalType = personalType;
            return this;
        }
        public String getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkModelEspDetailResponseBodyMoudleRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelEspDetailResponseBodyMoudleRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspDetailResponseBodyMoudleRootCode self = new QueryTrademarkModelEspDetailResponseBodyMoudleRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudleRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelEspDetailResponseBodyMoudle extends TeaModel {
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
        public QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo materialInfo;

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
        public QueryTrademarkModelEspDetailResponseBodyMoudleRootCode rootCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusStr")
        public String statusStr;

        @NameInMap("SubmitAuditTime")
        public Long submitAuditTime;

        @NameInMap("SubmitStatus")
        public String submitStatus;

        @NameInMap("SubmitTime")
        public Long submitTime;

        @NameInMap("SubmitTimes")
        public Integer submitTimes;

        @NameInMap("TrademarkName")
        public String trademarkName;

        @NameInMap("TrademarkNameType")
        public Integer trademarkNameType;

        @NameInMap("TrademarkNumber")
        public String trademarkNumber;

        public static QueryTrademarkModelEspDetailResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspDetailResponseBodyMoudle self = new QueryTrademarkModelEspDetailResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setLeafCodes(QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkModelEspDetailResponseBodyMoudleLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setMaterialInfo(QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkModelEspDetailResponseBodyMoudleMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setRootCode(QueryTrademarkModelEspDetailResponseBodyMoudleRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkModelEspDetailResponseBodyMoudleRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setSubmitAuditTime(Long submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public Long getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkModelEspDetailResponseBodyMoudle setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

    }

}
