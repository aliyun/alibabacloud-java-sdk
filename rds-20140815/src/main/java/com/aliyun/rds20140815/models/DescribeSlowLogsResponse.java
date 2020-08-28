// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponse extends TeaModel {
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

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSlowLogsResponseItems items;

    public static DescribeSlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponse self = new DescribeSlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSlowLogsResponseItemsSQLSlowLog extends TeaModel {
        @NameInMap("SlowLogId")
        @Validation(required = true)
        public Long slowLogId;

        @NameInMap("SQLHASH")
        @Validation(required = true)
        public String SQLHASH;

        @NameInMap("SQLIdStr")
        @Validation(required = true)
        public String SQLIdStr;

        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("MySQLTotalExecutionCounts")
        @Validation(required = true)
        public Long mySQLTotalExecutionCounts;

        @NameInMap("MySQLTotalExecutionTimes")
        @Validation(required = true)
        public Long mySQLTotalExecutionTimes;

        @NameInMap("TotalLockTimes")
        @Validation(required = true)
        public Long totalLockTimes;

        @NameInMap("MaxLockTime")
        @Validation(required = true)
        public Long maxLockTime;

        @NameInMap("ParseTotalRowCounts")
        @Validation(required = true)
        public Long parseTotalRowCounts;

        @NameInMap("ParseMaxRowCount")
        @Validation(required = true)
        public Long parseMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        @Validation(required = true)
        public Long returnTotalRowCounts;

        @NameInMap("ReturnMaxRowCount")
        @Validation(required = true)
        public Long returnMaxRowCount;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("SQLServerTotalExecutionCounts")
        @Validation(required = true)
        public Long SQLServerTotalExecutionCounts;

        @NameInMap("SQLServerTotalExecutionTimes")
        @Validation(required = true)
        public Long SQLServerTotalExecutionTimes;

        @NameInMap("TotalLogicalReadCounts")
        @Validation(required = true)
        public Long totalLogicalReadCounts;

        @NameInMap("TotalPhysicalReadCounts")
        @Validation(required = true)
        public Long totalPhysicalReadCounts;

        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("MaxExecutionTime")
        @Validation(required = true)
        public Long maxExecutionTime;

        @NameInMap("AvgExecutionTime")
        @Validation(required = true)
        public Long avgExecutionTime;

        public static DescribeSlowLogsResponseItemsSQLSlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseItemsSQLSlowLog self = new DescribeSlowLogsResponseItemsSQLSlowLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSlowLogsResponseItems extends TeaModel {
        @NameInMap("SQLSlowLog")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogsResponseItemsSQLSlowLog> SQLSlowLog;

        public static DescribeSlowLogsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogsResponseItems self = new DescribeSlowLogsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
