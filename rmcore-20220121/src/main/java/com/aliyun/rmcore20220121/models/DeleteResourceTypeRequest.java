// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteResourceTypeRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceTypeRequest self = new DeleteResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceTypeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
