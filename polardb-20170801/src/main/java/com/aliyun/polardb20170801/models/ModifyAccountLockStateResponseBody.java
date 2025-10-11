// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountLockStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B762E8C5-0129-51DB-80C8-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountLockStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountLockStateResponseBody self = new ModifyAccountLockStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountLockStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
