// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <p>Total amount of data under the conditions of this request. This parameter is optional and does not need to be returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Details</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Job</p>
     */
    @NameInMap("Job")
    public Job job;

    /**
     * <p>Return message of the request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>90ABA848-AD74-1F6E-84BC-4182A7F1F29E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>is succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetJobResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetJobResponseBody setJob(Job job) {
        this.job = job;
        return this;
    }
    public Job getJob() {
        return this.job;
    }

    public GetJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
