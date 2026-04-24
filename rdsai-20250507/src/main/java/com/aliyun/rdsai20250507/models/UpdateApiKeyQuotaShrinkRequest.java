// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateApiKeyQuotaShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keys")
    public String keysShrink;

    public static UpdateApiKeyQuotaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyQuotaShrinkRequest self = new UpdateApiKeyQuotaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyQuotaShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApiKeyQuotaShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

}
