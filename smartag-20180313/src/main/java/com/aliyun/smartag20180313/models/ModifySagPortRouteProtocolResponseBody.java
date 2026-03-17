// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRouteProtocolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagPortRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRouteProtocolResponseBody self = new ModifySagPortRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
