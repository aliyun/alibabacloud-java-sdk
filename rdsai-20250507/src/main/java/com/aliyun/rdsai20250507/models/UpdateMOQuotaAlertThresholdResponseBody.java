// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateMOQuotaAlertThresholdResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<UpdateMOQuotaAlertThresholdResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateMOQuotaAlertThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMOQuotaAlertThresholdResponseBody self = new UpdateMOQuotaAlertThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMOQuotaAlertThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMOQuotaAlertThresholdResponseBody setResults(java.util.List<UpdateMOQuotaAlertThresholdResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<UpdateMOQuotaAlertThresholdResponseBodyResults> getResults() {
        return this.results;
    }

    public UpdateMOQuotaAlertThresholdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMOQuotaAlertThresholdResponseBodyResults extends TeaModel {
        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("Apikey")
        public String apikey;

        /**
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-o*****1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>api-*****</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <strong>example:</strong>
         * <p>system / custom</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("ThresholdPercent")
        public Integer thresholdPercent;

        public static UpdateMOQuotaAlertThresholdResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateMOQuotaAlertThresholdResponseBodyResults self = new UpdateMOQuotaAlertThresholdResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public UpdateMOQuotaAlertThresholdResponseBodyResults setApikey(String apikey) {
            this.apikey = apikey;
            return this;
        }
        public String getApikey() {
            return this.apikey;
        }

        public UpdateMOQuotaAlertThresholdResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateMOQuotaAlertThresholdResponseBodyResults setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public UpdateMOQuotaAlertThresholdResponseBodyResults setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public UpdateMOQuotaAlertThresholdResponseBodyResults setThresholdPercent(Integer thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

    }

}
