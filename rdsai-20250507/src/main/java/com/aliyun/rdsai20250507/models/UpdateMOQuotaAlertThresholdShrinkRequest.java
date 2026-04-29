// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateMOQuotaAlertThresholdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Apikey")
    public String apikeyShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMOQuotaAlertThresholdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMOQuotaAlertThresholdShrinkRequest self = new UpdateMOQuotaAlertThresholdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMOQuotaAlertThresholdShrinkRequest setApikeyShrink(String apikeyShrink) {
        this.apikeyShrink = apikeyShrink;
        return this;
    }
    public String getApikeyShrink() {
        return this.apikeyShrink;
    }

    public UpdateMOQuotaAlertThresholdShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
