// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>111,1223</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <strong>example:</strong>
     * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
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
