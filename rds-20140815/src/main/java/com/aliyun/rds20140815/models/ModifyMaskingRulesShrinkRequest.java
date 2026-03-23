// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesShrinkRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o******6d5</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Database name</p>
     * 
     * <strong>example:</strong>
     * <p>myDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>Name of the default encryption or masking algorithm</p>
     * 
     * <strong>example:</strong>
     * <p>sm4-128-gcm</p>
     */
    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    /**
     * <p>Indicates whether the rule is enabled. Valid values: true, false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>Rule algorithm. Multiple algorithms can be specified. Masking Algorithm can include additional parameters. Format: {name: algorithm1}, {name: algorithm2, params: {encryption position, number of encrypted digits}}</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;sha256&quot;},
     *         {&quot;name&quot;:&quot;sm4-128-gcm&quot;}]</p>
     */
    @NameInMap("MaskingAlgo")
    public String maskingAlgo;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Rule configuration, in JSON string format</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfigShrink;

    /**
     * <p>Name of the rule to modify</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rulename1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ModifyMaskingRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesShrinkRequest self = new ModifyMaskingRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesShrinkRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyMaskingRulesShrinkRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public ModifyMaskingRulesShrinkRequest setDefaultAlgo(String defaultAlgo) {
        this.defaultAlgo = defaultAlgo;
        return this;
    }
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    public ModifyMaskingRulesShrinkRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public ModifyMaskingRulesShrinkRequest setMaskingAlgo(String maskingAlgo) {
        this.maskingAlgo = maskingAlgo;
        return this;
    }
    public String getMaskingAlgo() {
        return this.maskingAlgo;
    }

    public ModifyMaskingRulesShrinkRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaskingRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaskingRulesShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaskingRulesShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaskingRulesShrinkRequest setRuleConfigShrink(String ruleConfigShrink) {
        this.ruleConfigShrink = ruleConfigShrink;
        return this;
    }
    public String getRuleConfigShrink() {
        return this.ruleConfigShrink;
    }

    public ModifyMaskingRulesShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
