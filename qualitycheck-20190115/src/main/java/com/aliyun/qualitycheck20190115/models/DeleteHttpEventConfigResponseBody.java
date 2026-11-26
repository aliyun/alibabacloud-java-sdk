// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteHttpEventConfigResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned when an error occurs.</p>
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
     * <p>Indicates whether the request is successful.</p>
     * <p>You can determine whether the request is successful based on this field:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false/null</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteHttpEventConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpEventConfigResponseBody self = new DeleteHttpEventConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHttpEventConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteHttpEventConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteHttpEventConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHttpEventConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHttpEventConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
