// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the job.</p>
     */
    @NameInMap("Data")
    public CreateJobResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the job is created. Valid values:</p>
     * <br>
     * <p>*   **true**: The job is created.</p>
     * <p>*   **false**: Failed to create the job.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobResponseBody self = new CreateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateJobResponseBody setData(CreateJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateJobResponseBodyData getData() {
        return this.data;
    }

    public CreateJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateJobResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        public static CreateJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateJobResponseBodyData self = new CreateJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

    }

}
