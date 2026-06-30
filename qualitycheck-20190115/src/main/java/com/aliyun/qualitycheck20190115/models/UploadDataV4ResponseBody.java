// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataV4ResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of 200 indicates success. Other values indicate failure. Use this field to determine the cause of a failure.</p>
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
     * <p>6F5934C7-C223-4F0F-BBF3-5B3594***</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The details of the error if the request fails. If the request is successful, the value is &quot;successful&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. This is a unique identifier for the request that can be used for tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>6F5934C7-C223-4F0F-BBF3-5B3594***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Use this field to determine if the request succeeded. A value of true indicates success. A value of false or null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadDataV4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDataV4ResponseBody self = new UploadDataV4ResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDataV4ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDataV4ResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadDataV4ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDataV4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDataV4ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
