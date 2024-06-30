// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaAlarmResponseBody extends TeaModel {
    /**
     * <p>The details of the quota alert.</p>
     */
    @NameInMap("QuotaAlarm")
    public GetQuotaAlarmResponseBodyQuotaAlarm quotaAlarm;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>81B9D511-F3DD-43B1-9A81-1795DDB52ADF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQuotaAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaAlarmResponseBody self = new GetQuotaAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaAlarmResponseBody setQuotaAlarm(GetQuotaAlarmResponseBodyQuotaAlarm quotaAlarm) {
        this.quotaAlarm = quotaAlarm;
        return this;
    }
    public GetQuotaAlarmResponseBodyQuotaAlarm getQuotaAlarm() {
        return this.quotaAlarm;
    }

    public GetQuotaAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaAlarmResponseBodyQuotaAlarm extends TeaModel {
        /**
         * <p>The ID of the quota alert.</p>
         * 
         * <strong>example:</strong>
         * <p>78d7e436-4b25-4897-84b5-d7b656bb****</p>
         */
        @NameInMap("AlarmId")
        public String alarmId;

        /**
         * <p>The name of the quota alert.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testacccn-hangzhouquotasquotaalarm81611</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>The time when the quota alert was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T03:47:28Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>accountContact</p>
         */
        @NameInMap("NotifyTarget")
        public String notifyTarget;

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The quota dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("QuotaDimension")
        public java.util.Map<String, ?> quotaDimension;

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("QuotaUsage")
        public Float quotaUsage;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>804</p>
         */
        @NameInMap("QuotaValue")
        public Float quotaValue;

        /**
         * <p>The numeric value of the alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The percentage of the alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

        /**
         * <p>The type of the quota alert. Valid values:</p>
         * <ul>
         * <li>used: The alert is created for the used quota.</li>
         * <li>usable: The alert is created for the available quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>used</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <p>The webhook URL. Quota Center sends alert notifications to the specified URL by using HTTP POST requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alert.aliyun.com/callback">https://alert.aliyun.com/callback</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static GetQuotaAlarmResponseBodyQuotaAlarm build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaAlarmResponseBodyQuotaAlarm self = new GetQuotaAlarmResponseBodyQuotaAlarm();
            return TeaModel.build(map, self);
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaDimension(java.util.Map<String, ?> quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public java.util.Map<String, ?> getQuotaDimension() {
            return this.quotaDimension;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaUsage(Float quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaValue(Float quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Float getQuotaValue() {
            return this.quotaValue;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
