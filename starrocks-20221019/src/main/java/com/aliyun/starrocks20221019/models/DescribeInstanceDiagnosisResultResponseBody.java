// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<DescribeInstanceDiagnosisResultResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeInstanceDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDiagnosisResultResponseBody self = new DescribeInstanceDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDiagnosisResultResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeInstanceDiagnosisResultResponseBody setData(java.util.List<DescribeInstanceDiagnosisResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceDiagnosisResultResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceDiagnosisResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInstanceDiagnosisResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeInstanceDiagnosisResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstanceDiagnosisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDiagnosisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceDiagnosisResultResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstanceDiagnosisResultResponseBodyData extends TeaModel {
        @NameInMap("BestPractice")
        public String bestPractice;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>table_analysis</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <strong>example:</strong>
         * <p>2026-03-08T02:12:32Z</p>
         */
        @NameInMap("EvaluationTime")
        public Long evaluationTime;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("FullScore")
        public Double fullScore;

        /**
         * <strong>example:</strong>
         * <p>c-b25e21e243889XXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>for autotest</p>
         */
        @NameInMap("Introduction")
        public String introduction;

        /**
         * <strong>example:</strong>
         * <p>02cf887a</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>2026-03-08</p>
         */
        @NameInMap("ReportDate")
        public String reportDate;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeInstanceDiagnosisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDiagnosisResultResponseBodyData self = new DescribeInstanceDiagnosisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setBestPractice(String bestPractice) {
            this.bestPractice = bestPractice;
            return this;
        }
        public String getBestPractice() {
            return this.bestPractice;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setEvaluationTime(Long evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }
        public Long getEvaluationTime() {
            return this.evaluationTime;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setFullScore(Double fullScore) {
            this.fullScore = fullScore;
            return this;
        }
        public Double getFullScore() {
            return this.fullScore;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public String getReportDate() {
            return this.reportDate;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceDiagnosisResultResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
