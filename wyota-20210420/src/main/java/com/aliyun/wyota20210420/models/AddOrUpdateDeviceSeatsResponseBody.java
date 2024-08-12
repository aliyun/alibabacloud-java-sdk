// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddOrUpdateDeviceSeatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddOrUpdateDeviceSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDeviceSeatsResponseBody self = new AddOrUpdateDeviceSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDeviceSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddOrUpdateDeviceSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddOrUpdateDeviceSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
