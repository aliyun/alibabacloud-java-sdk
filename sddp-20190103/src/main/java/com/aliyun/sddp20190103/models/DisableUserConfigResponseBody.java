// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DisableUserConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC314611-D907-5EBF-B6D8-70425E5A8643</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableUserConfigResponseBody self = new DisableUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
