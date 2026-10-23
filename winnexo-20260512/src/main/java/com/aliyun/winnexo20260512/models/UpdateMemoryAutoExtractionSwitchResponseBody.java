// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateMemoryAutoExtractionSwitchResponseBody extends TeaModel {
    /**
     * <p>The number of automatic memory files cleared in this synchronous operation. The value is 0 if no files are cleared or no memories are available to be cleared.</p>
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
     * <p>The updated status of the automatic memory collection toggle. A value of true indicates that the feature is enabled, and a value of false indicates that the feature is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

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

    public static UpdateMemoryAutoExtractionSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryAutoExtractionSwitchResponseBody self = new UpdateMemoryAutoExtractionSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryAutoExtractionSwitchResponseBody setClearedCount(Long clearedCount) {
        this.clearedCount = clearedCount;
        return this;
    }
    public Long getClearedCount() {
        return this.clearedCount;
    }

    public UpdateMemoryAutoExtractionSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMemoryAutoExtractionSwitchResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateMemoryAutoExtractionSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMemoryAutoExtractionSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
