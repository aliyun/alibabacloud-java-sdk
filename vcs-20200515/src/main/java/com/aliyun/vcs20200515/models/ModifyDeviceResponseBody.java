// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ModifyDeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误码描述
    @NameInMap("Message")
    public String message;

    public static ModifyDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceResponseBody self = new ModifyDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
