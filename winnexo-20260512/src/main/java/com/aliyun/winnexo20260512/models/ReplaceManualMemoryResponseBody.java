// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceManualMemoryResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The complete content of the manual memory after it is saved. If the memory is successfully cleared, an empty string is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Prefers concise answers</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The current user is not an active member of the group cg_12345</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReplaceManualMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceManualMemoryResponseBody self = new ReplaceManualMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceManualMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceManualMemoryResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplaceManualMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceManualMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
