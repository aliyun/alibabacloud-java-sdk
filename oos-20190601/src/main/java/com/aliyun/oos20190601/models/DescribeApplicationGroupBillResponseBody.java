// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupBillResponseBody extends TeaModel {
    @NameInMap("ApplicationGroupConsume")
    public java.util.List<DescribeApplicationGroupBillResponseBodyApplicationGroupConsume> applicationGroupConsume;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationGroupBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationGroupBillResponseBody self = new DescribeApplicationGroupBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationGroupBillResponseBody setApplicationGroupConsume(java.util.List<DescribeApplicationGroupBillResponseBodyApplicationGroupConsume> applicationGroupConsume) {
        this.applicationGroupConsume = applicationGroupConsume;
        return this;
    }
    public java.util.List<DescribeApplicationGroupBillResponseBodyApplicationGroupConsume> getApplicationGroupConsume() {
        return this.applicationGroupConsume;
    }

    public DescribeApplicationGroupBillResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeApplicationGroupBillResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeApplicationGroupBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApplicationGroupBillResponseBodyApplicationGroupConsume extends TeaModel {
        @NameInMap("Amount")
        public Float amount;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Optimization")
        public String optimization;

        @NameInMap("PeakType")
        public String peakType;

        @NameInMap("Performance")
        public String performance;

        @NameInMap("Status")
        public String status;

        public static DescribeApplicationGroupBillResponseBodyApplicationGroupConsume build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationGroupBillResponseBodyApplicationGroupConsume self = new DescribeApplicationGroupBillResponseBodyApplicationGroupConsume();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setOptimization(String optimization) {
            this.optimization = optimization;
            return this;
        }
        public String getOptimization() {
            return this.optimization;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setPeakType(String peakType) {
            this.peakType = peakType;
            return this;
        }
        public String getPeakType() {
            return this.peakType;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setPerformance(String performance) {
            this.performance = performance;
            return this;
        }
        public String getPerformance() {
            return this.performance;
        }

        public DescribeApplicationGroupBillResponseBodyApplicationGroupConsume setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
