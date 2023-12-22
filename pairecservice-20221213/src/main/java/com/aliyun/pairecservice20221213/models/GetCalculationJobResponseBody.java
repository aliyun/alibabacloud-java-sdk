// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetCalculationJobResponseBody extends TeaModel {
    @NameInMap("ABMetricId")
    public String ABMetricId;

    @NameInMap("ABMetricName")
    public String ABMetricName;

    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("Config")
    public String config;

    @NameInMap("GmtRanTime")
    public String gmtRanTime;

    @NameInMap("JobMessage")
    public java.util.List<String> jobMessage;

    @NameInMap("JobSource")
    public String jobSource;

    @NameInMap("RequestId")
    public String requestId;

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
