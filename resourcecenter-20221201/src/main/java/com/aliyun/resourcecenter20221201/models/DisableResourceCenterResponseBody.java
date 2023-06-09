// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisableResourceCenterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableResourceCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceCenterResponseBody self = new DisableResourceCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableResourceCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
