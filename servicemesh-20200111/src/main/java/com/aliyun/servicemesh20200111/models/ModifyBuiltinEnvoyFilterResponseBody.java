// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBuiltinEnvoyFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuiltinEnvoyFilterResponseBody self = new ModifyBuiltinEnvoyFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBuiltinEnvoyFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
