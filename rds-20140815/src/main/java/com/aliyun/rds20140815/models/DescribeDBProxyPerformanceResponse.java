// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PerformanceKeys")
    @Validation(required = true)
    public DescribeDBProxyPerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBProxyPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceResponse self = new DescribeDBProxyPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("ValueFormat")
        @Validation(required = true)
        public String valueFormat;

        public static DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey self = new DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        @Validation(required = true)
        public java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBProxyPerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeys self = new DescribeDBProxyPerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

    }

}
