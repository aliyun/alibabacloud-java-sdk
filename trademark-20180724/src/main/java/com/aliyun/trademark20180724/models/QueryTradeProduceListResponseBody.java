// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTradeProduceListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTradeProduceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceListResponseBody self = new QueryTradeProduceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTradeProduceListResponseBody setData(QueryTradeProduceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeProduceListResponseBodyData getData() {
        return this.data;
    }

    public QueryTradeProduceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeProduceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTradeProduceListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTradeProduceListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTradeProduceListResponseBodyDataTradeProduces extends TeaModel {
        @NameInMap("AllowCancel")
        public Boolean allowCancel;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BuyerStatus")
        public Integer buyerStatus;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FailReason")
        public Integer failReason;

        @NameInMap("FinalAmount")
        public Float finalAmount;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("OperateNote")
        public String operateNote;

        @NameInMap("PreAmount")
        public Float preAmount;

        @NameInMap("PreOrderId")
        public String preOrderId;

        @NameInMap("RegisterNumber")
        public String registerNumber;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryTradeProduceListResponseBodyDataTradeProduces build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeProduceListResponseBodyDataTradeProduces self = new QueryTradeProduceListResponseBodyDataTradeProduces();
            return TeaModel.build(map, self);
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setBuyerStatus(Integer buyerStatus) {
            this.buyerStatus = buyerStatus;
            return this;
        }
        public Integer getBuyerStatus() {
            return this.buyerStatus;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setFailReason(Integer failReason) {
            this.failReason = failReason;
            return this;
        }
        public Integer getFailReason() {
            return this.failReason;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setFinalAmount(Float finalAmount) {
            this.finalAmount = finalAmount;
            return this;
        }
        public Float getFinalAmount() {
            return this.finalAmount;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setOperateNote(String operateNote) {
            this.operateNote = operateNote;
            return this;
        }
        public String getOperateNote() {
            return this.operateNote;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setPreAmount(Float preAmount) {
            this.preAmount = preAmount;
            return this;
        }
        public Float getPreAmount() {
            return this.preAmount;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setPreOrderId(String preOrderId) {
            this.preOrderId = preOrderId;
            return this;
        }
        public String getPreOrderId() {
            return this.preOrderId;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryTradeProduceListResponseBodyDataTradeProduces setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryTradeProduceListResponseBodyData extends TeaModel {
        @NameInMap("TradeProduces")
        public java.util.List<QueryTradeProduceListResponseBodyDataTradeProduces> tradeProduces;

        public static QueryTradeProduceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeProduceListResponseBodyData self = new QueryTradeProduceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeProduceListResponseBodyData setTradeProduces(java.util.List<QueryTradeProduceListResponseBodyDataTradeProduces> tradeProduces) {
            this.tradeProduces = tradeProduces;
            return this;
        }
        public java.util.List<QueryTradeProduceListResponseBodyDataTradeProduces> getTradeProduces() {
            return this.tradeProduces;
        }

    }

}
