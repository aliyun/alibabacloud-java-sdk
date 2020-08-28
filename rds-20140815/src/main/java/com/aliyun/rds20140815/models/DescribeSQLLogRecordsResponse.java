// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Long totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLLogRecordsResponseItems items;

    public static DescribeSQLLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponse self = new DescribeSQLLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSQLLogRecordsResponseItemsSQLRecord extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("HostAddress")
        @Validation(required = true)
        public String hostAddress;

        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("TotalExecutionTimes")
        @Validation(required = true)
        public Long totalExecutionTimes;

        @NameInMap("ReturnRowCounts")
        @Validation(required = true)
        public Long returnRowCounts;

        @NameInMap("ExecuteTime")
        @Validation(required = true)
        public String executeTime;

        @NameInMap("ThreadID")
        @Validation(required = true)
        public String threadID;

        public static DescribeSQLLogRecordsResponseItemsSQLRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseItemsSQLRecord self = new DescribeSQLLogRecordsResponseItemsSQLRecord();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogRecordsResponseItems extends TeaModel {
        @NameInMap("SQLRecord")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogRecordsResponseItemsSQLRecord> SQLRecord;

        public static DescribeSQLLogRecordsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogRecordsResponseItems self = new DescribeSQLLogRecordsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
