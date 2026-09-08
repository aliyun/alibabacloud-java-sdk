// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CreateDataMaskingRuleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncAlgorithm")
    public String encAlgorithm;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <strong>example:</strong>
     * <p>client_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("RiskHandleId")
    public Long riskHandleId;

    @NameInMap("SubRuleList")
    public String subRuleListShrink;

    @NameInMap("UserList")
    public String userListShrink;

    public static CreateDataMaskingRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataMaskingRuleShrinkRequest self = new CreateDataMaskingRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataMaskingRuleShrinkRequest setEncAlgorithm(String encAlgorithm) {
        this.encAlgorithm = encAlgorithm;
        return this;
    }
    public String getEncAlgorithm() {
        return this.encAlgorithm;
    }

    public CreateDataMaskingRuleShrinkRequest setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public CreateDataMaskingRuleShrinkRequest setEncryptionKeyMode(String encryptionKeyMode) {
        this.encryptionKeyMode = encryptionKeyMode;
        return this;
    }
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    public CreateDataMaskingRuleShrinkRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateDataMaskingRuleShrinkRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateDataMaskingRuleShrinkRequest setExpireTimeOperation(String expireTimeOperation) {
        this.expireTimeOperation = expireTimeOperation;
        return this;
    }
    public String getExpireTimeOperation() {
        return this.expireTimeOperation;
    }

    public CreateDataMaskingRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDataMaskingRuleShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataMaskingRuleShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateDataMaskingRuleShrinkRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CreateDataMaskingRuleShrinkRequest setRiskHandleId(Long riskHandleId) {
        this.riskHandleId = riskHandleId;
        return this;
    }
    public Long getRiskHandleId() {
        return this.riskHandleId;
    }

    public CreateDataMaskingRuleShrinkRequest setSubRuleListShrink(String subRuleListShrink) {
        this.subRuleListShrink = subRuleListShrink;
        return this;
    }
    public String getSubRuleListShrink() {
        return this.subRuleListShrink;
    }

    public CreateDataMaskingRuleShrinkRequest setUserListShrink(String userListShrink) {
        this.userListShrink = userListShrink;
        return this;
    }
    public String getUserListShrink() {
        return this.userListShrink;
    }

}
