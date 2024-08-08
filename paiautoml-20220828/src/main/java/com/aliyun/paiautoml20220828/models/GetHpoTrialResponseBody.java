// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoTrialResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Extra error information.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>Experiment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abcde</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>Final metric of the trial.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;default&quot;:0.087745,&quot;type&quot;:&quot;FINAL&quot;,&quot;val_loss=([0-9\\\\.]+)&quot;:0.087745}</p>
     */
    @NameInMap("FinalMetric")
    public String finalMetric;

    /**
     * <p>Trial create time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-02 12:34:56</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Trial last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-02 21:32:56</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Hyperparameters used to run the trial.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;${centerCount}&quot;: 5, &quot;${distanceType}&quot;: &quot;cosine&quot;}</p>
     */
    @NameInMap("Hyperparam")
    public String hyperparam;

    /**
     * <p>trial meta infomation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nni_trial_id&quot;: &quot;asdf&quot;, &quot;nni_exp_id&quot;: &quot;abcde&quot;, &quot;nni_trial_sequence_id&quot;: 2}</p>
     */
    @NameInMap("JobMeta")
    public String jobMeta;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>metric details uploaded during running.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;default&quot;:0.087745,&quot;val_loss=([0-9\\\\.]+)&quot;:0.087745},
     * {&quot;default&quot;:1.085841,&quot;val_loss=([0-9\\\\.]+)&quot;:0.085841},
     * {&quot;default&quot;:0.087745,&quot;type&quot;:&quot;FINAL&quot;,&quot;val_loss=([0-9\\\\.]+)&quot;:0.087745}]</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>Name of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>AUC or F1, Accuracy etc.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Trial output model.</p>
     * 
     * <strong>example:</strong>
     * <p>model_table_name_foo</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Parameter id, start from 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ParameterId")
    public Integer parameterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Trial status.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED, FAILED, USER_CANCELED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Trail ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mf99W4</p>
     */
    @NameInMap("TrialId")
    public String trialId;

    /**
     * <p>User added comments.</p>
     * 
     * <strong>example:</strong>
     * <p>best trial till now.</p>
     */
    @NameInMap("UserComment")
    public String userComment;

    /**
     * <p>User updated score.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
