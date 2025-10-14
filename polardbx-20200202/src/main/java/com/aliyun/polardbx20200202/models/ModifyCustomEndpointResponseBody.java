// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A586DCB-39A6-4050-81CC-C7BD4CCDB49F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointResponseBody self = new ModifyCustomEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
