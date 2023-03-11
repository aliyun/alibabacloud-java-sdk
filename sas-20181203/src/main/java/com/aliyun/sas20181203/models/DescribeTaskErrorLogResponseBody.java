// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTaskErrorLogResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the error logs.</p>
     */
    @NameInMap("Logs")
    public java.util.List<DescribeTaskErrorLogResponseBodyLogs> logs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTaskErrorLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskErrorLogResponseBody self = new DescribeTaskErrorLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskErrorLogResponseBody setLogs(java.util.List<DescribeTaskErrorLogResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribeTaskErrorLogResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribeTaskErrorLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTaskErrorLogResponseBodyLogs extends TeaModel {
        /**
         * <p>The text content of the log.</p>
         */
        @NameInMap("Text")
        public String text;

        public static DescribeTaskErrorLogResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskErrorLogResponseBodyLogs self = new DescribeTaskErrorLogResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeTaskErrorLogResponseBodyLogs setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
