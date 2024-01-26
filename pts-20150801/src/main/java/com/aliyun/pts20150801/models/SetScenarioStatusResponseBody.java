// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetScenarioStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetScenarioStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScenarioStatusResponseBody self = new SetScenarioStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScenarioStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
