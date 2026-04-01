// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BF46A62B-3717-4397-9338-36BB95C898B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDbProxyInstanceSslResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslResponseBody self = new ModifyDbProxyInstanceSslResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
