// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateInstanceShutdownTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerResponseBody self = new CreateInstanceShutdownTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceShutdownTimerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
