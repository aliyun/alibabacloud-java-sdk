// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteGlobalAccelerationInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6E63B2A-9820-44A8-A359-9BB2DAEE6424</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalAccelerationInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalAccelerationInstanceResponseBody self = new DeleteGlobalAccelerationInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalAccelerationInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
