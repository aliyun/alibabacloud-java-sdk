// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveCameraForInstanceResponseBody extends TeaModel {
    // code码
    @NameInMap("Code")
    public String code;

    // 返回结果消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveCameraForInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveCameraForInstanceResponseBody self = new RemoveCameraForInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveCameraForInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveCameraForInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveCameraForInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
