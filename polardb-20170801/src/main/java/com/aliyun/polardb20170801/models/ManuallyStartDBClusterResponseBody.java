// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ManuallyStartDBClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73A85BAF-1039-4CDE-A83F-1A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManuallyStartDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManuallyStartDBClusterResponseBody self = new ManuallyStartDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ManuallyStartDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
