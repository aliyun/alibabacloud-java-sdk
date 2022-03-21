// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DisableResourceTypeRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DisableResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceTypeRequest self = new DisableResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DisableResourceTypeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DisableResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
