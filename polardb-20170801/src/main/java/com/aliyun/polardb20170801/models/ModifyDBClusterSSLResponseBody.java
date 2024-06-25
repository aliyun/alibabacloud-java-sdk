// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A94B1755-6D8B-4E27-BF3C-8562BC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLResponseBody self = new ModifyDBClusterSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
