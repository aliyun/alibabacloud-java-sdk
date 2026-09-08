// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleShrinkRequest extends TeaModel {
    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("SubRuleList")
    public String subRuleListShrink;

    public static DeleteDataMaskingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataMaskingRuleShrinkRequest self = new DeleteDataMaskingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataMaskingRuleShrinkRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DeleteDataMaskingRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDataMaskingRuleShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDataMaskingRuleShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeleteDataMaskingRuleShrinkRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DeleteDataMaskingRuleShrinkRequest setSubRuleListShrink(String subRuleListShrink) {
        this.subRuleListShrink = subRuleListShrink;
        return this;
    }
    public String getSubRuleListShrink() {
        return this.subRuleListShrink;
    }

}
