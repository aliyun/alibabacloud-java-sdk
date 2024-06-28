// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRouterInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceAttributeResponseBody self = new ModifyRouterInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
