// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayPluginSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the Tair AI gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTairAIGatewayPluginSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayPluginSwitchResponseBody self = new ModifyTairAIGatewayPluginSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayPluginSwitchResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTairAIGatewayPluginSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
