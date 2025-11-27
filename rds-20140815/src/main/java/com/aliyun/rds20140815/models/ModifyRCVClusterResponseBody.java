// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCVClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2553A660-E4EB-4AF4-A402-8AFF70A49143</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCVClusterResponseBody self = new ModifyRCVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
