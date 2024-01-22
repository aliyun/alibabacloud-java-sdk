// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("Description")
    public String description;

    /**
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
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
