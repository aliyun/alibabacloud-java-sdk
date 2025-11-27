// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyComputeBurstConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyComputeBurstConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyComputeBurstConfigResponseBody self = new ModifyComputeBurstConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyComputeBurstConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
