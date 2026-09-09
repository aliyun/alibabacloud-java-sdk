// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    /**
     * <p>The list of Logstores that the API key is allowed to write to.</p>
     */
    @NameInMap("allowedStores")
    public java.util.List<String> allowedStores;

    /**
     * <p>The API key name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-apikey-001</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setAllowedStores(java.util.List<String> allowedStores) {
        this.allowedStores = allowedStores;
        return this;
    }
    public java.util.List<String> getAllowedStores() {
        return this.allowedStores;
    }

    public CreateApiKeyRequest setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public CreateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
