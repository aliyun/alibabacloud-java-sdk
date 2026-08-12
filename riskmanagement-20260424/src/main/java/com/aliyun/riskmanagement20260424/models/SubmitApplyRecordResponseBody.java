// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitApplyRecordResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Succeeded.</li>
     * <li><strong>Other (400, 500)</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result.</p>
     * <ul>
     * <li><strong>true</strong>: Submitted.</li>
     * <li><strong>false</strong>: Submission failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B57D35D-9DAC-5393-AE39-07697E37C2E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call status.</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitApplyRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitApplyRecordResponseBody self = new SubmitApplyRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitApplyRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitApplyRecordResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SubmitApplyRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitApplyRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitApplyRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
