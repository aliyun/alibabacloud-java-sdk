// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePrepayDailyBillsResponseBody extends TeaModel {
    /**
     * <p>List of WAF burstable billing records.</p>
     */
    @NameInMap("Bills")
    public java.util.List<DescribePrepayDailyBillsResponseBodyBills> bills;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC10C9EA-A367-52D5-<em><strong>-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePrepayDailyBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrepayDailyBillsResponseBody self = new DescribePrepayDailyBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrepayDailyBillsResponseBody setBills(java.util.List<DescribePrepayDailyBillsResponseBodyBills> bills) {
        this.bills = bills;
        return this;
    }
    public java.util.List<DescribePrepayDailyBillsResponseBodyBills> getBills() {
        return this.bills;
    }

    public DescribePrepayDailyBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrepayDailyBillsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePrepayDailyBillsResponseBodyBills extends TeaModel {
        /**
         * <p>Elastic QPS specification for the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ElasticQpsSetValue")
        public Long elasticQpsSetValue;

        /**
         * <p>End time of the billing period, in Unix timestamp format (UTC), measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687591200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Overuse status for the current period. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Normal.</p>
         * </li>
         * <li><p><strong>1</strong>: Overused.</p>
         * </li>
         * <li><p><strong>2</strong>: Sandbox.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExceedStatus")
        public Integer exceedStatus;

        /**
         * <p>Maximum QPS for the current period.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <p>Unit price for burstable charges. Unit: CNY for the Alibaba Cloud China Website (www\.aliyun.com) and USD for the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Price")
        public Float price;

        /**
         * <p>QPS extension specification for the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>QPS specification within the version of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QpsVersion")
        public Long qpsVersion;

        /**
         * <p>Whether Fraud Detection is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Fraud Detection is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Fraud Detection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RiskControl")
        public Boolean riskControl;

        /**
         * <p>Number of Fraud Detection requests processed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RiskTraffic")
        public Long riskTraffic;

        /**
         * <p>Start time of the billing period, in Unix timestamp format (UTC), measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687822980</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Total QPS subject to burstable billing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The billing type.</p>
         */
        @NameInMap("Type")
        public java.util.List<String> type;

        public static DescribePrepayDailyBillsResponseBodyBills build(java.util.Map<String, ?> map) throws Exception {
            DescribePrepayDailyBillsResponseBodyBills self = new DescribePrepayDailyBillsResponseBodyBills();
            return TeaModel.build(map, self);
        }

        public DescribePrepayDailyBillsResponseBodyBills setElasticQpsSetValue(Long elasticQpsSetValue) {
            this.elasticQpsSetValue = elasticQpsSetValue;
            return this;
        }
        public Long getElasticQpsSetValue() {
            return this.elasticQpsSetValue;
        }

        public DescribePrepayDailyBillsResponseBodyBills setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePrepayDailyBillsResponseBodyBills setExceedStatus(Integer exceedStatus) {
            this.exceedStatus = exceedStatus;
            return this;
        }
        public Integer getExceedStatus() {
            return this.exceedStatus;
        }

        public DescribePrepayDailyBillsResponseBodyBills setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribePrepayDailyBillsResponseBodyBills setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public DescribePrepayDailyBillsResponseBodyBills setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public DescribePrepayDailyBillsResponseBodyBills setQpsVersion(Long qpsVersion) {
            this.qpsVersion = qpsVersion;
            return this;
        }
        public Long getQpsVersion() {
            return this.qpsVersion;
        }

        public DescribePrepayDailyBillsResponseBodyBills setRiskControl(Boolean riskControl) {
            this.riskControl = riskControl;
            return this;
        }
        public Boolean getRiskControl() {
            return this.riskControl;
        }

        public DescribePrepayDailyBillsResponseBodyBills setRiskTraffic(Long riskTraffic) {
            this.riskTraffic = riskTraffic;
            return this;
        }
        public Long getRiskTraffic() {
            return this.riskTraffic;
        }

        public DescribePrepayDailyBillsResponseBodyBills setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePrepayDailyBillsResponseBodyBills setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribePrepayDailyBillsResponseBodyBills setType(java.util.List<String> type) {
            this.type = type;
            return this;
        }
        public java.util.List<String> getType() {
            return this.type;
        }

    }

}
