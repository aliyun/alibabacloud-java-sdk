// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> means success. Any other value means failure. Use this field to diagnose failures.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Task ID for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>6F5934C7-C223-4F0F-BBF3-5B3594***</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Error details if the request failed. Returns successful if the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID. A unique identifier for this request. Use it to trace the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6F5934C7-C223-4F0F-BBF3-5B3594****</p>
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

    public static UploadDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDataResponseBody self = new UploadDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
