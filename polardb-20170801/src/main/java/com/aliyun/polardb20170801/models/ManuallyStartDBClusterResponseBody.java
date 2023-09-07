// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ManuallyStartDBClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
