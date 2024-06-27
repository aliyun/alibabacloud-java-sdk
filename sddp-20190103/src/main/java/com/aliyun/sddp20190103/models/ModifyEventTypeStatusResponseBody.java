// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventTypeStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>208B016D-4CB9-4A85-96A5-0B8ED1E*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEventTypeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTypeStatusResponseBody self = new ModifyEventTypeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEventTypeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
