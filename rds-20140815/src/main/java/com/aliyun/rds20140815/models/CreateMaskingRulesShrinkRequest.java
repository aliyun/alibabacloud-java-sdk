// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesShrinkRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleConfig")
    public String ruleConfigShrink;

    @NameInMap("RuleName")
    public String ruleName;

    public static CreateMaskingRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaskingRulesShrinkRequest self = new CreateMaskingRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaskingRulesShrinkRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateMaskingRulesShrinkRequest setDefaultAlgo(String defaultAlgo) {
        this.defaultAlgo = defaultAlgo;
        return this;
    }
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    public CreateMaskingRulesShrinkRequest setMaskingAlgo(String maskingAlgo) {
        this.maskingAlgo = maskingAlgo;
        return this;
    }
    public String getMaskingAlgo() {
        return this.maskingAlgo;
    }

    public CreateMaskingRulesShrinkRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateMaskingRulesShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMaskingRulesShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMaskingRulesShrinkRequest setRuleConfigShrink(String ruleConfigShrink) {
        this.ruleConfigShrink = ruleConfigShrink;
        return this;
    }
    public String getRuleConfigShrink() {
        return this.ruleConfigShrink;
    }

    public CreateMaskingRulesShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
