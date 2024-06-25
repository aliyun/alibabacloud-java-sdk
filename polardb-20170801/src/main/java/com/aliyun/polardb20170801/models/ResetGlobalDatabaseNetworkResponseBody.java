// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetGlobalDatabaseNetworkResponseBody self = new ResetGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
