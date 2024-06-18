// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the O\&amp;M task. IDs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>11111,22222</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>E9ADB6BE-1598-57FC-B86D-D7F4C69B****</p>
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
