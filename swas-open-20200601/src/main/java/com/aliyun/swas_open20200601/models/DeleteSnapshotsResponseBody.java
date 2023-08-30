// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotsResponseBody self = new DeleteSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
