// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeMediaResourcePackageRequest extends TeaModel {
    @NameInMap("ConsumeInfos")
    public String consumeInfos;

    @NameInMap("ConsumeTime")
    public Long consumeTime;

    @NameInMap("ConsumeType")
    public String consumeType;

    @NameInMap("ProductId")
    public String productId;

    public static ConsumeMediaResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumeMediaResourcePackageRequest self = new ConsumeMediaResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public ConsumeMediaResourcePackageRequest setConsumeInfos(String consumeInfos) {
        this.consumeInfos = consumeInfos;
        return this;
    }
    public String getConsumeInfos() {
        return this.consumeInfos;
    }

    public ConsumeMediaResourcePackageRequest setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }
    public Long getConsumeTime() {
        return this.consumeTime;
    }

    public ConsumeMediaResourcePackageRequest setConsumeType(String consumeType) {
        this.consumeType = consumeType;
        return this;
    }
    public String getConsumeType() {
        return this.consumeType;
    }

    public ConsumeMediaResourcePackageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
