// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyResponseBody self = new ModifyBackupStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
