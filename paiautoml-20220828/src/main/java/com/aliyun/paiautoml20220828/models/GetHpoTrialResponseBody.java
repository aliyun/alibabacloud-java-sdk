// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoTrialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("FinalMetric")
    public String finalMetric;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Hyperparam")
    public String hyperparam;

    @NameInMap("JobMeta")
    public String jobMeta;

    @NameInMap("Message")
    public String message;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Model")
    public String model;

    @NameInMap("ParameterId")
    public Integer parameterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TrialId")
    public String trialId;

    @NameInMap("UserComment")
    public String userComment;

    @NameInMap("UserScore")
    public Integer userScore;

    public static GetHpoTrialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHpoTrialResponseBody self = new GetHpoTrialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHpoTrialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHpoTrialResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public GetHpoTrialResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetHpoTrialResponseBody setFinalMetric(String finalMetric) {
        this.finalMetric = finalMetric;
        return this;
    }
    public String getFinalMetric() {
        return this.finalMetric;
    }

    public GetHpoTrialResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetHpoTrialResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetHpoTrialResponseBody setHyperparam(String hyperparam) {
        this.hyperparam = hyperparam;
        return this;
    }
    public String getHyperparam() {
        return this.hyperparam;
    }

    public GetHpoTrialResponseBody setJobMeta(String jobMeta) {
        this.jobMeta = jobMeta;
        return this;
    }
    public String getJobMeta() {
        return this.jobMeta;
    }

    public GetHpoTrialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHpoTrialResponseBody setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public GetHpoTrialResponseBody setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetHpoTrialResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetHpoTrialResponseBody setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
        return this;
    }
    public Integer getParameterId() {
        return this.parameterId;
    }

    public GetHpoTrialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHpoTrialResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetHpoTrialResponseBody setTrialId(String trialId) {
        this.trialId = trialId;
        return this;
    }
    public String getTrialId() {
        return this.trialId;
    }

    public GetHpoTrialResponseBody setUserComment(String userComment) {
        this.userComment = userComment;
        return this;
    }
    public String getUserComment() {
        return this.userComment;
    }

    public GetHpoTrialResponseBody setUserScore(Integer userScore) {
        this.userScore = userScore;
        return this;
    }
    public Integer getUserScore() {
        return this.userScore;
    }

}
