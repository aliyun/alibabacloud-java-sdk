// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaUtilizationReportResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM.PERMISSION.DENIED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The data generation time or statistical date. For general quotas, the time is in UTC and formatted as yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;. For API rate quotas, the date is formatted as yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-26T06:24:57Z</p>
     */
    @NameInMap("GeneratedAt")
    public String generatedAt;

    /**
     * <p>The supplementary description of the report status, such as report generation in progress, report generation needs to be started first, or a newer report is available for re-query. Applications should use Status to determine the status.</p>
     * 
     * <strong>example:</strong>
     * <p>Quota utilization data is available.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token used to query the next page. An empty value indicates that no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of quota usage on the current page. An empty list is returned if no matching data exists or no general quota report is available.</p>
     */
    @NameInMap("Quotas")
    public java.util.List<ListQuotaUtilizationReportResponseBodyQuotas> quotas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the query result for the quota utilization report. Valid values:</p>
     * <ul>
     * <li><p>AVAILABLE: The data is available for query.</p>
     * </li>
     * <li><p>GENERATING: A new report is being generated. If an unexpired historical report exists, the most recent historical report is returned.</p>
     * </li>
     * <li><p>UNAVAILABLE: No general quota report is available. You must call StartQuotaUtilizationReport to start report generation first.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet all filter conditions in the current report, rather than the number of entries on the current page. The value is 0 if no matching entries exist.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaUtilizationReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaUtilizationReportResponseBody self = new ListQuotaUtilizationReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaUtilizationReportResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQuotaUtilizationReportResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListQuotaUtilizationReportResponseBody setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
        return this;
    }
    public String getGeneratedAt() {
        return this.generatedAt;
    }

    public ListQuotaUtilizationReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQuotaUtilizationReportResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaUtilizationReportResponseBody setQuotas(java.util.List<ListQuotaUtilizationReportResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListQuotaUtilizationReportResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListQuotaUtilizationReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaUtilizationReportResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListQuotaUtilizationReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListQuotaUtilizationReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod extends TeaModel {
        /**
         * <p>The unit of the quota calculation period. Valid values:</p>
         * <ul>
         * <li>second: Seconds.</li>
         * <li>minute: Minutes.</li>
         * <li>hour: Hours.</li>
         * <li>day: Days.</li>
         * <li>week: Weeks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>second</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the quota calculation period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodValue")
        public Integer periodValue;

        public static ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod self = new ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod();
            return TeaModel.build(map, self);
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo extends TeaModel {
        /**
         * <p>The type of the throttling algorithm. Valid values:</p>
         * <ul>
         * <li>FixedWindow: Fixed window.</li>
         * <li>TokenBucket: Token bucket.</li>
         * <li>Concurrency: Concurrency limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FixedWindow</p>
         */
        @NameInMap("AlgoType")
        public String algoType;

        /**
         * <p>The time period. This parameter is returned only for FixedWindow and is empty for other algorithms.</p>
         */
        @NameInMap("Period")
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod period;

        /**
         * <p>The time interval between two token refills. This parameter is returned only for TokenBucket and is empty for other algorithms. The time unit must be confirmed with the upstream service and is not declared in the current code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefillInterval")
        public Integer refillInterval;

        /**
         * <p>The number of tokens added per refill. This parameter is returned only for TokenBucket and is empty for other algorithms.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TokensPerRefill")
        public Integer tokensPerRefill;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuota")
        public Double totalQuota;

        public static ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo self = new ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo();
            return TeaModel.build(map, self);
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo setAlgoType(String algoType) {
            this.algoType = algoType;
            return this;
        }
        public String getAlgoType() {
            return this.algoType;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo setPeriod(ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod period) {
            this.period = period;
            return this;
        }
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod getPeriod() {
            return this.period;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo setRefillInterval(Integer refillInterval) {
            this.refillInterval = refillInterval;
            return this;
        }
        public Integer getRefillInterval() {
            return this.refillInterval;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo setTokensPerRefill(Integer tokensPerRefill) {
            this.tokensPerRefill = tokensPerRefill;
            return this;
        }
        public Integer getTokensPerRefill() {
            return this.tokensPerRefill;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo setTotalQuota(Double totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Double getTotalQuota() {
            return this.totalQuota;
        }

    }

    public static class ListQuotaUtilizationReportResponseBodyQuotasUsageMetric extends TeaModel {
        /**
         * <p>The CloudMonitor monitoring dimensions.</p>
         * <p>Format: a collection of key:value pairs. Example:
         * <code>{&quot;productCode&quot;:&quot;***&quot;,&quot;metricKey&quot;:&quot;***&quot;,&quot;regionId&quot;:&quot;***&quot;,&quot;label&quot;:&quot;***&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("MetricDimensions")
        public java.util.Map<String, String> metricDimensions;

        /**
         * <p>The <a href="https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs">monitored metric</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Usage</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the CloudMonitor monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_quotas_flowcontrol</p>
         */
        @NameInMap("MetricNamespace")
        public String metricNamespace;

        public static ListQuotaUtilizationReportResponseBodyQuotasUsageMetric build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaUtilizationReportResponseBodyQuotasUsageMetric self = new ListQuotaUtilizationReportResponseBodyQuotasUsageMetric();
            return TeaModel.build(map, self);
        }

        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric setMetricDimensions(java.util.Map<String, String> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }
        public java.util.Map<String, String> getMetricDimensions() {
            return this.metricDimensions;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric setMetricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        public String getMetricNamespace() {
            return this.metricNamespace;
        }

    }

    public static class ListQuotaUtilizationReportResponseBodyQuotas extends TeaModel {
        /**
         * <p>Indicates whether the quota is adjustable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adjustable")
        public Boolean adjustable;

        /**
         * <p>Indicates whether the used quota is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Consumable")
        public Boolean consumable;

        /**
         * <p>The quota dimensions. Format: <code>{&quot;regionId&quot;:&quot;region ID&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, String> dimensions;

        /**
         * <p>The traffic throttling algorithms.</p>
         */
        @NameInMap("FlowControlAlgo")
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo flowControlAlgo;

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The quota ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The quota type.</p>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The quota description.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be owned by the current account.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalQuota")
        public Double totalQuota;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1009</p>
         */
        @NameInMap("TotalUsage")
        public Double totalUsage;

        /**
         * <p>The reason why the quota is not adjustable.</p>
         * 
         * <strong>example:</strong>
         * <p>applicationProcess</p>
         */
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        /**
         * <p>The monitoring information of the quota usage in CloudMonitor.</p>
         * <blockquote>
         * <p>An empty value indicates that no monitoring data for this quota exists in CloudMonitor.</p>
         * </blockquote>
         */
        @NameInMap("UsageMetric")
        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric usageMetric;

        /**
         * <p>The quota utilization rate, without the percentage sign.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1</p>
         */
        @NameInMap("Utilization")
        public Double utilization;

        /**
         * <p>The risk level determined by the returned Utilization value. Valid values:</p>
         * <ul>
         * <li>NORMAL: Less than 80%.</li>
         * <li>WARN: Greater than or equal to 80% and less than 95%.</li>
         * <li>CRITICAL: Greater than or equal to 95%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("UtilizationStatus")
        public String utilizationStatus;

        public static ListQuotaUtilizationReportResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaUtilizationReportResponseBodyQuotas self = new ListQuotaUtilizationReportResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setAdjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setConsumable(Boolean consumable) {
            this.consumable = consumable;
            return this;
        }
        public Boolean getConsumable() {
            return this.consumable;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setDimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setFlowControlAlgo(ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo flowControlAlgo) {
            this.flowControlAlgo = flowControlAlgo;
            return this;
        }
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo getFlowControlAlgo() {
            return this.flowControlAlgo;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setTotalQuota(Double totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Double getTotalQuota() {
            return this.totalQuota;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setTotalUsage(Double totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Double getTotalUsage() {
            return this.totalUsage;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setUnadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = unadjustableDetail;
            return this;
        }
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setUsageMetric(ListQuotaUtilizationReportResponseBodyQuotasUsageMetric usageMetric) {
            this.usageMetric = usageMetric;
            return this;
        }
        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric getUsageMetric() {
            return this.usageMetric;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setUtilization(Double utilization) {
            this.utilization = utilization;
            return this;
        }
        public Double getUtilization() {
            return this.utilization;
        }

        public ListQuotaUtilizationReportResponseBodyQuotas setUtilizationStatus(String utilizationStatus) {
            this.utilizationStatus = utilizationStatus;
            return this;
        }
        public String getUtilizationStatus() {
            return this.utilizationStatus;
        }

    }

}
