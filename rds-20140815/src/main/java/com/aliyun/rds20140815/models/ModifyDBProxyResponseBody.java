// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyResponseBody self = new ModifyDBProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
