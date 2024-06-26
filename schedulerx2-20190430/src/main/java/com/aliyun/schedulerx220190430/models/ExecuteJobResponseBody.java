// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the job instance that is returned if the request is successful.</p>
     */
    @NameInMap("Data")
    public ExecuteJobResponseBodyData data;

    /**
     * <p>The error message that is returned only if the corresponding error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>groupid not exist groupId: testSchedulerx.defaultGroup namespace: adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExecuteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteJobResponseBody self = new ExecuteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteJobResponseBody setData(ExecuteJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteJobResponseBodyData getData() {
        return this.data;
    }

    public ExecuteJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteJobResponseBodyData extends TeaModel {
        /**
         * <p>The job instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        @NameInMap("JobInstanceId")
        public Long jobInstanceId;

        public static ExecuteJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteJobResponseBodyData self = new ExecuteJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteJobResponseBodyData setJobInstanceId(Long jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public Long getJobInstanceId() {
            return this.jobInstanceId;
        }

    }

}
