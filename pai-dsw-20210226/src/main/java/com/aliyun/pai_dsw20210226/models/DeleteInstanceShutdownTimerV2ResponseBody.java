// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceShutdownTimerV2ResponseBody extends TeaModel {
    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceShutdownTimerV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceShutdownTimerV2ResponseBody self = new DeleteInstanceShutdownTimerV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceShutdownTimerV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceShutdownTimerV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
