// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCustomizationConfigResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> means the call succeeded. Any other value means the call failed. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>252</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Details about the error if the call fails. If the call succeeds, this value is <strong>successful</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9987D326-83D9-4A42-B9A5-0B27F9B40539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Use this field to check the result: true means success and <strong>false</strong> or <strong>null</strong> means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCustomizationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizationConfigResponseBody self = new DeleteCustomizationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizationConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCustomizationConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteCustomizationConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCustomizationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCustomizationConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
