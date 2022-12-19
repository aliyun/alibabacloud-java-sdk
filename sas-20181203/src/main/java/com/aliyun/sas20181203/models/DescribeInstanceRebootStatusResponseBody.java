// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    // An array that consists of the status information about the servers that you restart.
    @NameInMap("RebootStatuses")
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
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
        // The error code that is returned when the server failed to be restarted. Valid values:
        // 
        // *   **10001**: The restart command failed to be sent.
        // *   **10002**: The restart operation failed.
        // *   **10003**: A timeout error occurs.
        @NameInMap("Code")
        public String code;

        // The message that is returned when the server failed to be restarted.
        @NameInMap("Msg")
        public String msg;

        // The status of the server. Valid values:
        // 
        // *   **0**: The server is being restarted.
        // *   **1**: The server is restarted.
        // *   **2**: The server failed to be restarted.
        @NameInMap("RebootStatus")
        public Integer rebootStatus;

        // The UUID of the server.
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
