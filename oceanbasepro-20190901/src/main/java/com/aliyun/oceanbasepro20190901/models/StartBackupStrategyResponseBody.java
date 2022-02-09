// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartBackupStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartBackupStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBackupStrategyResponseBody self = new StartBackupStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBackupStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
