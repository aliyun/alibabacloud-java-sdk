// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeactiveFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactiveFlowLogResponseBody self = new DeactiveFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactiveFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
