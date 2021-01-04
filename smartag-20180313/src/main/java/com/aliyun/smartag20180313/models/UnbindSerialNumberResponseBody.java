// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSerialNumberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindSerialNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSerialNumberResponseBody self = new UnbindSerialNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSerialNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
