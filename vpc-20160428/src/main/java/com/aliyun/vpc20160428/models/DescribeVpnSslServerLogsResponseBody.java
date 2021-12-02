// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public DescribeVpnSslServerLogsResponseBodyData data;

    @NameInMap("IsCompleted")
    public Boolean isCompleted;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpnSslServerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsResponseBody self = new DescribeVpnSslServerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnSslServerLogsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVpnSslServerLogsResponseBody setData(DescribeVpnSslServerLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVpnSslServerLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeVpnSslServerLogsResponseBody setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public DescribeVpnSslServerLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnSslServerLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnSslServerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpnSslServerLogsResponseBodyData extends TeaModel {
        @NameInMap("Logs")
        public java.util.List<String> logs;

        public static DescribeVpnSslServerLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnSslServerLogsResponseBodyData self = new DescribeVpnSslServerLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnSslServerLogsResponseBodyData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

    }

}
