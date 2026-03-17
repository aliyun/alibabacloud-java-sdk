// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRouteProtocolOspfResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>191DC00D-00C0-475C-99B8-ADBB82496405</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagRouteProtocolOspfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRouteProtocolOspfResponseBody self = new ModifySagRouteProtocolOspfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagRouteProtocolOspfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
