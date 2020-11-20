// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDbProxyInstanceSslResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslResponse self = new ModifyDbProxyInstanceSslResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
