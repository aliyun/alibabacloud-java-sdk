// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairAIGatewayParameterResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-2zeb1ce76fee****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created task flow.</p>
     * 
     * <strong>example:</strong>
     * <p>578678678</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ModifyTairAIGatewayParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairAIGatewayParameterResponseBody self = new ModifyTairAIGatewayParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTairAIGatewayParameterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTairAIGatewayParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTairAIGatewayParameterResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
