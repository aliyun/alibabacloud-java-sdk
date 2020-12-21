// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceCaptureStrategyResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // 响应码
    @NameInMap("Code")
    public String code;

    // 响应信息
    @NameInMap("Message")
    public String message;

    public static UpdateDeviceCaptureStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceCaptureStrategyResponseBody self = new UpdateDeviceCaptureStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceCaptureStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
