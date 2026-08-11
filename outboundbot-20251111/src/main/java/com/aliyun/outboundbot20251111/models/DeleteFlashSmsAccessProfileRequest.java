// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteFlashSmsAccessProfileRequest extends TeaModel {
    /**
     * <p>The flash message configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteFlashSmsAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlashSmsAccessProfileRequest self = new DeleteFlashSmsAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlashSmsAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public DeleteFlashSmsAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
