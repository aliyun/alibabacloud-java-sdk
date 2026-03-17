// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagManagementPortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6877D55B-08F7-4DA3-916B-32A6FD402E06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagManagementPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagManagementPortResponseBody self = new ModifySagManagementPortResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagManagementPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
