// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success, and other values indicate failure. You can determine the cause of the failure based on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>F6C2B68F-2311-4495-82AC-DAE86C9****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error details when an error occurs, or successful when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>00A044A2-D59B-4104-96BA-84060AE8345F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. You can determine whether the request is successful based on this field. A value of true indicates success, and a value of false or null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitQualityCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityCheckTaskResponseBody self = new SubmitQualityCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitQualityCheckTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitQualityCheckTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitQualityCheckTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitQualityCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitQualityCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
