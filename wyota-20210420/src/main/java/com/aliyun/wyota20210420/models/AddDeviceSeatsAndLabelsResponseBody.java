// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDeviceSeatsAndLabelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddDeviceSeatsAndLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceSeatsAndLabelsResponseBody self = new AddDeviceSeatsAndLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDeviceSeatsAndLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDeviceSeatsAndLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDeviceSeatsAndLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
