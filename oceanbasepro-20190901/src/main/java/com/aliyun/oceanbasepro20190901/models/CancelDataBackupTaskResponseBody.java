// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelDataBackupTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelDataBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDataBackupTaskResponseBody self = new CancelDataBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDataBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
