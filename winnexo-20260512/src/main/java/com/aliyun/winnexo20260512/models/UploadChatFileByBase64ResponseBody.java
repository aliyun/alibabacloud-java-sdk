// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileByBase64ResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The file record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleFileRecordId</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UploadChatFileByBase64ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadChatFileByBase64ResponseBody self = new UploadChatFileByBase64ResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadChatFileByBase64ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadChatFileByBase64ResponseBody setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public UploadChatFileByBase64ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadChatFileByBase64ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
