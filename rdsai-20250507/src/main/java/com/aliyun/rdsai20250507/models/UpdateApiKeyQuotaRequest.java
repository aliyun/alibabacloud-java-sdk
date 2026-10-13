// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateApiKeyQuotaRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of API keys.</p>
     */
    @NameInMap("Keys")
    public java.util.List<UpdateApiKeyQuotaRequestKeys> keys;

    public static UpdateApiKeyQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyQuotaRequest self = new UpdateApiKeyQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyQuotaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApiKeyQuotaRequest setKeys(java.util.List<UpdateApiKeyQuotaRequestKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<UpdateApiKeyQuotaRequestKeys> getKeys() {
        return this.keys;
    }

    public static class UpdateApiKeyQuotaRequestKeys extends TeaModel {
        /**
         * <p>API KEY</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-xxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>100000000</p>
         */
        @NameInMap("DailyTokenQuota")
        public Long dailyTokenQuota;

        /**
         * <p>The throttling ratio. This parameter is required when type is set to ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("LimitRate")
        public Double limitRate;

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li>ratio: by ratio.</li>
         * <li>fixed: by fixed value.</li>
         * <li>auto: automatic allocation of EPS resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <p>The fixed throttling value. This parameter is required when type is set to fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TokenQuota")
        public Long tokenQuota;

        public static UpdateApiKeyQuotaRequestKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyQuotaRequestKeys self = new UpdateApiKeyQuotaRequestKeys();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyQuotaRequestKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateApiKeyQuotaRequestKeys setDailyTokenQuota(Long dailyTokenQuota) {
            this.dailyTokenQuota = dailyTokenQuota;
            return this;
        }
        public Long getDailyTokenQuota() {
            return this.dailyTokenQuota;
        }

        public UpdateApiKeyQuotaRequestKeys setLimitRate(Double limitRate) {
            this.limitRate = limitRate;
            return this;
        }
        public Double getLimitRate() {
            return this.limitRate;
        }

        public UpdateApiKeyQuotaRequestKeys setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateApiKeyQuotaRequestKeys setTokenQuota(Long tokenQuota) {
            this.tokenQuota = tokenQuota;
            return this;
        }
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

    }

}
