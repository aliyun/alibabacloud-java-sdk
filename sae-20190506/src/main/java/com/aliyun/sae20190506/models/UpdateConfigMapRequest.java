// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapRequest extends TeaModel {
    /**
     * <p>The ID of the ConfigMap instance that you want to update. To view the ID, call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigMapId")
    public Long configMapId;

    /**
     * <p>The key-value pairs for the ConfigMap. The value must be a JSON-formatted string, as shown in the following example:</p>
     * <p>{&quot;Data&quot;:&quot;{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}&quot;}</p>
     * <p>In the JSON string, k represents a key and v represents a value. For more information about configuration items, see <a href="https://help.aliyun.com/document_detail/171326.html">Managing and using configuration items</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env.shell&quot;: &quot;/bin/sh&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test-desc</p>
     */
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
