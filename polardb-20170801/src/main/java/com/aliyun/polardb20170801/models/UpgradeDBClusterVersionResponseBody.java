// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CAE6755F-B79A-4861-B227-801FE8******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBClusterVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionResponseBody self = new UpgradeDBClusterVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
