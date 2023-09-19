// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerExecutionResponseBody self = new TriggerExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
