// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("SecurityEventId")
        public String securityEventId;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setSecurityEventId(String securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public String getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse extends TeaModel {
        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("SecurityEventOperationStatuses")
        public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses;

        public static DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse self = new DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponse setSecurityEventOperationStatuses(java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> securityEventOperationStatuses) {
            this.securityEventOperationStatuses = securityEventOperationStatuses;
            return this;
        }
        public java.util.List<DescribeSecurityEventOperationStatusResponseBodySecurityEventOperationStatusResponseSecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
            return this.securityEventOperationStatuses;
        }

    }

}
