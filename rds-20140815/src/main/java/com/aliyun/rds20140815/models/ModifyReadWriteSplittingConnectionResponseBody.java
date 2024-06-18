// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5A77D650-27A1-4E08-AD9E-59008EDB6927</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReadWriteSplittingConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadWriteSplittingConnectionResponseBody self = new ModifyReadWriteSplittingConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReadWriteSplittingConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
