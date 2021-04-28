// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class StartInstanceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceResponseBody self = new StartInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
