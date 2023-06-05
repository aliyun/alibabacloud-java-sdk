// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class EchoStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EchoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EchoStatusResponseBody self = new EchoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public EchoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
