// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetFlowControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Value")
    public Integer value;

    public static GetFlowControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowControlResponseBody self = new GetFlowControlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowControlResponseBody setValue(Integer value) {
        this.value = value;
        return this;
    }
    public Integer getValue() {
        return this.value;
    }

}
