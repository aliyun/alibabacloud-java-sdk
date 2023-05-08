// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetProduceInfoResponseBody extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("GoodsId")
    public String goodsId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProduceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProduceInfoResponseBody self = new GetProduceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProduceInfoResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetProduceInfoResponseBody setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GetProduceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProduceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
