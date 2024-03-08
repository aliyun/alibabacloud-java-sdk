// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Trials")
    public java.util.List<ListHpoTrialsResponseBodyTrials> trials;

    public static ListHpoTrialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialsResponseBody self = new ListHpoTrialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHpoTrialsResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public ListHpoTrialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHpoTrialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHpoTrialsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHpoTrialsResponseBody setTrials(java.util.List<ListHpoTrialsResponseBodyTrials> trials) {
        this.trials = trials;
        return this;
    }
    public java.util.List<ListHpoTrialsResponseBodyTrials> getTrials() {
        return this.trials;
    }

    public static class ListHpoTrialsResponseBodyTrials extends TeaModel {
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

        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Model")
        public String model;

        @NameInMap("ParameterId")
        public Integer parameterId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrialId")
        public String trialId;

        @NameInMap("UserComment")
        public String userComment;

        @NameInMap("UserScore")
        public Integer userScore;

        public static ListHpoTrialsResponseBodyTrials build(java.util.Map<String, ?> map) throws Exception {
            ListHpoTrialsResponseBodyTrials self = new ListHpoTrialsResponseBodyTrials();
            return TeaModel.build(map, self);
        }

        public ListHpoTrialsResponseBodyTrials setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListHpoTrialsResponseBodyTrials setFinalMetric(String finalMetric) {
            this.finalMetric = finalMetric;
            return this;
        }
        public String getFinalMetric() {
            return this.finalMetric;
        }

        public ListHpoTrialsResponseBodyTrials setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListHpoTrialsResponseBodyTrials setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListHpoTrialsResponseBodyTrials setHyperparam(String hyperparam) {
            this.hyperparam = hyperparam;
            return this;
        }
        public String getHyperparam() {
            return this.hyperparam;
        }

        public ListHpoTrialsResponseBodyTrials setJobMeta(String jobMeta) {
            this.jobMeta = jobMeta;
            return this;
        }
        public String getJobMeta() {
            return this.jobMeta;
        }

        public ListHpoTrialsResponseBodyTrials setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListHpoTrialsResponseBodyTrials setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListHpoTrialsResponseBodyTrials setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListHpoTrialsResponseBodyTrials setParameterId(Integer parameterId) {
            this.parameterId = parameterId;
            return this;
        }
        public Integer getParameterId() {
            return this.parameterId;
        }

        public ListHpoTrialsResponseBodyTrials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHpoTrialsResponseBodyTrials setTrialId(String trialId) {
            this.trialId = trialId;
            return this;
        }
        public String getTrialId() {
            return this.trialId;
        }

        public ListHpoTrialsResponseBodyTrials setUserComment(String userComment) {
            this.userComment = userComment;
            return this;
        }
        public String getUserComment() {
            return this.userComment;
        }

        public ListHpoTrialsResponseBodyTrials setUserScore(Integer userScore) {
            this.userScore = userScore;
            return this;
        }
        public Integer getUserScore() {
            return this.userScore;
        }

    }

}
