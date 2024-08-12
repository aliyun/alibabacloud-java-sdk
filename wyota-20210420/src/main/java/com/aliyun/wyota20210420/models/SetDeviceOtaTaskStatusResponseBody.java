// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SetDeviceOtaTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDeviceOtaTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceOtaTaskStatusResponseBody self = new SetDeviceOtaTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDeviceOtaTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDeviceOtaTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetDeviceOtaTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
