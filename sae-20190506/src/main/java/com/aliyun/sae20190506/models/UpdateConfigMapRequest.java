// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapRequest extends TeaModel {
    /**
     * <p>Instance ID of the ConfigMap instance to be updated. To obtain instance ID, call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigMapId")
    public Long configMapId;

    /**
     * <p>The key-value pair data of the ConfigMap in JSON format. The format is as follows:</p>
     * <p>{&quot;Data&quot;:&quot;{\&quot;k1\&quot;:\&quot;v1\&quot;, \&quot;k2\&quot;:\&quot;v2\&quot;}&quot;}</p>
     * <p>k represents the key and v represents the value. For more information about ConfigMaps, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use ConfigMaps</a>.</p>
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
