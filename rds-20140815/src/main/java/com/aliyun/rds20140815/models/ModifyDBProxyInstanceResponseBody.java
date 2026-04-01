// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65C55572-530E-4A53-BE03-1D08CAF0F046</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBProxyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceResponseBody self = new ModifyDBProxyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
