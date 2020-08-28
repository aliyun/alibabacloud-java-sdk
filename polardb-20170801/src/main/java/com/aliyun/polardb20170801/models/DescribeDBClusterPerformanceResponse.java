// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DBType")
    @Validation(required = true)
    public String DBType;

    @NameInMap("DBVersion")
    @Validation(required = true)
    public String DBVersion;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PerformanceKeys")
    @Validation(required = true)
    public DescribeDBClusterPerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBClusterPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponse self = new DescribeDBClusterPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        public static DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPoints self = new DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItem extends TeaModel {
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        @NameInMap("Measurement")
        @Validation(required = true)
        public String measurement;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Points")
        @Validation(required = true)
        public DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItemPoints points;

        public static DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItem self = new DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterPerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterPerformanceResponsePerformanceKeysPerformanceItem> performanceItem;

        public static DescribeDBClusterPerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformanceKeys self = new DescribeDBClusterPerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

    }

}
