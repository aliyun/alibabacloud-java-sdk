// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the O\&M task. IDs are separated by commas (,).</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksResponseBody self = new ModifyActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
