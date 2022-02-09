// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopLogBackupTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopLogBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLogBackupTaskResponseBody self = new StopLogBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLogBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
