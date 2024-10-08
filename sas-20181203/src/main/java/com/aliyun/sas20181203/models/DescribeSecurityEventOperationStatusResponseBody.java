// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1683940A-E4AE-4473-8C40-F4075434B76B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the task that handles the alert events.</p>
     */
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
        /**
         * <p>The code that indicates the handling result of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore.Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>12321</p>
         */
        @NameInMap("SecurityEventId")
        public String securityEventId;

        /**
         * <p>The handling status of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong>: The alert event is being handled.</li>
         * <li><strong>Success</strong>: The alert event is handled.</li>
         * <li><strong>Failed</strong>: The alert event failed to be handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
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
        /**
         * <p>An array consisting of the status of the alert events handled by the task.</p>
         */
        @NameInMap("SecurityEventOperationStatuses")
        public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses;

        /**
         * <p>The status of the task that handles the alert events. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong>: The task is running.</li>
         * <li><strong>Success</strong>: The task is successful.</li>
         * <li><strong>Failure</strong>: The task failed.</li>
         * <li><strong>Pending</strong>: The task is pending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
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
