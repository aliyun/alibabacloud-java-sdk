// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The name of the quota alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_hvnoqv alarm</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    /**
     * <p>The original context information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OriginalContext")
    public String originalContext;

    /**
     * <p>The abbreviation of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviation of a cloud service, see ProductCode in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p>For more information about how to obtain the quota ID of a cloud service, see QuotaActionCode in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_hvnoqv</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota dimensions.
     * The dimensions are properties of a quota item. A quota item is uniquely identified by Dimensions and QuotaActionCode.</p>
     * <blockquote>
     * <p>Some dimensions are required for specific cloud services. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions of a cloud service. The Requisite response parameter indicates whether a dimension is required.</p>
     * </blockquote>
     */
    @NameInMap("QuotaDimensions")
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions;

    /**
     * <p>The numeric value of the quota alert threshold. Valid values:</p>
     * <ul>
     * <li><p>If ThresholdType is set to used, you receive an alert notification when the used quota is greater than or equal to the specified value. The quota alert threshold must be greater than the used quota.</p>
     * </li>
     * <li><p>If ThresholdType is set to usable, you receive an alert notification when the available quota is less than or equal to the specified value. The quota alert threshold must be less than the available quota.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify either this parameter or ThresholdPercent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    /**
     * <p>The percentage of the quota alert threshold. Valid values:</p>
     * <ul>
     * <li><p>If ThresholdType is set to used, you receive an alert notification when the used quota is greater than or equal to the specified percentage. Valid values: (50%, 100%].</p>
     * </li>
     * <li><p>If ThresholdType is set to usable, you receive an alert notification when the available quota is less than or equal to the specified percentage. Valid values: (0%, 50%].</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify either this parameter or Threshold.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

    /**
     * <p>The quota alert type. Valid values:</p>
     * <ul>
     * <li>used: alerts on the used quota. This is the default value.</li>
     * <li>usable: alerts on the remaining available quota.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>used</p>
     */
    @NameInMap("ThresholdType")
    public String thresholdType;

    /**
     * <p>The public URL to which Quota Center sends alert notifications by using HTTP POST requests.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://alert.aliyun.com/callback">https://alert.aliyun.com/callback</a></p>
     */
    @NameInMap("WebHook")
    public String webHook;

    public static CreateQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaAlarmRequest self = new CreateQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaAlarmRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public CreateQuotaAlarmRequest setOriginalContext(String originalContext) {
        this.originalContext = originalContext;
        return this;
    }
    public String getOriginalContext() {
        return this.originalContext;
    }

    public CreateQuotaAlarmRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaAlarmRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaAlarmRequest setQuotaDimensions(java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public CreateQuotaAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public CreateQuotaAlarmRequest setThresholdPercent(Float thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    public CreateQuotaAlarmRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }
    public String getThresholdType() {
        return this.thresholdType;
    }

    public CreateQuotaAlarmRequest setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

    public static class CreateQuotaAlarmRequestQuotaDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions. The length of the returned array is the maximum value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <blockquote>
         * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions. The length of the returned array is the maximum value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQuotaAlarmRequestQuotaDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaAlarmRequestQuotaDimensions self = new CreateQuotaAlarmRequestQuotaDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaAlarmRequestQuotaDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaAlarmRequestQuotaDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
