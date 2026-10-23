// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryAutoExtractionSwitchResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status of the automatic memory collection switch for the current memory scope. A value of true indicates that the switch is enabled, and a value of false indicates that the switch is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static GetMemoryAutoExtractionSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryAutoExtractionSwitchResponseBody self = new GetMemoryAutoExtractionSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryAutoExtractionSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
