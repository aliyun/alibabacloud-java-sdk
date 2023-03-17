// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the O&M task. Multiple IDs are separated with commas (,).</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTaskResponseBody self = new ModifyActiveOperationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTaskResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyActiveOperationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
