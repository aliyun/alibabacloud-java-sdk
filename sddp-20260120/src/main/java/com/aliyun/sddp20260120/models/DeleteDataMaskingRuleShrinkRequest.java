// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleShrinkRequest extends TeaModel {
    /**
     * <p>The database engine type. The value must be the same as the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The database instance identifier. You can obtain this value from the Items[].InstanceId field in the response of the ListDataMaskingInstances operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response message. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If this parameter is specified together with ProductCode, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The list of column encryption targets grouped by database and table.</p>
     */
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
