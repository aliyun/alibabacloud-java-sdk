// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmRequest extends TeaModel {
    /**
     * <p>Quota alarm name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_344t4 alarm</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("OriginalContext")
    public String originalContext;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, check the <code>ProductCode</code> parameter that is described in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
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
     * <p> To obtain the quota ID of an Alibaba Cloud service, call the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> operation and check the value of <code>QuotaActionCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_hvnoqv</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota dimensions. A quota item is uniquely identified by the values of <code>Dimensions</code> and <code>QuotaActionCode</code>.</p>
     * <blockquote>
     * <p> This parameter is required for specific Alibaba Cloud services. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the quota dimensions that are supported by an Alibaba Cloud service. The value of <code>Requisite</code> in the response indicates whether a dimension is required.</p>
     * </blockquote>
     */
    @NameInMap("QuotaDimensions")
    public java.util.List<CreateQuotaAlarmRequestQuotaDimensions> quotaDimensions;

    /**
     * <p>The numerical value of the quota alarm threshold. Value settings:</p>
     * <ul>
     * <li>When <code>ThresholdType</code> is set to <code>used</code>, an alarm notification will be sent if the used amount of the quota is greater than or equal to the preset value. The quota alarm threshold must be greater than the used amount of the quota.</li>
     * <li>When <code>ThresholdType</code> is set to <code>usable</code>, an alarm notification will be sent if the remaining available amount of the quota is less than or equal to the preset value. The quota alarm threshold must be less than the remaining available amount of the quota.<blockquote>
     * <p>One of this parameter and ThresholdPercent must be set.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    /**
     * <p>The percentage of the quota alert threshold. Values:</p>
     * <ul>
     * <li>When <code>ThresholdType</code> is set to <code>used</code>, you will receive an alert notification if the used amount of the quota is greater than or equal to the preset percentage. The value range is (50%, 100%].</li>
     * <li>When <code>ThresholdType</code> is set to <code>usable</code>, you will receive an alert notification if the remaining available amount of the quota is less than or equal to the preset percentage. The value range is (0%, 50%].<blockquote>
     * <p>One of this parameter and Threshold must be set.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ThresholdPercent")
    public Float thresholdPercent;

    /**
     * <p>The type of the quota alert. Valid values:</p>
     * <ul>
     * <li>used (default): The alert is created for the used quota.</li>
     * <li>usable: The alert is created for the available quota.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>used</p>
     */
    @NameInMap("ThresholdType")
    public String thresholdType;

    /**
     * <p>The quota center sends alert information to the specified public URL address via a POST request using the HTTP protocol.</p>
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
         * <p>The key of the dimension.</p>
         * <blockquote>
         * <p> You must configure <code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> at the same time. The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the dimensions that are supported by an Alibaba Cloud service. The number of items in the returned array is N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <blockquote>
         * <p> You must configure <code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> at the same time. The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the dimensions that are supported by an Alibaba Cloud service. The number of items in the returned array is N.</p>
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
