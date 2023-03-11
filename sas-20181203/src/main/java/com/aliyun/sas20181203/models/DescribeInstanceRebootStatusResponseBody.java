// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the status information about the servers that you restart.</p>
     */
    @NameInMap("RebootStatuses")
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceRebootStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRebootStatusResponseBody self = new DescribeInstanceRebootStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRebootStatusResponseBody setRebootStatuses(java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses) {
        this.rebootStatuses = rebootStatuses;
        return this;
    }
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> getRebootStatuses() {
        return this.rebootStatuses;
    }

    public DescribeInstanceRebootStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRebootStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceRebootStatusResponseBodyRebootStatuses extends TeaModel {
        /**
         * <p>The error code that is returned when the server failed to be restarted. Valid values:</p>
         * <br>
         * <p>*   **10001**: The restart command failed to be sent.</p>
         * <p>*   **10002**: The restart operation failed.</p>
         * <p>*   **10003**: A timeout error occurs.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The message that is returned when the server failed to be restarted.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The status of the server. Valid values:</p>
         * <br>
         * <p>*   **0**: The server is being restarted.</p>
         * <p>*   **1**: The server is restarted.</p>
         * <p>*   **2**: The server failed to be restarted.</p>
         */
        @NameInMap("RebootStatus")
        public Integer rebootStatus;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeInstanceRebootStatusResponseBodyRebootStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRebootStatusResponseBodyRebootStatuses self = new DescribeInstanceRebootStatusResponseBodyRebootStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setRebootStatus(Integer rebootStatus) {
            this.rebootStatus = rebootStatus;
            return this;
        }
        public Integer getRebootStatus() {
            return this.rebootStatus;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
