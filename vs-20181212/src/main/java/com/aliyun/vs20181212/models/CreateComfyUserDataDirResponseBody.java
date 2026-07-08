// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateComfyUserDataDirResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 0 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned message. If the request fails, this parameter contains the failure reason.</p>
     * 
     * <strong>example:</strong>
     * <p>conn failed!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateComfyUserDataDirResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComfyUserDataDirResponseBody self = new CreateComfyUserDataDirResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComfyUserDataDirResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateComfyUserDataDirResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComfyUserDataDirResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
