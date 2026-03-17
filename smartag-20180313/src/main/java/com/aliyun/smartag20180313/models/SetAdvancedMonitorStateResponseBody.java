// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetAdvancedMonitorStateResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>324223F3-93D3-4CE4-B26F-66C0C3809922</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAdvancedMonitorStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAdvancedMonitorStateResponseBody self = new SetAdvancedMonitorStateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAdvancedMonitorStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetAdvancedMonitorStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetAdvancedMonitorStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
