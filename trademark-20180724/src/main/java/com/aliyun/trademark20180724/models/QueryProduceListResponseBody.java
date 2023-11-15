// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryProduceListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryProduceListResponseBodyData data;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryProduceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProduceListResponseBody self = new QueryProduceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProduceListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryProduceListResponseBody setData(QueryProduceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProduceListResponseBodyData getData() {
        return this.data;
    }

    public QueryProduceListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryProduceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProduceListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryProduceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProduceListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryProduceListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryProduceListResponseBodyDataTmProducesClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        public static QueryProduceListResponseBodyDataTmProducesClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryProduceListResponseBodyDataTmProducesClassification self = new QueryProduceListResponseBodyDataTmProducesClassification();
            return TeaModel.build(map, self);
        }

        public QueryProduceListResponseBodyDataTmProducesClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryProduceListResponseBodyDataTmProducesClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

    }

    public static class QueryProduceListResponseBodyDataTmProduces extends TeaModel {
        @NameInMap("AgreementId")
        public String agreementId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Classification")
        public QueryProduceListResponseBodyDataTmProducesClassification classification;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("MaterialName")
        public String materialName;

        @NameInMap("Note")
        public String note;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("ReceiptUrl")
        public String receiptUrl;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubmitCount")
        public Integer submitCount;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryProduceListResponseBodyDataTmProduces build(java.util.Map<String, ?> map) throws Exception {
            QueryProduceListResponseBodyDataTmProduces self = new QueryProduceListResponseBodyDataTmProduces();
            return TeaModel.build(map, self);
        }

        public QueryProduceListResponseBodyDataTmProduces setAgreementId(String agreementId) {
            this.agreementId = agreementId;
            return this;
        }
        public String getAgreementId() {
            return this.agreementId;
        }

        public QueryProduceListResponseBodyDataTmProduces setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryProduceListResponseBodyDataTmProduces setClassification(QueryProduceListResponseBodyDataTmProducesClassification classification) {
            this.classification = classification;
            return this;
        }
        public QueryProduceListResponseBodyDataTmProducesClassification getClassification() {
            return this.classification;
        }

        public QueryProduceListResponseBodyDataTmProduces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryProduceListResponseBodyDataTmProduces setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryProduceListResponseBodyDataTmProduces setMaterialName(String materialName) {
            this.materialName = materialName;
            return this;
        }
        public String getMaterialName() {
            return this.materialName;
        }

        public QueryProduceListResponseBodyDataTmProduces setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryProduceListResponseBodyDataTmProduces setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryProduceListResponseBodyDataTmProduces setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public QueryProduceListResponseBodyDataTmProduces setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public QueryProduceListResponseBodyDataTmProduces setReceiptUrl(String receiptUrl) {
            this.receiptUrl = receiptUrl;
            return this;
        }
        public String getReceiptUrl() {
            return this.receiptUrl;
        }

        public QueryProduceListResponseBodyDataTmProduces setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryProduceListResponseBodyDataTmProduces setSubmitCount(Integer submitCount) {
            this.submitCount = submitCount;
            return this;
        }
        public Integer getSubmitCount() {
            return this.submitCount;
        }

        public QueryProduceListResponseBodyDataTmProduces setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryProduceListResponseBodyDataTmProduces setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryProduceListResponseBodyDataTmProduces setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public QueryProduceListResponseBodyDataTmProduces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryProduceListResponseBodyDataTmProduces setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryProduceListResponseBodyDataTmProduces setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryProduceListResponseBodyData extends TeaModel {
        @NameInMap("TmProduces")
        public java.util.List<QueryProduceListResponseBodyDataTmProduces> tmProduces;

        public static QueryProduceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProduceListResponseBodyData self = new QueryProduceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProduceListResponseBodyData setTmProduces(java.util.List<QueryProduceListResponseBodyDataTmProduces> tmProduces) {
            this.tmProduces = tmProduces;
            return this;
        }
        public java.util.List<QueryProduceListResponseBodyDataTmProduces> getTmProduces() {
            return this.tmProduces;
        }

    }

}
