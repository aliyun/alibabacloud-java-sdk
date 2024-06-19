// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>29B0BF34-D069-4495-92C7-FA6D9452****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateToOtherZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneResponseBody self = new MigrateToOtherZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
