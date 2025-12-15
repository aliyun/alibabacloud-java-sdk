// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>561AFBF1-BE20-44DB-9BD1-6988B53E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationMaintainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfigResponseBody self = new ModifyActiveOperationMaintainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
