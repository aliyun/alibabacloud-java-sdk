// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ConfigMapId")
    public Long configMapId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Description")
    public String description;

    public static UpdateConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapRequest self = new UpdateConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapRequest setConfigMapId(Long configMapId) {
        this.configMapId = configMapId;
        return this;
    }
    public Long getConfigMapId() {
        return this.configMapId;
    }

    public UpdateConfigMapRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateConfigMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
