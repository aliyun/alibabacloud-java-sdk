// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPhysicalConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeResponseBody self = new ModifyPhysicalConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
