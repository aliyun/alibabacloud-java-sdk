// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToCcnResponseBody extends TeaModel {
    /**
     * <p>The ID of the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sgc-6z21oj0vjjrx6s****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6E1674AC-083C-4031-B047-7A66E418E0C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantSagInstanceToCcnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToCcnResponseBody self = new GrantSagInstanceToCcnResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToCcnResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantSagInstanceToCcnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
