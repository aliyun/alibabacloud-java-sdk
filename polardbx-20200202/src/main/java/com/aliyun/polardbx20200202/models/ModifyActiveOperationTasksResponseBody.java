// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    // Id of the request
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
