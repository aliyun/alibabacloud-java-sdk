// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The IDs of the tasks that are canceled. Multiple task IDs are separated with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>188****,188****,188****</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A807C95D-410C-5BB5-96C0-C6E09F2C3D36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelActiveOperationTasksResponseBody self = new CancelActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelActiveOperationTasksResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public CancelActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
