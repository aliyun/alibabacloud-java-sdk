// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionLogsResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The log list.</p>
     */
    @NameInMap("Data")
    public DescribeVpnConnectionLogsResponseBodyData data;

    /**
     * <p>Indicates whether the log is accurate. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsCompleted")
    public Boolean isCompleted;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpnConnectionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionLogsResponseBody self = new DescribeVpnConnectionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionLogsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVpnConnectionLogsResponseBody setData(DescribeVpnConnectionLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVpnConnectionLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeVpnConnectionLogsResponseBody setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public DescribeVpnConnectionLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnConnectionLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnConnectionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpnConnectionLogsResponseBodyData extends TeaModel {
        @NameInMap("Logs")
        public java.util.List<String> logs;

        public static DescribeVpnConnectionLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionLogsResponseBodyData self = new DescribeVpnConnectionLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnConnectionLogsResponseBodyData setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

    }

}
