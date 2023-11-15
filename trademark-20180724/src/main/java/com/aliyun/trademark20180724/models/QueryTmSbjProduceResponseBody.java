// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmSbjProduceResponseBody extends TeaModel {
    @NameInMap("Moudle")
    public QueryTmSbjProduceResponseBodyMoudle moudle;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTmSbjProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTmSbjProduceResponseBody self = new QueryTmSbjProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTmSbjProduceResponseBody setMoudle(QueryTmSbjProduceResponseBodyMoudle moudle) {
        this.moudle = moudle;
        return this;
    }
    public QueryTmSbjProduceResponseBodyMoudle getMoudle() {
        return this.moudle;
    }

    public QueryTmSbjProduceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend extends TeaModel {
        @NameInMap("Bid")
        public Long bid;

        @NameInMap("BlackIcon")
        public Boolean blackIcon;

        @NameInMap("LoaOssKey")
        public String loaOssKey;

        @NameInMap("LogoGoodsId")
        public String logoGoodsId;

        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("SubmitCount")
        public Long submitCount;

        @NameInMap("TmNametype")
        public Long tmNametype;

        public static QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend build(java.util.Map<String, ?> map) throws Exception {
            QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend self = new QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend();
            return TeaModel.build(map, self);
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setBid(Long bid) {
            this.bid = bid;
            return this;
        }
        public Long getBid() {
            return this.bid;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setBlackIcon(Boolean blackIcon) {
            this.blackIcon = blackIcon;
            return this;
        }
        public Boolean getBlackIcon() {
            return this.blackIcon;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setLoaOssKey(String loaOssKey) {
            this.loaOssKey = loaOssKey;
            return this;
        }
        public String getLoaOssKey() {
            return this.loaOssKey;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setLogoGoodsId(String logoGoodsId) {
            this.logoGoodsId = logoGoodsId;
            return this;
        }
        public String getLogoGoodsId() {
            return this.logoGoodsId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setSubmitCount(Long submitCount) {
            this.submitCount = submitCount;
            return this;
        }
        public Long getSubmitCount() {
            return this.submitCount;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend setTmNametype(Long tmNametype) {
            this.tmNametype = tmNametype;
            return this;
        }
        public Long getTmNametype() {
            return this.tmNametype;
        }

    }

    public static class QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList extends TeaModel {
        @NameInMap("BitFlag")
        public Long bitFlag;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("DeleteFlag")
        public String deleteFlag;

        @NameInMap("Env")
        public String env;

        @NameInMap("Extend")
        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend extend;

        @NameInMap("LoaId")
        public Long loaId;

        @NameInMap("MainOrderId")
        public String mainOrderId;

        @NameInMap("MaterialId")
        public Long materialId;

        @NameInMap("MaterialName")
        public String materialName;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("PrincipalKey")
        public String principalKey;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RiskSource")
        public String riskSource;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitAuditTime")
        public Long submitAuditTime;

        @NameInMap("SubmitStatus")
        public String submitStatus;

        @NameInMap("SubmitTime")
        public Long submitTime;

        @NameInMap("SubmitTimes")
        public Long submitTimes;

        @NameInMap("TmCode")
        public String tmCode;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList build(java.util.Map<String, ?> map) throws Exception {
            QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList self = new QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList();
            return TeaModel.build(map, self);
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setBitFlag(Long bitFlag) {
            this.bitFlag = bitFlag;
            return this;
        }
        public Long getBitFlag() {
            return this.bitFlag;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setDeleteFlag(String deleteFlag) {
            this.deleteFlag = deleteFlag;
            return this;
        }
        public String getDeleteFlag() {
            return this.deleteFlag;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setExtend(QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend extend) {
            this.extend = extend;
            return this;
        }
        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceListExtend getExtend() {
            return this.extend;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setLoaId(Long loaId) {
            this.loaId = loaId;
            return this;
        }
        public Long getLoaId() {
            return this.loaId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setMainOrderId(String mainOrderId) {
            this.mainOrderId = mainOrderId;
            return this;
        }
        public String getMainOrderId() {
            return this.mainOrderId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setMaterialId(Long materialId) {
            this.materialId = materialId;
            return this;
        }
        public Long getMaterialId() {
            return this.materialId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setMaterialName(String materialName) {
            this.materialName = materialName;
            return this;
        }
        public String getMaterialName() {
            return this.materialName;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setSubmitAuditTime(Long submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public Long getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setSubmitTimes(Long submitTimes) {
            this.submitTimes = submitTimes;
            return this;
        }
        public Long getSubmitTimes() {
            return this.submitTimes;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setTmCode(String tmCode) {
            this.tmCode = tmCode;
            return this;
        }
        public String getTmCode() {
            return this.tmCode;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryTmSbjProduceResponseBodyMoudle extends TeaModel {
        @NameInMap("TmSbjProduceList")
        public java.util.List<QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList> tmSbjProduceList;

        public static QueryTmSbjProduceResponseBodyMoudle build(java.util.Map<String, ?> map) throws Exception {
            QueryTmSbjProduceResponseBodyMoudle self = new QueryTmSbjProduceResponseBodyMoudle();
            return TeaModel.build(map, self);
        }

        public QueryTmSbjProduceResponseBodyMoudle setTmSbjProduceList(java.util.List<QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList> tmSbjProduceList) {
            this.tmSbjProduceList = tmSbjProduceList;
            return this;
        }
        public java.util.List<QueryTmSbjProduceResponseBodyMoudleTmSbjProduceList> getTmSbjProduceList() {
            return this.tmSbjProduceList;
        }

    }

}
