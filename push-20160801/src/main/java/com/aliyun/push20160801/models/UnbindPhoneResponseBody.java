// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindPhoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindPhoneResponseBody self = new UnbindPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
