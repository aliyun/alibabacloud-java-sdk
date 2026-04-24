// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteApiKeyRequest extends TeaModel {
    /**
     * <p>Api Key</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-rds-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyRequest self = new DeleteApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DeleteApiKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
