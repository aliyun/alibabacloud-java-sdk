// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    /**
     * <p>The daily quota of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000</p>
     */
    @NameInMap("DailyTokenQuota")
    public Long dailyTokenQuota;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The API key name.</p>
     * 
     * <strong>example:</strong>
     * <p>api-*****</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The quota percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("LimitRate")
    public Double limitRate;

    /**
     * <p>The quota allocation method. Valid values:</p>
     * <ul>
     * <li>ratio: by percentage.</li>
     * <li>fixed: by fixed value.</li>
     * <li>auto: automatic allocation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fixed</p>
     */
    @NameInMap("LimitType")
    public String limitType;

    /**
     * <p>The number of API keys to create. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The quota limit for the current key.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TokenQuota")
    public Long tokenQuota;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setDailyTokenQuota(Long dailyTokenQuota) {
        this.dailyTokenQuota = dailyTokenQuota;
        return this;
    }
    public Long getDailyTokenQuota() {
        return this.dailyTokenQuota;
    }

    public CreateApiKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApiKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public CreateApiKeyRequest setLimitRate(Double limitRate) {
        this.limitRate = limitRate;
        return this;
    }
    public Double getLimitRate() {
        return this.limitRate;
    }

    public CreateApiKeyRequest setLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }
    public String getLimitType() {
        return this.limitType;
    }

    public CreateApiKeyRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateApiKeyRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateApiKeyRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateApiKeyRequest setTokenQuota(Long tokenQuota) {
        this.tokenQuota = tokenQuota;
        return this;
    }
    public Long getTokenQuota() {
        return this.tokenQuota;
    }

}
