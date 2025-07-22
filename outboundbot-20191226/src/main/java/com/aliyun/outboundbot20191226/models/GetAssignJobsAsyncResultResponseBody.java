// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAssignJobsAsyncResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>d3550dd1-360d-4fe5-b4b2-667a4a664dab</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobsId")
    public java.util.List<String> jobsId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Timeout")
    public Boolean timeout;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Valid")
    public Boolean valid;

    public static GetAssignJobsAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssignJobsAsyncResultResponseBody self = new GetAssignJobsAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssignJobsAsyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAssignJobsAsyncResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssignJobsAsyncResultResponseBody setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public GetAssignJobsAsyncResultResponseBody setJobsId(java.util.List<String> jobsId) {
        this.jobsId = jobsId;
        return this;
    }
    public java.util.List<String> getJobsId() {
        return this.jobsId;
    }

    public GetAssignJobsAsyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAssignJobsAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssignJobsAsyncResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAssignJobsAsyncResultResponseBody setTimeout(Boolean timeout) {
        this.timeout = timeout;
        return this;
    }
    public Boolean getTimeout() {
        return this.timeout;
    }

    public GetAssignJobsAsyncResultResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}
