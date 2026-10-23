// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearAutoMemoryResponseBody extends TeaModel {
    /**
     * <p>The number of automatic memory files successfully deleted in this request. The value is 0 if no memory is available to be cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("clearedCount")
    public Long clearedCount;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

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

    /**
     * <p>The type of automatic memory cleared in this request. Valid values: user, feedback, reference, project, and all.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("type")
    public String type;

    public static ClearAutoMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearAutoMemoryResponseBody self = new ClearAutoMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearAutoMemoryResponseBody setClearedCount(Long clearedCount) {
        this.clearedCount = clearedCount;
        return this;
    }
    public Long getClearedCount() {
        return this.clearedCount;
    }

    public ClearAutoMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearAutoMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClearAutoMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearAutoMemoryResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
