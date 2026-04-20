// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteInstructionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Transfer00</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstructionRequest self = new DeleteInstructionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstructionRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstructionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
