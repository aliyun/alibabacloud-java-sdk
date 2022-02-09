// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupStrategyResponseBody self = new CreateBackupStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
