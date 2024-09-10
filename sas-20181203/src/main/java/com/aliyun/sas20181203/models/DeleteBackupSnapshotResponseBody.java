// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupSnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupSnapshotResponseBody self = new DeleteBackupSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
