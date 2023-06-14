// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The scheduled switchover time to be specified. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  The time cannot be later than the latest operation time. You can call the [DescribeActiveOperationTask](~~197387~~) operation. The **Deadline** parameter in the response indicates the latest operation time.</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Modifies the scheduled switchover time of an operations and maintenance (O&M) task.</p>
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
