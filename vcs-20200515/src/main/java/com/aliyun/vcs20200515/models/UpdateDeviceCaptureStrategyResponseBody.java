// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceCaptureStrategyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeviceCaptureStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceCaptureStrategyResponseBody self = new UpdateDeviceCaptureStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceCaptureStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDeviceCaptureStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDeviceCaptureStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
