// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDocumentDBResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDBClusterDocumentDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDocumentDBResponseBody self = new DisableDBClusterDocumentDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDocumentDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
