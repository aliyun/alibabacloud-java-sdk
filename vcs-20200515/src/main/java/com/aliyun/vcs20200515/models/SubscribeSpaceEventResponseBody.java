// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SubscribeSpaceEventResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static SubscribeSpaceEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubscribeSpaceEventResponseBody self = new SubscribeSpaceEventResponseBody();
        return TeaModel.build(map, self);
    }

    public SubscribeSpaceEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubscribeSpaceEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubscribeSpaceEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
