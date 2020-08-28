// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public DescribeErrorLogsResponseItems items;

    public static DescribeErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponse self = new DescribeErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeErrorLogsResponseItemsErrorLog extends TeaModel {
        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeErrorLogsResponseItemsErrorLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseItemsErrorLog self = new DescribeErrorLogsResponseItemsErrorLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeErrorLogsResponseItems extends TeaModel {
        @NameInMap("ErrorLog")
        @Validation(required = true)
        public java.util.List<DescribeErrorLogsResponseItemsErrorLog> errorLog;

        public static DescribeErrorLogsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogsResponseItems self = new DescribeErrorLogsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
