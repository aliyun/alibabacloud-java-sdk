// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9B9300FE-11E2-4E3B-949C-BED3B44DD26D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExpressConnectTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosQueueResponseBody self = new DeleteExpressConnectTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
