// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class StopInstanceResponseBody extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static StopInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponseBody self = new StopInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
