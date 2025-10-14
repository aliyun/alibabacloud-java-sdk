// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointNetResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomEndpointNetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointNetResponseBody self = new ModifyCustomEndpointNetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointNetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
