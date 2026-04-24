// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RenameApiKeyRequest extends TeaModel {
    /**
     * <p>API KEY</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-*****</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    public static RenameApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameApiKeyRequest self = new RenameApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public RenameApiKeyRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public RenameApiKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenameApiKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
