// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> indicates success. Any other value indicates failure. Use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6C2B68F-2311-4495-82AC-DAE86C9****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Error details if the request failed. Returns &quot;successful&quot; on success.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00A044A2-D59B-4104-96BA-84060AE8345F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. true means success. false or null means failure.</p>
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
