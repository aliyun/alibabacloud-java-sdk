// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateSnapshotAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSnapshotAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotAttributeResponseBody self = new UpdateSnapshotAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
