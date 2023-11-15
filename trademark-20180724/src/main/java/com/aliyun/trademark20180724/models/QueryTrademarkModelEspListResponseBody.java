// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspListResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTrademarkModelEspListResponseBodyMoudle moudle;

    public static QueryTrademarkModelEspListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspListResponseBody self = new QueryTrademarkModelEspListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspListResponseBody setMoudle(QueryTrademarkModelEspListResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTrademarkModelEspListResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode self = new QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes extends TeaModel {
        @NameInMap("leafCode")
        public java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode> leafCode;

        public static QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes self = new QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes setLeafCode(java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode> leafCode) {
            this.leafCode = leafCode;
            return this;
        }
        public java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodesLeafCode> getLeafCode() {
            return this.leafCode;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo extends TeaModel {
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

        public static QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo self = new QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setBusinessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }
        public String getBusinessLicenceUrl() {
            return this.businessLicenceUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setCnInfoUrl(String cnInfoUrl) {
            this.cnInfoUrl = cnInfoUrl;
            return this;
        }
        public String getCnInfoUrl() {
            return this.cnInfoUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }
        public String getContactAddress() {
            return this.contactAddress;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setContactZipCode(String contactZipCode) {
            this.contactZipCode = contactZipCode;
            return this;
        }
        public String getContactZipCode() {
            return this.contactZipCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setEAddress(String EAddress) {
            this.EAddress = EAddress;
            return this;
        }
        public String getEAddress() {
            return this.EAddress;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setIdCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }
        public String getIdCardUrl() {
            return this.idCardUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setLoaKey(String loaKey) {
            this.loaKey = loaKey;
            return this;
        }
        public String getLoaKey() {
            return this.loaKey;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setPassportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }
        public String getPassportUrl() {
            return this.passportUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setPersonalType(String personalType) {
            this.personalType = personalType;
            return this;
        }
        public String getPersonalType() {
            return this.personalType;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setReasonFileOssKey(String reasonFileOssKey) {
            this.reasonFileOssKey = reasonFileOssKey;
            return this;
        }
        public String getReasonFileOssKey() {
            return this.reasonFileOssKey;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode self = new QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleDataItem extends TeaModel {
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
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes leafCodes;

        @NameInMap("MaterialInfo")
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo materialInfo;

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
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode rootCode;

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

        public static QueryTrademarkModelEspListResponseBodyMoudleDataItem build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleDataItem self = new QueryTrademarkModelEspListResponseBodyMoudleDataItem();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setBitFlag(Integer bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Integer getBitFlag() {
            return this.bitFlag;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setGrayIconUrl(String grayIconUrl) {
            this.grayIconUrl = grayIconUrl;
            return this;
        }
        public String getGrayIconUrl() {
            return this.grayIconUrl;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setLeafCodes(QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes leafCodes) {
            this.leafCodes = leafCodes;
            return this;
        }
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemLeafCodes getLeafCodes() {
            return this.leafCodes;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setMaterialInfo(QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemMaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setProduceType(String produceType) {
            this.produceType = produceType;
            return this;
        }
        public String getProduceType() {
            return this.produceType;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setRootCode(QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode rootCode) {
            this.rootCode = rootCode;
            return this;
        }
        public QueryTrademarkModelEspListResponseBodyMoudleDataItemRootCode getRootCode() {
            return this.rootCode;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setSubmitAuditTime(Long submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public Long getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setSubmitTimes(Integer submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Integer getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setTrademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }
        public Integer getTrademarkNameType() {
            return this.trademarkNameType;
        }

        public QueryTrademarkModelEspListResponseBodyMoudleDataItem setTrademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudleData extends TeaModel {
        @NameInMap("item")
        public java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItem> item;

        public static QueryTrademarkModelEspListResponseBodyMoudleData build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudleData self = new QueryTrademarkModelEspListResponseBodyMoudleData();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudleData setItem(java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryTrademarkModelEspListResponseBodyMoudleDataItem> getItem() {
            return this.item;
        }

    }

    public static class QueryTrademarkModelEspListResponseBodyMoudle extends TeaModel {
        @NameInMap("Data")
        public QueryTrademarkModelEspListResponseBodyMoudleData data;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static QueryTrademarkModelEspListResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkModelEspListResponseBodyMoudle self = new QueryTrademarkModelEspListResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkModelEspListResponseBodyMoudle setData(QueryTrademarkModelEspListResponseBodyMoudleData data) {
            this.data = data;
            return this;
        }
        public QueryTrademarkModelEspListResponseBodyMoudleData getData() {
            return this.data;
        }

        public QueryTrademarkModelEspListResponseBodyMoudle setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTrademarkModelEspListResponseBodyMoudle setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
