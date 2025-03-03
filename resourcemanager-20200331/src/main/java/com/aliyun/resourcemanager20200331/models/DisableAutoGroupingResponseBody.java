// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableAutoGroupingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>898FAB24-7509-43EE-A287-086FE4C44394</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAutoGroupingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoGroupingResponseBody self = new DisableAutoGroupingResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAutoGroupingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
