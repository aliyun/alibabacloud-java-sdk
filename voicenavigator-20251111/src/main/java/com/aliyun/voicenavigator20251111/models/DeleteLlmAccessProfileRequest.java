// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteLlmAccessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteLlmAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLlmAccessProfileRequest self = new DeleteLlmAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLlmAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public DeleteLlmAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
