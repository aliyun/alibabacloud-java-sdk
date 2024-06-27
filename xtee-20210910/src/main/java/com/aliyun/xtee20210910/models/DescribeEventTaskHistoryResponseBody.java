// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTaskHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeEventTaskHistoryResponseBodyResultObject> resultObject;

    public static DescribeEventTaskHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTaskHistoryResponseBody self = new DescribeEventTaskHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventTaskHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventTaskHistoryResponseBody setResultObject(java.util.List<DescribeEventTaskHistoryResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeEventTaskHistoryResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeEventTaskHistoryResponseBodyResultObject extends TeaModel {
        @NameInMap("taskCode")
        public String taskCode;

        @NameInMap("taskName")
        public String taskName;

        @NameInMap("taskStatus")
        public String taskStatus;

        @NameInMap("url")
        public String url;

        public static DescribeEventTaskHistoryResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventTaskHistoryResponseBodyResultObject self = new DescribeEventTaskHistoryResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventTaskHistoryResponseBodyResultObject setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public DescribeEventTaskHistoryResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeEventTaskHistoryResponseBodyResultObject setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeEventTaskHistoryResponseBodyResultObject setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
