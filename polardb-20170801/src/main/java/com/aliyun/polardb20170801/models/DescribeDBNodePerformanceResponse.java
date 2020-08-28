// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBNodeId")
    @Validation(required = true)
    public String DBNodeId;

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
    public DescribeDBNodePerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBNodePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceResponse self = new DescribeDBNodePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        public static DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        @Validation(required = true)
        public java.util.List<DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPoints self = new DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItem extends TeaModel {
        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Measurement")
        @Validation(required = true)
        public String measurement;

        @NameInMap("Points")
        @Validation(required = true)
        public DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItemPoints points;

        public static DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItem self = new DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBNodePerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        @Validation(required = true)
        public java.util.List<DescribeDBNodePerformanceResponsePerformanceKeysPerformanceItem> performanceItem;

        public static DescribeDBNodePerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponsePerformanceKeys self = new DescribeDBNodePerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

    }

}
