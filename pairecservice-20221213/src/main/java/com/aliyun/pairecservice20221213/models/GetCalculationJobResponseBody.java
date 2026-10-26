// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetCalculationJobResponseBody extends TeaModel {
    /**
     * <p>The AB metric ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ABMetricId")
    public String ABMetricId;

    /**
     * <p>The AB metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("ABMetricName")
    public String ABMetricName;

    /**
     * <p>The business date. The value is in YYYY-MM-DD format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The task configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The time when the task ran. The value is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtRanTime")
    public String gmtRanTime;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("JobMessage")
    public java.util.List<String> jobMessage;

    /**
     * <p>The task source. Valid values:</p>
     * <ul>
     * <li>CronOffline: a scheduled offline task.</li>
     * <li>DataRerun: a data rerun task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CronOffline</p>
     */
    @NameInMap("JobSource")
    public String jobSource;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D59453C-48AA-5FC5-8848-2D373BD1A17F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the compute task. Valid values:</p>
     * <ul>
     * <li>Success: The task succeeded.</li>
     * <li>Failure: The task failed.</li>
     * <li>Initializing: The task is being initialized.</li>
     * <li>Running: The task is running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetCalculationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCalculationJobResponseBody self = new GetCalculationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCalculationJobResponseBody setABMetricId(String ABMetricId) {
        this.ABMetricId = ABMetricId;
        return this;
    }
    public String getABMetricId() {
        return this.ABMetricId;
    }

    public GetCalculationJobResponseBody setABMetricName(String ABMetricName) {
        this.ABMetricName = ABMetricName;
        return this;
    }
    public String getABMetricName() {
        return this.ABMetricName;
    }

    public GetCalculationJobResponseBody setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetCalculationJobResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetCalculationJobResponseBody setGmtRanTime(String gmtRanTime) {
        this.gmtRanTime = gmtRanTime;
        return this;
    }
    public String getGmtRanTime() {
        return this.gmtRanTime;
    }

    public GetCalculationJobResponseBody setJobMessage(java.util.List<String> jobMessage) {
        this.jobMessage = jobMessage;
        return this;
    }
    public java.util.List<String> getJobMessage() {
        return this.jobMessage;
    }

    public GetCalculationJobResponseBody setJobSource(String jobSource) {
        this.jobSource = jobSource;
        return this;
    }
    public String getJobSource() {
        return this.jobSource;
    }

    public GetCalculationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCalculationJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
