// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateDeviceBindedEndUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDeviceBindedEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceBindedEndUserResponseBody self = new UpdateDeviceBindedEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceBindedEndUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDeviceBindedEndUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDeviceBindedEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
