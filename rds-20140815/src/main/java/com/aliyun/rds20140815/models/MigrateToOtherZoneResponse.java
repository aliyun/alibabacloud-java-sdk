// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static MigrateToOtherZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneResponse self = new MigrateToOtherZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
