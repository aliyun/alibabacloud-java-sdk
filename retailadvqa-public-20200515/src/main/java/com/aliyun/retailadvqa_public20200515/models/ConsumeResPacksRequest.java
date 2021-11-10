// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeResPacksRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("ConsumeInfos")
    public String consumeInfos;

    @NameInMap("ConsumeTime")
    public Long consumeTime;

    @NameInMap("ConsumeType")
    public String consumeType;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Template")
    public String template;

    @NameInMap("TenantId")
    public String tenantId;

    public static ConsumeResPacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumeResPacksRequest self = new ConsumeResPacksRequest();
        return TeaModel.build(map, self);
    }

    public ConsumeResPacksRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ConsumeResPacksRequest setConsumeInfos(String consumeInfos) {
        this.consumeInfos = consumeInfos;
        return this;
    }
    public String getConsumeInfos() {
        return this.consumeInfos;
    }

    public ConsumeResPacksRequest setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }
    public Long getConsumeTime() {
        return this.consumeTime;
    }

    public ConsumeResPacksRequest setConsumeType(String consumeType) {
        this.consumeType = consumeType;
        return this;
    }
    public String getConsumeType() {
        return this.consumeType;
    }

    public ConsumeResPacksRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ConsumeResPacksRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public ConsumeResPacksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
