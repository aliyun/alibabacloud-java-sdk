// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudProductFieldStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of cloud services.</p>
     */
    @NameInMap("GroupedFields")
    public DescribeCloudProductFieldStatisticsResponseBodyGroupedFields groupedFields;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>The statistics of the numbers of assets of different types. **MachineType** indicates the type of the assets. **Count** indicates the number of assets that belong to the type.</p>
         * <p>Valid values of **MachineType**:</p>
         * <br>
         * <p>*   **1**: a Server Load Balancer (SLB) instance</p>
         * <p>*   **2**: a Network Address Translation (NAT) gateway</p>
         * <p>*   **3**: an ApsaraDB RDS instance</p>
         * <p>*   **4**: an ApsaraDB for MongoDB instance</p>
         */
        @NameInMap("CategoryCount")
        public String categoryCount;

        /**
         * <p>The total number of cloud services that are protected by Security Center.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The number of cloud services that are at risk.</p>
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
