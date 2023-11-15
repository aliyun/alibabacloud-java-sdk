// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Env")
    public String env;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ReviewSupplementMaterial")
    public Boolean reviewSupplementMaterial;

    public static QueryTrademarkModelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelDetailRequest self = new QueryTrademarkModelDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTrademarkModelDetailRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryTrademarkModelDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryTrademarkModelDetailRequest setReviewSupplementMaterial(Boolean reviewSupplementMaterial) {
        this.reviewSupplementMaterial = reviewSupplementMaterial;
        return this;
    }
    public Boolean getReviewSupplementMaterial() {
        return this.reviewSupplementMaterial;
    }

}
