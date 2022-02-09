// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartLogBackupTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartLogBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLogBackupTaskResponseBody self = new StartLogBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLogBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
