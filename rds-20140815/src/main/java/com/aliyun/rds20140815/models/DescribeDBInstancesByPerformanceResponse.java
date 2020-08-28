// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesByPerformanceResponseItems items;

    public static DescribeDBInstancesByPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceResponse self = new DescribeDBInstancesByPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance extends TeaModel {
        @NameInMap("CPUUsage")
        @Validation(required = true)
        public String CPUUsage;

        @NameInMap("IOPSUsage")
        @Validation(required = true)
        public String IOPSUsage;

        @NameInMap("DiskUsage")
        @Validation(required = true)
        public String diskUsage;

        @NameInMap("SessionUsage")
        @Validation(required = true)
        public String sessionUsage;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        public static DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance self = new DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBInstancesByPerformanceResponseItems extends TeaModel {
        @NameInMap("DBInstancePerformance")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance> DBInstancePerformance;

        public static DescribeDBInstancesByPerformanceResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseItems self = new DescribeDBInstancesByPerformanceResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
