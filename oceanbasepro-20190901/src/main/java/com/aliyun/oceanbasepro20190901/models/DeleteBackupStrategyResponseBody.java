// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteBackupStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupStrategyResponseBody self = new DeleteBackupStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
