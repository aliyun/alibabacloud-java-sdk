// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeElasticBillsResponseBody extends TeaModel {
    /**
     * <p>The list of bills for the on-demand WAF instance.</p>
     */
    @NameInMap("Bills")
    public java.util.List<DescribeElasticBillsResponseBodyBills> bills;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FBF08CB-8691-5B65-BBF8-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeElasticBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBillsResponseBody self = new DescribeElasticBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBillsResponseBody setBills(java.util.List<DescribeElasticBillsResponseBodyBills> bills) {
        this.bills = bills;
        return this;
    }
    public java.util.List<DescribeElasticBillsResponseBodyBills> getBills() {
        return this.bills;
    }

    public DescribeElasticBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticBillsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeElasticBillsResponseBodyBills extends TeaModel {
        /**
         * <p>The total number of SCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Cu")
        public Double cu;

        /**
         * <p>The end time of the bill. This value is a UNIX timestamp that is in UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717084800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of SCUs consumed by WAF features.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FunctionCu")
        public Double functionCu;

        /**
         * <p>The start time of the bill. This value is a UNIX timestamp that is in UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665484616000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The number of security capacity units (SCUs) consumed by traffic processing.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TrafficCu")
        public Double trafficCu;

        public static DescribeElasticBillsResponseBodyBills build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticBillsResponseBodyBills self = new DescribeElasticBillsResponseBodyBills();
            return TeaModel.build(map, self);
        }

        public DescribeElasticBillsResponseBodyBills setCu(Double cu) {
            this.cu = cu;
            return this;
        }
        public Double getCu() {
            return this.cu;
        }

        public DescribeElasticBillsResponseBodyBills setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeElasticBillsResponseBodyBills setFunctionCu(Double functionCu) {
            this.functionCu = functionCu;
            return this;
        }
        public Double getFunctionCu() {
            return this.functionCu;
        }

        public DescribeElasticBillsResponseBodyBills setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeElasticBillsResponseBodyBills setTrafficCu(Double trafficCu) {
            this.trafficCu = trafficCu;
            return this;
        }
        public Double getTrafficCu() {
            return this.trafficCu;
        }

    }

}
