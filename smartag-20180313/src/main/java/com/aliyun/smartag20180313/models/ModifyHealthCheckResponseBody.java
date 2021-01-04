// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckResponseBody self = new ModifyHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
