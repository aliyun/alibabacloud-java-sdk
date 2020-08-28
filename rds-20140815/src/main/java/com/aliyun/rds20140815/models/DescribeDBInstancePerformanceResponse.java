// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PerformanceKeys")
    @Validation(required = true)
    public DescribeDBInstancePerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBInstancePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponse self = new DescribeDBInstancePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("ValueFormat")
        @Validation(required = true)
        public String valueFormat;

        public static DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey self = new DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBInstancePerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeys self = new DescribeDBInstancePerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

    }

}
