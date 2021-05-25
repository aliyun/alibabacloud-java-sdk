// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBuiltinEnvoyFilterResponseBody self = new RemoveBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
