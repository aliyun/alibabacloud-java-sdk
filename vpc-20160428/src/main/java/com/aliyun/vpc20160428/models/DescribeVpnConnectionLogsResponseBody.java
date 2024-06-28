// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionLogsResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsCompleted")
    public Boolean isCompleted;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF161502-4959-5C3B-B499-09B87BA931D9</p>
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
