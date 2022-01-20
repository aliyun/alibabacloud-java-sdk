// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceShutdownTimerResponseBody extends TeaModel {
    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceShutdownTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceShutdownTimerResponseBody self = new DeleteInstanceShutdownTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceShutdownTimerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceShutdownTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
