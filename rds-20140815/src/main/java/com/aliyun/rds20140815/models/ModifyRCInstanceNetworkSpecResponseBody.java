// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceNetworkSpecResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F347CA3-D6AB-5045-9026-24578801F781</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceNetworkSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceNetworkSpecResponseBody self = new ModifyRCInstanceNetworkSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceNetworkSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
