// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceGroupResponseBody self = new ModifyResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
