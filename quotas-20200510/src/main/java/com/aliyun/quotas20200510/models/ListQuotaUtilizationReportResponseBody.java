// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaUtilizationReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>RAM.PERMISSION.DENIED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>2026-10-26T06:24:57Z</p>
     */
    @NameInMap("GeneratedAt")
    public String generatedAt;

    /**
     * <strong>example:</strong>
     * <p>Quota utilization data is available.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Quotas")
    public java.util.List<ListQuotaUtilizationReportResponseBodyQuotas> quotas;

    /**
     * <strong>example:</strong>
     * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>second</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
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
         * <strong>example:</strong>
         * <p>FixedWindow</p>
         */
        @NameInMap("AlgoType")
        public String algoType;

        @NameInMap("Period")
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgoPeriod period;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefillInterval")
        public Integer refillInterval;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TokensPerRefill")
        public Integer tokensPerRefill;

        /**
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
        @NameInMap("MetricDimensions")
        public java.util.Map<String, String> metricDimensions;

        /**
         * <strong>example:</strong>
         * <p>Usage</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adjustable")
        public Boolean adjustable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Consumable")
        public Boolean consumable;

        @NameInMap("Dimensions")
        public java.util.Map<String, String> dimensions;

        @NameInMap("FlowControlAlgo")
        public ListQuotaUtilizationReportResponseBodyQuotasFlowControlAlgo flowControlAlgo;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be owned by the current account.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalQuota")
        public Double totalQuota;

        /**
         * <strong>example:</strong>
         * <p>1009</p>
         */
        @NameInMap("TotalUsage")
        public Double totalUsage;

        /**
         * <strong>example:</strong>
         * <p>applicationProcess</p>
         */
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        @NameInMap("UsageMetric")
        public ListQuotaUtilizationReportResponseBodyQuotasUsageMetric usageMetric;

        /**
         * <strong>example:</strong>
         * <p>10.1</p>
         */
        @NameInMap("Utilization")
        public Double utilization;

        /**
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
