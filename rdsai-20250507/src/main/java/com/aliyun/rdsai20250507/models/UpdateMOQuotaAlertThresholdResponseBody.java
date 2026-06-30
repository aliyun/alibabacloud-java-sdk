// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateMOQuotaAlertThresholdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result list.</p>
     */
    @NameInMap("Results")
    public java.util.List<UpdateMOQuotaAlertThresholdResponseBodyResults> results;

    /**
     * <p>A value of <code>true</code> indicates that the request was successful.</p>
     * 
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
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("Apikey")
        public String apikey;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-o*****1</p>
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
         * <p>The key type.</p>
         * 
         * <strong>example:</strong>
         * <p>system / custom</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The alert threshold percentage. For example, a value of 80 triggers an alert when usage reaches 80% of the usage quota. The alert is reset after the usage falls below this percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>[0, 100]，0 会清理告警设置</p>
         */
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
