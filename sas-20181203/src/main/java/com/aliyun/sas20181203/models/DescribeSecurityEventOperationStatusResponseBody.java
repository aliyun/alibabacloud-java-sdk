// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the task that handles the alert events.
    @NameInMap("SecurityEventOperationStatusResponse")
    public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse securityEventOperationStatusResponse;

    public static DescribeSecurityEventOperationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusResponseBody self = new DescribeSecurityEventOperationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationStatusResponseBody setSecurityEventOperationStatusResponse(DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse securityEventOperationStatusResponse) {
        this.securityEventOperationStatusResponse = securityEventOperationStatusResponse;
        return this;
    }
    public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse getSecurityEventOperationStatusResponse() {
        return this.securityEventOperationStatusResponse;
    }

    public static class DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses extends TeaModel {
        // The code that indicates the handling result of the alert event.
        @NameInMap("ErrorCode")
        public String errorCode;

        // The ID of the alert event.
        @NameInMap("SecurityEventId")
        public String securityEventId;

        // The handling status of the alert event. Valid values:
        // 
        // *   **Processing**: The alert event is being handled.
        // *   **Success**: The alert event is handled.
        // *   **Failed**: The alert event failed to be handled.
        @NameInMap("Status")
        public String status;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setSecurityEventId(String securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public String getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse extends TeaModel {
        // An array consisting of the status of the alert events handled by the task.
        @NameInMap("SecurityEventOperationStatuses")
        public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses;

        // The status of the task that handles the alert events. Valid values:
        // 
        // *   **Processing**: The task is running.
        // *   **Success**: The task is successful.
        // *   **Failure**: The task failed.
        // *   **Pending**: The task is pending.
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse setSecurityEventOperationStatuses(java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses) {
            this.securityEventOperationStatuses = securityEventOperationStatuses;
            return this;
        }
        public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
            return this.securityEventOperationStatuses;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
