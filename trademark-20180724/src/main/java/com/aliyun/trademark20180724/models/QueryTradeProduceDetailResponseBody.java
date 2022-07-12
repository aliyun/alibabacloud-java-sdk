// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryTradeProduceDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTradeProduceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceDetailResponseBody self = new QueryTradeProduceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceDetailResponseBody setData(QueryTradeProduceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeProduceDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTradeProduceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTradeProduceDetailResponseBodyData extends TeaModel {
        @NameInMap("AllowCancel")
        public Boolean allowCancel;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BuyerStatus")
        public Integer buyerStatus;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("ConfiscateAmount")
        public Float confiscateAmount;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExclusiveDateLimit")
        public String exclusiveDateLimit;

        @NameInMap("Extend")
        public java.util.Map<String, ?> extend;

        @NameInMap("FinalAmount")
        public Float finalAmount;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("OperateNote")
        public String operateNote;

        @NameInMap("PaidAmount")
        public Float paidAmount;

        @NameInMap("PreAmount")
        public Float preAmount;

        @NameInMap("PreOrderId")
        public String preOrderId;

        @NameInMap("RefundAmount")
        public Float refundAmount;

        @NameInMap("RegisterNumber")
        public String registerNumber;

        @NameInMap("Share")
        public String share;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("ThirdCode")
        public String thirdCode;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryTradeProduceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeProduceDetailResponseBodyData self = new QueryTradeProduceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeProduceDetailResponseBodyData setAllowCancel(Boolean allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public Boolean getAllowCancel() {
            return this.allowCancel;
        }

        public QueryTradeProduceDetailResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeProduceDetailResponseBodyData setBuyerStatus(Integer buyerStatus) {
            this.buyerStatus = buyerStatus;
            return this;
        }
        public Integer getBuyerStatus() {
            return this.buyerStatus;
        }

        public QueryTradeProduceDetailResponseBodyData setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTradeProduceDetailResponseBodyData setConfiscateAmount(Float confiscateAmount) {
            this.confiscateAmount = confiscateAmount;
            return this;
        }
        public Float getConfiscateAmount() {
            return this.confiscateAmount;
        }

        public QueryTradeProduceDetailResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTradeProduceDetailResponseBodyData setExclusiveDateLimit(String exclusiveDateLimit) {
            this.exclusiveDateLimit = exclusiveDateLimit;
            return this;
        }
        public String getExclusiveDateLimit() {
            return this.exclusiveDateLimit;
        }

        public QueryTradeProduceDetailResponseBodyData setExtend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, ?> getExtend() {
            return this.extend;
        }

        public QueryTradeProduceDetailResponseBodyData setFinalAmount(Float finalAmount) {
            this.finalAmount = finalAmount;
            return this;
        }
        public Float getFinalAmount() {
            return this.finalAmount;
        }

        public QueryTradeProduceDetailResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTradeProduceDetailResponseBodyData setOperateNote(String operateNote) {
            this.operateNote = operateNote;
            return this;
        }
        public String getOperateNote() {
            return this.operateNote;
        }

        public QueryTradeProduceDetailResponseBodyData setPaidAmount(Float paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }
        public Float getPaidAmount() {
            return this.paidAmount;
        }

        public QueryTradeProduceDetailResponseBodyData setPreAmount(Float preAmount) {
            this.preAmount = preAmount;
            return this;
        }
        public Float getPreAmount() {
            return this.preAmount;
        }

        public QueryTradeProduceDetailResponseBodyData setPreOrderId(String preOrderId) {
            this.preOrderId = preOrderId;
            return this;
        }
        public String getPreOrderId() {
            return this.preOrderId;
        }

        public QueryTradeProduceDetailResponseBodyData setRefundAmount(Float refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Float getRefundAmount() {
            return this.refundAmount;
        }

        public QueryTradeProduceDetailResponseBodyData setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public QueryTradeProduceDetailResponseBodyData setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public QueryTradeProduceDetailResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public QueryTradeProduceDetailResponseBodyData setThirdCode(String thirdCode) {
            this.thirdCode = thirdCode;
            return this;
        }
        public String getThirdCode() {
            return this.thirdCode;
        }

        public QueryTradeProduceDetailResponseBodyData setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryTradeProduceDetailResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryTradeProduceDetailResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
