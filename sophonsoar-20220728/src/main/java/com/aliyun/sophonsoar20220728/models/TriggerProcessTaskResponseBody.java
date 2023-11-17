// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerProcessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerProcessTaskResponseBody self = new TriggerProcessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerProcessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
