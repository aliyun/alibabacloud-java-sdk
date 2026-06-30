// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateMOQuotaAlertThresholdRequest extends TeaModel {
    /**
     * <p>A list of API keys.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Apikey")
    public java.util.List<UpdateMOQuotaAlertThresholdRequestApikey> apikey;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMOQuotaAlertThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMOQuotaAlertThresholdRequest self = new UpdateMOQuotaAlertThresholdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMOQuotaAlertThresholdRequest setApikey(java.util.List<UpdateMOQuotaAlertThresholdRequestApikey> apikey) {
        this.apikey = apikey;
        return this;
    }
    public java.util.List<UpdateMOQuotaAlertThresholdRequestApikey> getApikey() {
        return this.apikey;
    }

    public UpdateMOQuotaAlertThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateMOQuotaAlertThresholdRequestApikey extends TeaModel {
        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-rds-*****</p>
         */
        @NameInMap("Apikey")
        public String apikey;

        /**
         * <p>The alert threshold percentage. For example, a value of 80 triggers an alert when usage reaches 80% of the usage quota. The alert is reset after the usage falls below this percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>[0, 100]，0 会清理告警设置</p>
         */
        @NameInMap("ThresholdPercent")
        public Integer thresholdPercent;

        public static UpdateMOQuotaAlertThresholdRequestApikey build(java.util.Map<String, ?> map) throws Exception {
            UpdateMOQuotaAlertThresholdRequestApikey self = new UpdateMOQuotaAlertThresholdRequestApikey();
            return TeaModel.build(map, self);
        }

        public UpdateMOQuotaAlertThresholdRequestApikey setApikey(String apikey) {
            this.apikey = apikey;
            return this;
        }
        public String getApikey() {
            return this.apikey;
        }

        public UpdateMOQuotaAlertThresholdRequestApikey setThresholdPercent(Integer thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

    }

}
