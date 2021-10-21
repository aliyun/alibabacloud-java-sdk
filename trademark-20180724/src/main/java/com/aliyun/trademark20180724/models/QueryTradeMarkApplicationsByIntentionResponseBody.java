// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsByIntentionResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("Data")
    public QueryTradeMarkApplicationsByIntentionResponseBodyData data;

    public static QueryTradeMarkApplicationsByIntentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsByIntentionResponseBody self = new QueryTradeMarkApplicationsByIntentionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTradeMarkApplicationsByIntentionResponseBody setData(QueryTradeMarkApplicationsByIntentionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeMarkApplicationsByIntentionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications extends TeaModel {
        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications self = new QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

    public static class QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification extends TeaModel {
        @NameInMap("ThirdClassifications")
        public java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications;

        public static QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification self = new QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification setThirdClassifications(java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications) {
            this.thirdClassifications = thirdClassifications;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassificationThirdClassifications> getThirdClassifications() {
            return this.thirdClassifications;
        }

    }

    public static class QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification extends TeaModel {
        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification self = new QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

    public static class QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces extends TeaModel {
        @NameInMap("PrincipalDescription")
        public String principalDescription;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("MaterialName")
        public String materialName;

        @NameInMap("PrincipalValue")
        public Integer principalValue;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("ServicePrice")
        public Float servicePrice;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("SupplementId")
        public Long supplementId;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("Note")
        public String note;

        @NameInMap("SupplementStatus")
        public Integer supplementStatus;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        @NameInMap("ThirdClassification")
        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification thirdClassification;

        @NameInMap("FirstClassification")
        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification firstClassification;

        public static QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces self = new QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setPrincipalDescription(String principalDescription) {
            this.principalDescription = principalDescription;
            return this;
        }
        public String getPrincipalDescription() {
            return this.principalDescription;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setMaterialName(String materialName) {
            this.materialName = materialName;
            return this;
        }
        public String getMaterialName() {
            return this.materialName;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setPrincipalValue(Integer principalValue) {
            this.principalValue = principalValue;
            return this;
        }
        public Integer getPrincipalValue() {
            return this.principalValue;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setServicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }
        public Float getServicePrice() {
            return this.servicePrice;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setThirdClassification(QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesThirdClassification getThirdClassification() {
            return this.thirdClassification;
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces setFirstClassification(QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }
        public QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProducesFirstClassification getFirstClassification() {
            return this.firstClassification;
        }

    }

    public static class QueryTradeMarkApplicationsByIntentionResponseBodyData extends TeaModel {
        @NameInMap("TmProduces")
        public java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces> tmProduces;

        public static QueryTradeMarkApplicationsByIntentionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsByIntentionResponseBodyData self = new QueryTradeMarkApplicationsByIntentionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsByIntentionResponseBodyData setTmProduces(java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces> tmProduces) {
            this.tmProduces = tmProduces;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationsByIntentionResponseBodyDataTmProduces> getTmProduces() {
            return this.tmProduces;
        }

    }

}
