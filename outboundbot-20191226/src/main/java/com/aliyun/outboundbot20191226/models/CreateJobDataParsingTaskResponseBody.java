// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobDataParsingTaskResponseBody extends TeaModel {
    /**
     * <p>API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>ID of the uploaded job data parsing task.</p>
     * <blockquote>
     * <p>Use this value as the JobDataParsingTaskId parameter in DescribeJobDataParsingTaskProgress.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobDataParsingTaskId")
    public String jobDataParsingTaskId;

    /**
     * <p>API message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateJobDataParsingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobDataParsingTaskResponseBody self = new CreateJobDataParsingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobDataParsingTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateJobDataParsingTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateJobDataParsingTaskResponseBody setJobDataParsingTaskId(String jobDataParsingTaskId) {
        this.jobDataParsingTaskId = jobDataParsingTaskId;
        return this;
    }
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

    public CreateJobDataParsingTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateJobDataParsingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobDataParsingTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
