// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the quota alert.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/440561.html">ListQuotaAlarms</a> operation to obtain the ID of a quota alert.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2efa7fc-832f-47bb-8054-39e28012****</p>
     */
    @NameInMap("AlarmId")
    public String alarmId;

    /**
     * <p>The name of the quota alert.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/440561.html">ListQuotaAlarms</a> operation to obtain the name of a quota alert.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rules</p>
     */
    @NameInMap("AlarmName")
    public String alarmName;

    /**
     * <p>The numeric value of the alert threshold. Valid values:</p>
     * <ul>
     * <li>If you set the <code>ThresholdType</code> parameter to <code>used</code>, you will receive an alert notification when the used quota is greater than or equal to the preset alert threshold. The alert threshold must be greater than the current used quota.</li>
     * <li>If you set the <code>ThresholdType</code> parameter to <code>usable</code>, you will receive an alert notification when the available quota is less than or equal to the preset alert threshold. The alert threshold must be less than the current available quota.</li>
     * </ul>
     * <blockquote>
     * <p>You must set one of the Threshold and ThresholdPercent parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    /**
     * <p>The percentage of the alert threshold. Valid values:</p>
     * <ul>
     * <li>If you set <code>ThresholdType</code> to <code>used</code>, you receive an alert notification when the used quota is greater than or equal to the preset percentage of the alert threshold. Value range: (50%, 100%].</li>
     * <li>If you set <code>ThresholdType</code> to <code>usable</code>, you receive an alert notification when the available quota is less than or equal to the preset percentage of the alert threshold. Value range: (0%, 50%].</li>
     * </ul>
     * <blockquote>
     * <p> You must set one of Threshold and ThresholdPercent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>51</p>
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
     * <p>usable</p>
     */
    @NameInMap("ThresholdType")
    public String thresholdType;

    /**
     * <p>The webhook URL. Quota Center sends alert notifications to the specified URL by using HTTP POST requests.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://alert.aliyun.com/callback">https://alert.aliyun.com/callback</a></p>
     */
    @NameInMap("WebHook")
    public String webHook;

    public static UpdateQuotaAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaAlarmRequest self = new UpdateQuotaAlarmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaAlarmRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

    public UpdateQuotaAlarmRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public UpdateQuotaAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public UpdateQuotaAlarmRequest setThresholdPercent(Float thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    public UpdateQuotaAlarmRequest setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }
    public String getThresholdType() {
        return this.thresholdType;
    }

    public UpdateQuotaAlarmRequest setWebHook(String webHook) {
        this.webHook = webHook;
        return this;
    }
    public String getWebHook() {
        return this.webHook;
    }

}
