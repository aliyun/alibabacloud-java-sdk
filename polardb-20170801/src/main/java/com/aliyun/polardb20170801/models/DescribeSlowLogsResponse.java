// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

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
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        @NameInMap("ParseMaxRowCount")
        @Validation(required = true)
        public Long parseMaxRowCount;

        @NameInMap("TotalLockTimes")
        @Validation(required = true)
        public Long totalLockTimes;

        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("MaxExecutionTime")
        @Validation(required = true)
        public Long maxExecutionTime;

        @NameInMap("SQLHASH")
        @Validation(required = true)
        public String SQLHASH;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("TotalExecutionTimes")
        @Validation(required = true)
        public Long totalExecutionTimes;

        @NameInMap("ReturnTotalRowCounts")
        @Validation(required = true)
        public Long returnTotalRowCounts;

        @NameInMap("TotalExecutionCounts")
        @Validation(required = true)
        public Long totalExecutionCounts;

        @NameInMap("MaxLockTime")
        @Validation(required = true)
        public Long maxLockTime;

        @NameInMap("ReturnMaxRowCount")
        @Validation(required = true)
        public Long returnMaxRowCount;

        @NameInMap("ParseTotalRowCounts")
        @Validation(required = true)
        public Long parseTotalRowCounts;

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
