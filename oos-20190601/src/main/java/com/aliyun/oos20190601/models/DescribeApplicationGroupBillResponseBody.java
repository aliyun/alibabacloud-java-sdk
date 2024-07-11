// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupBillResponseBody extends TeaModel {
    /**
     * <p>The consume of application group.</p>
     */
    @NameInMap("ApplicationGroupConsume")
    public java.util.List<DescribeApplicationGroupBillResponseBodyApplicationGroupConsume> applicationGroupConsume;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E897A1AB-4701-5B71-93AD-38FD703763A3</p>
     */
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
        /**
         * <p>The amount consumed by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>18.88</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-10T06:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-0jl781czrhqey0s5zpsj</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::INSTANCE</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Optimization suggestions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Optimization")
        public String optimization;

        /**
         * <p>The peak type.</p>
         * 
         * <strong>example:</strong>
         * <p>WHITE</p>
         */
        @NameInMap("PeakType")
        public String peakType;

        /**
         * <p>The performance of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;mem\&quot;:\&quot;6.82\&quot;,\&quot;cpu\&quot;:\&quot;0.55\&quot;}&quot;</p>
         */
        @NameInMap("Performance")
        public String performance;

        /**
         * <p>The status of instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
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
