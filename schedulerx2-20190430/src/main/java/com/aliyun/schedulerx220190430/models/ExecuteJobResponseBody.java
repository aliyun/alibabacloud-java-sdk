// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the job instance that is returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public ExecuteJobResponseBodyData data;

    /**
     * <p>The error message that is returned if an error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call is successful.</p>
     * <p>*   `false`: The call fails.</p>
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
         * <p>The ID of the job instance.</p>
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
