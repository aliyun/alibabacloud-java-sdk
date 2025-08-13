// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTaskHistoryResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
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
        /**
         * <p>Task code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_aoxcdy9473</p>
         */
        @NameInMap("taskCode")
        public String taskCode;

        /**
         * <p>Task name</p>
         * 
         * <strong>example:</strong>
         * <p>仿真任务</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        /**
         * <p>OSS download URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
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
