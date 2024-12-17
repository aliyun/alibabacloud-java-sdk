// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The IDs of O\&amp;M events that are canceled at a time. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1508850,1508310,1507849,1506274</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F16A51B0-436E-5B84-8326-A18AA150D1C4</p>
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
