// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionPriceResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryIntentionPriceResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryIntentionPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionPriceResponseBody self = new QueryIntentionPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntentionPriceResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryIntentionPriceResponseBody setData(QueryIntentionPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryIntentionPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryIntentionPriceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIntentionPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIntentionPriceResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryIntentionPriceResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryIntentionPriceResponseBodyDataTmProducesFirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryIntentionPriceResponseBodyDataTmProducesFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionPriceResponseBodyDataTmProducesFirstClassification self = new QueryIntentionPriceResponseBodyDataTmProducesFirstClassification();
            return TeaModel.build(map, self);
        }

        public QueryIntentionPriceResponseBodyDataTmProducesFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryIntentionPriceResponseBodyDataTmProducesFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications self = new QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications();
            return TeaModel.build(map, self);
        }

        public QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryIntentionPriceResponseBodyDataTmProducesThirdClassification extends TeaModel {
        @NameInMap("ThirdClassifications")
        public java.util.List<QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications;

        public static QueryIntentionPriceResponseBodyDataTmProducesThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionPriceResponseBodyDataTmProducesThirdClassification self = new QueryIntentionPriceResponseBodyDataTmProducesThirdClassification();
            return TeaModel.build(map, self);
        }

        public QueryIntentionPriceResponseBodyDataTmProducesThirdClassification setThirdClassifications(java.util.List<QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications) {
            this.thirdClassifications = thirdClassifications;
            return this;
        }
        public java.util.List<QueryIntentionPriceResponseBodyDataTmProducesThirdClassificationThirdClassifications> getThirdClassifications() {
            return this.thirdClassifications;
        }

    }

    public static class QueryIntentionPriceResponseBodyDataTmProduces extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FirstClassification")
        public QueryIntentionPriceResponseBodyDataTmProducesFirstClassification firstClassification;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("MaterialName")
        public String materialName;

        @NameInMap("Note")
        public String note;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("ServicePrice")
        public Float servicePrice;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplementId")
        public Long supplementId;

        @NameInMap("SupplementStatus")
        public Integer supplementStatus;

        @NameInMap("ThirdClassification")
        public QueryIntentionPriceResponseBodyDataTmProducesThirdClassification thirdClassification;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryIntentionPriceResponseBodyDataTmProduces build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionPriceResponseBodyDataTmProduces self = new QueryIntentionPriceResponseBodyDataTmProduces();
            return TeaModel.build(map, self);
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setFirstClassification(QueryIntentionPriceResponseBodyDataTmProducesFirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }
        public QueryIntentionPriceResponseBodyDataTmProducesFirstClassification getFirstClassification() {
            return this.firstClassification;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setMaterialName(String materialName) {
            this.materialName = materialName;
            return this;
        }
        public String getMaterialName() {
            return this.materialName;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setServicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }
        public Float getServicePrice() {
            return this.servicePrice;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setThirdClassification(QueryIntentionPriceResponseBodyDataTmProducesThirdClassification thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public QueryIntentionPriceResponseBodyDataTmProducesThirdClassification getThirdClassification() {
            return this.thirdClassification;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryIntentionPriceResponseBodyDataTmProduces setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryIntentionPriceResponseBodyData extends TeaModel {
        @NameInMap("TmProduces")
        public java.util.List<QueryIntentionPriceResponseBodyDataTmProduces> tmProduces;

        public static QueryIntentionPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionPriceResponseBodyData self = new QueryIntentionPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIntentionPriceResponseBodyData setTmProduces(java.util.List<QueryIntentionPriceResponseBodyDataTmProduces> tmProduces) {
            this.tmProduces = tmProduces;
            return this;
        }
        public java.util.List<QueryIntentionPriceResponseBodyDataTmProduces> getTmProduces() {
            return this.tmProduces;
        }

    }

}
