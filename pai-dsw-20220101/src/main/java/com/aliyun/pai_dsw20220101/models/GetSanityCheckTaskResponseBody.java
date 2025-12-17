// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetSanityCheckTaskResponseBody extends TeaModel {
    @NameInMap("CheckDetails")
    public java.util.List<GetSanityCheckTaskResponseBodyCheckDetails> checkDetails;

    /**
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Issues")
    public java.util.List<String> issues;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>917479ff-c869-49ea-908e-ae85bd987bc0</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>44FB0869-AA85-599D-A09D-C42F7467618A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSanityCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSanityCheckTaskResponseBody self = new GetSanityCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSanityCheckTaskResponseBody setCheckDetails(java.util.List<GetSanityCheckTaskResponseBodyCheckDetails> checkDetails) {
        this.checkDetails = checkDetails;
        return this;
    }
    public java.util.List<GetSanityCheckTaskResponseBodyCheckDetails> getCheckDetails() {
        return this.checkDetails;
    }

    public GetSanityCheckTaskResponseBody setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public GetSanityCheckTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetSanityCheckTaskResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSanityCheckTaskResponseBody setIssues(java.util.List<String> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<String> getIssues() {
        return this.issues;
    }

    public GetSanityCheckTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetSanityCheckTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSanityCheckTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetSanityCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSanityCheckTaskResponseBodyCheckDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Check whether the security group allows traffic on port 22</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>secureGroupCheck</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Port 22 is blocked by the security group</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>passed</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetSanityCheckTaskResponseBodyCheckDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSanityCheckTaskResponseBodyCheckDetails self = new GetSanityCheckTaskResponseBodyCheckDetails();
            return TeaModel.build(map, self);
        }

        public GetSanityCheckTaskResponseBodyCheckDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSanityCheckTaskResponseBodyCheckDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSanityCheckTaskResponseBodyCheckDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSanityCheckTaskResponseBodyCheckDetails setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
