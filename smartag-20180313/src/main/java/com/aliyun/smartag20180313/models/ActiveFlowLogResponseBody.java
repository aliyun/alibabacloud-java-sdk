// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ActiveFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponseBody self = new ActiveFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
