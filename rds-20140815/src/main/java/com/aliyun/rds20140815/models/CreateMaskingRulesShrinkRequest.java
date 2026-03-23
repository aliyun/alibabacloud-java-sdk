// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesShrinkRequest extends TeaModel {
    /**
     * <p>instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o3*****d5</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Database name</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>Name of the default encryption or masking algorithm</p>
     * 
     * <strong>example:</strong>
     * <p>aes-128-gcm</p>
     */
    @NameInMap("DefaultAlgo")
    public String defaultAlgo;

    /**
     * <p>Rule algorithm. Multiple algorithms can be selected. Masking Algorithm can include additional parameters. Format: {name: algorithm1}, {name: algorithm2, params: {encryption position, number of encrypted characters}}</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;: &quot;aes-128-gcm&quot;},
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
     * <p>Rule configuration, in JSON string format, containing matching rules for databases, tables, and columns</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfigShrink;

    /**
     * <p>Rule Name (only one rule name is supported per request)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rulename1</p>
     */
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

    public CreateMaskingRulesShrinkRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
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

    public CreateMaskingRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
