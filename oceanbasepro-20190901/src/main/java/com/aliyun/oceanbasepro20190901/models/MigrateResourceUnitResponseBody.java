// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MigrateResourceUnitResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateResourceUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceUnitResponseBody self = new MigrateResourceUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateResourceUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
