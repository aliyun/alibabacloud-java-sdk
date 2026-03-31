// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePrepayDailyBillsResponseBody extends TeaModel {
    /**
     * <p>The bills of the burstable QPS (pay-as-you-go) feature.</p>
     */
    @NameInMap("Bills")
    public java.util.List<DescribePrepayDailyBillsResponseBodyBills> bills;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC10C9EA-A367-52D5-<em><strong>-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The burstable QPS of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ElasticQpsSetValue")
        public Long elasticQpsSetValue;

        /**
         * <p>The billing end time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1687591200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The status of QPS usage within the current period of time. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: normal.</li>
         * <li><strong>1</strong>: excess.</li>
         * <li><strong>2</strong>: sandbox.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExceedStatus")
        public Integer exceedStatus;

        /**
         * <p>The peak QPS within the current period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <p>The unit price in the bill. The price is measured in CNY for bills at the China site (aliyun.com) and in USD for bills at the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Price")
        public Float price;

        /**
         * <p>The extended QPS of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The default QPS of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QpsVersion")
        public Long qpsVersion;

        /**
         * <p>Indicates whether risk identification is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RiskControl")
        public Boolean riskControl;

        /**
         * <p>The number of times that risk identification is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RiskTraffic")
        public Long riskTraffic;

        /**
         * <p>The billing start time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1687822980</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The actual QPS in total.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The billing types.</p>
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
