// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelListResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkModelListResponseBodyMoudle moudle;

    public static QueryTrademarkModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelListResponseBody self = new QueryTrademarkModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelListResponseBody setMoudle(QueryTrademarkModelListResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkModelListResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public static class QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode self = new QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode> leafCode;

        public static QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes self = new QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes setLeafCode(java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo extends TeaModel {
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
        public Integer personalType;

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

        public static QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo self = new QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setPersonalType(Integer personalType) {
            this.personalType = personalType;
            return this;
        }
        public Integer getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudleDataItemRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelListResponseBodyMoudleDataItemRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleDataItemRootCode self = new QueryTrademarkModelListResponseBodyMoudleDataItemRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItemRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudleDataItem extends TeaModel {
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
        public QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo materialInfo;

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
        public QueryTrademarkModelListResponseBodyMoudleDataItemRootCode rootCode;

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

        public static QueryTrademarkModelListResponseBodyMoudleDataItem build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleDataItem self = new QueryTrademarkModelListResponseBodyMoudleDataItem();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setLeafCodes(QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkModelListResponseBodyMoudleDataItemLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setMaterialInfo(QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkModelListResponseBodyMoudleDataItemMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setRootCode(QueryTrademarkModelListResponseBodyMoudleDataItemRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkModelListResponseBodyMoudleDataItemRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitAuditTimeStr(String submitAuditTimeStr) {
            this.submitAuditTimeStr = submitAuditTimeStr;
            return this;
        }
        public String getSubmitAuditTimeStr() {
            return this.submitAuditTimeStr;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitAuditTimeValue(Long submitAuditTimeValue) {
            this.submitAuditTimeValue = submitAuditTimeValue;
            return this;
        }
        public Long getSubmitAuditTimeValue() {
            return this.submitAuditTimeValue;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitTimeStr(String submitTimeStr) {
            this.submitTimeStr = submitTimeStr;
            return this;
        }
        public String getSubmitTimeStr() {
            return this.submitTimeStr;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitTimeValue(Long submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public Long getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        public QueryTrademarkModelListResponseBodyMoudleDataItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudleData extends TeaModel {
        @NameInMap("item")
        public java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItem> item;

        public static QueryTrademarkModelListResponseBodyMoudleData build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudleData self = new QueryTrademarkModelListResponseBodyMoudleData();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudleData setItem(java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryTrademarkModelListResponseBodyMoudleDataItem> getItem() {
            return this.item;
        }

    }

    public static class QueryTrademarkModelListResponseBodyMoudle extends TeaModel {
        @NameInMap("Data")
        public QueryTrademarkModelListResponseBodyMoudleData data;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static QueryTrademarkModelListResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelListResponseBodyMoudle self = new QueryTrademarkModelListResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelListResponseBodyMoudle setData(QueryTrademarkModelListResponseBodyMoudleData data) {
            this.data = data;
            return this;
        }
        public QueryTrademarkModelListResponseBodyMoudleData getData() {
            return this.data;
        }

        public QueryTrademarkModelListResponseBodyMoudle setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTrademarkModelListResponseBodyMoudle setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
