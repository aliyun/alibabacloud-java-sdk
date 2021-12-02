// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEventMonitorListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeEventMonitorListResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEventMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventMonitorListResponseBody self = new DescribeEventMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventMonitorListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEventMonitorListResponseBody setData(java.util.List<DescribeEventMonitorListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEventMonitorListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEventMonitorListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeEventMonitorListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventMonitorListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventMonitorListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventMonitorListResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("NameSpace")
        public String nameSpace;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Reason")
        public String reason;

        public static DescribeEventMonitorListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventMonitorListResponseBodyData self = new DescribeEventMonitorListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEventMonitorListResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeEventMonitorListResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeEventMonitorListResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeEventMonitorListResponseBodyData setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeEventMonitorListResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEventMonitorListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeEventMonitorListResponseBodyData setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public DescribeEventMonitorListResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public DescribeEventMonitorListResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
