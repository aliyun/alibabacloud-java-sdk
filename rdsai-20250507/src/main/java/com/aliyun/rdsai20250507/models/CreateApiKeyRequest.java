// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>api-*****</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("LimitRate")
    public Double limitRate;

    @NameInMap("LimitType")
    public String limitType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("TokenQuota")
    public Long tokenQuota;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
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

    public CreateApiKeyRequest setTokenQuota(Long tokenQuota) {
        this.tokenQuota = tokenQuota;
        return this;
    }
    public Long getTokenQuota() {
        return this.tokenQuota;
    }

}
