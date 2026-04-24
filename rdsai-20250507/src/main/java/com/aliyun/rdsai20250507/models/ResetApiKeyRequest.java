// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetApiKeyRequest extends TeaModel {
    /**
     * <p>Api Key</p>
     * 
     * <strong>example:</strong>
     * <p>sk-rds-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ResetApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetApiKeyRequest self = new ResetApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ResetApiKeyRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ResetApiKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
