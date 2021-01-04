// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToCcnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GrantSagInstanceToCcnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToCcnResponseBody self = new GrantSagInstanceToCcnResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToCcnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantSagInstanceToCcnResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
