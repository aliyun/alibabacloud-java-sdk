// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckReceivingDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HasPromotion")
    public Boolean hasPromotion;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("TradeOrderId")
    public String tradeOrderId;

    @NameInMap("UnionAmount")
    public String unionAmount;

    public static CheckReceivingDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckReceivingDetailResponseBody self = new CheckReceivingDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckReceivingDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckReceivingDetailResponseBody setHasPromotion(Boolean hasPromotion) {
        this.hasPromotion = hasPromotion;
        return this;
    }
    public Boolean getHasPromotion() {
        return this.hasPromotion;
    }

    public CheckReceivingDetailResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CheckReceivingDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckReceivingDetailResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public CheckReceivingDetailResponseBody setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
        return this;
    }
    public String getTradeOrderId() {
        return this.tradeOrderId;
    }

    public CheckReceivingDetailResponseBody setUnionAmount(String unionAmount) {
        this.unionAmount = unionAmount;
        return this;
    }
    public String getUnionAmount() {
        return this.unionAmount;
    }

}
