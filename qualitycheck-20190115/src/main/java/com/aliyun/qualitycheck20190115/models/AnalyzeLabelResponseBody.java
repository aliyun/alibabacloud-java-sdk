// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AnalyzeLabelResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success, whereas other values indicate failure. You can determine the cause of the failure based on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The analysis task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20260629-DCC646E7-BE7F-114E-9F32-0C928292FC7F</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AnalyzeLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeLabelResponseBody self = new AnalyzeLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AnalyzeLabelResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AnalyzeLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AnalyzeLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnalyzeLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
