// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelMigrateResourceUnitResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CancelMigrateResourceUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrateResourceUnitResponseBody self = new CancelMigrateResourceUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMigrateResourceUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
