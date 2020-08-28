// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

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
    public DescribeSlowLogRecordsResponseItems items;

    public static DescribeSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponse self = new DescribeSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSlowLogRecordsResponseItemsSQLSlowRecord extends TeaModel {
        @NameInMap("HostAddress")
        @Validation(required = true)
        public String hostAddress;

        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("QueryTimes")
        @Validation(required = true)
        public Long queryTimes;

        @NameInMap("LockTimes")
        @Validation(required = true)
        public Long lockTimes;

        @NameInMap("ParseRowCounts")
        @Validation(required = true)
        public Long parseRowCounts;

        @NameInMap("ReturnRowCounts")
        @Validation(required = true)
        public Long returnRowCounts;

        @NameInMap("ExecutionStartTime")
        @Validation(required = true)
        public String executionStartTime;

        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        public static DescribeSlowLogRecordsResponseItemsSQLSlowRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseItemsSQLSlowRecord self = new DescribeSlowLogRecordsResponseItemsSQLSlowRecord();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSlowLogRecordsResponseItems extends TeaModel {
        @NameInMap("SQLSlowRecord")
        @Validation(required = true)
        public java.util.List<DescribeSlowLogRecordsResponseItemsSQLSlowRecord> SQLSlowRecord;

        public static DescribeSlowLogRecordsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseItems self = new DescribeSlowLogRecordsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
