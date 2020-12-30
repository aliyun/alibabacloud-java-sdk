// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnsubscribeDeviceEventResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static UnsubscribeDeviceEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeDeviceEventResponseBody self = new UnsubscribeDeviceEventResponseBody();
        return TeaModel.build(map, self);
    }

    public UnsubscribeDeviceEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnsubscribeDeviceEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsubscribeDeviceEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
