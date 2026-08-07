// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateFlashSmsAccessProfileShrinkRequest extends TeaModel {
    /**
     * <p>接入配置</p>
     */
    @NameInMap("AccessProfile")
    public String accessProfileShrink;

    /**
     * <p>接入配置ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>供应商ID</p>
     * 
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static UpdateFlashSmsAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlashSmsAccessProfileShrinkRequest self = new UpdateFlashSmsAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlashSmsAccessProfileShrinkRequest setAccessProfileShrink(String accessProfileShrink) {
        this.accessProfileShrink = accessProfileShrink;
        return this;
    }
    public String getAccessProfileShrink() {
        return this.accessProfileShrink;
    }

    public UpdateFlashSmsAccessProfileShrinkRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateFlashSmsAccessProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFlashSmsAccessProfileShrinkRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
