// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    @NameInMap("allowedStores")
    public java.util.List<String> allowedStores;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyRequest self = new UpdateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyRequest setAllowedStores(java.util.List<String> allowedStores) {
        this.allowedStores = allowedStores;
        return this;
    }
    public java.util.List<String> getAllowedStores() {
        return this.allowedStores;
    }

    public UpdateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
