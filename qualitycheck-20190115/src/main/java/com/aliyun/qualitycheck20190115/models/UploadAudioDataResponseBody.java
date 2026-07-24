// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadAudioDataResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Other values indicate failure. You can use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task ID, which is used when retrieving task results.</p>
     * 
     * <strong>example:</strong>
     * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5***</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message when the request fails. The value is &quot;successful&quot; when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F8***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false/null: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadAudioDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadAudioDataResponseBody self = new UploadAudioDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadAudioDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadAudioDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadAudioDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadAudioDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadAudioDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
