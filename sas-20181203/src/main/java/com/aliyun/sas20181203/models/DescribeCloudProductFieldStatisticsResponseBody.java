// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudProductFieldStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of cloud services that are protected by Security Center.</p>
     */
    @NameInMap("GroupedFields")
    public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields groupedFields;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudProductFieldStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudProductFieldStatisticsResponseBody self = new DescribeCloudProductFieldStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudProductFieldStatisticsResponseBody setGroupedFields(DescribeCloudProductFieldStatisticsResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public DescribeCloudProductFieldStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudProductFieldStatisticsResponseBodyGroupedFields extends TeaModel {
        /**
         * <p>The statistics of different types of assets. <strong>MachineType</strong> indicates the type of the asset. <strong>Count</strong> indicates the number of assets of a specific type.</p>
         * <p>Valid values of <strong>MachineType</strong>:</p>
         * <ul>
         * <li><strong>1</strong>: Server Load Balancer (SLB) instance</li>
         * <li><strong>2</strong>: NAT gateway instance</li>
         * <li><strong>3</strong>: ApsaraDB RDS instance</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MachineType&quot;:1,&quot;Count&quot;:11}]</p>
         */
        @NameInMap("CategoryCount")
        public String categoryCount;

        /**
         * <p>The total number of cloud services that are protected by Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The number of cloud services that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        public static DescribeCloudProductFieldStatisticsResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudProductFieldStatisticsResponseBodyGroupedFields self = new DescribeCloudProductFieldStatisticsResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setCategoryCount(String categoryCount) {
            this.categoryCount = categoryCount;
            return this;
        }
        public String getCategoryCount() {
            return this.categoryCount;
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

    }

}
