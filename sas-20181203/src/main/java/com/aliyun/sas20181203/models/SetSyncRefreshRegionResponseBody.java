// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSyncRefreshRegionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BB78BC9-07B9-578B-B020-C954E6FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSyncRefreshRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSyncRefreshRegionResponseBody self = new SetSyncRefreshRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSyncRefreshRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
