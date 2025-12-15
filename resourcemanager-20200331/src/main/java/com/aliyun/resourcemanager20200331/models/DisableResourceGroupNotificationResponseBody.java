// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableResourceGroupNotificationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>898FAB24-7509-43EE-A287-086FE4C44394</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableResourceGroupNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceGroupNotificationResponseBody self = new DisableResourceGroupNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableResourceGroupNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
