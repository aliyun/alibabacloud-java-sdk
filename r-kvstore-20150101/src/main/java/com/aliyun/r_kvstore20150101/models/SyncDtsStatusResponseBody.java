// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SyncDtsStatusResponseBody extends TeaModel {
    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncDtsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncDtsStatusResponseBody self = new SyncDtsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncDtsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
