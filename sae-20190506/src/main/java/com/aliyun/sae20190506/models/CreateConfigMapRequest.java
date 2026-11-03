// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapRequest extends TeaModel {
    /**
     * <p>The key-value pair data of the ConfigMap in JSON format. The format is as follows:</p>
     * <p>{&quot;Data&quot;:&quot;{\&quot;k1\&quot;:\&quot;v1\&quot;, \&quot;k2\&quot;:\&quot;v2\&quot;}&quot;}</p>
     * <p>k represents the key, and v represents the value. For more information about ConfigMaps, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use ConfigMaps</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env.shell&quot;: &quot;/bin/sh&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The description. The description cannot contain spaces and can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test-desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the ConfigMap instance. The name can contain digits, letters, and underscores (_), and must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the namespace where the ConfigMap instance resides.</p>
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
