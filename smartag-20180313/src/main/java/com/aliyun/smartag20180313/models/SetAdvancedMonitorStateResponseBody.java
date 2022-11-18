// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetAdvancedMonitorStateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

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
