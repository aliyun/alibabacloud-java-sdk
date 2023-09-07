// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBEndpointAddressResponseBody self = new ModifyDBEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
