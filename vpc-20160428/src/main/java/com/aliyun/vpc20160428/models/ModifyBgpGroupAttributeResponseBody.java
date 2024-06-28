// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C3C6D7C-A1CE-4FD8-BC57-DC493A55F76F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBgpGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeResponseBody self = new ModifyBgpGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBgpGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
