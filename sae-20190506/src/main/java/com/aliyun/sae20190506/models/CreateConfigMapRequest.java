// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapRequest extends TeaModel {
    /**
     * <p>The key-value pairs of the ConfigMap in the JSON format. Format:</p>
     * <p>{&quot;Data&quot;:&quot;{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}&quot;}</p>
     * <p>k specifies a key and v specifies a value. For more information, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage a Kubernetes ConfigMap</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env.shell&quot;: &quot;/bin/sh&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The description. The description must be 1 to 255 characters in length, and cannot contain spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>test-desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the ConfigMap. The name can contain digits, letters, and underscores (_). The name must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the namespace to which the ConfigMap instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static CreateConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigMapRequest self = new CreateConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigMapRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateConfigMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigMapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConfigMapRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
