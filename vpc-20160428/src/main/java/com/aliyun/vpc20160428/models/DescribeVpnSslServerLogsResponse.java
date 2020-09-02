// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Count")
    @Validation(required = true)
    public Integer count;

    @NameInMap("IsCompleted")
    @Validation(required = true)
    public Boolean isCompleted;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVpnSslServerLogsResponseData data;

    public static DescribeVpnSslServerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsResponse self = new DescribeVpnSslServerLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnSslServerLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnSslServerLogsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVpnSslServerLogsResponse setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public DescribeVpnSslServerLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnSslServerLogsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnSslServerLogsResponse setData(DescribeVpnSslServerLogsResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeVpnSslServerLogsResponseData getData() {
        return this.data;
    }

    public static class DescribeVpnSslServerLogsResponseData extends TeaModel {
        @NameInMap("Logs")
        @Validation(required = true)
        public java.util.List<String> logs;

        public static DescribeVpnSslServerLogsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnSslServerLogsResponseData self = new DescribeVpnSslServerLogsResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnSslServerLogsResponseData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

    }

}
