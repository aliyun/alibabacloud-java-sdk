// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteVariableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb1</p>
     */
    @NameInMap("VariableId")
    public String variableId;

    public static DeleteVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVariableRequest self = new DeleteVariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVariableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVariableRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
