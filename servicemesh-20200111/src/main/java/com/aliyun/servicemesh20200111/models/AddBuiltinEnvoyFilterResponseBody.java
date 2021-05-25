// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBuiltinEnvoyFilterResponseBody self = new AddBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
