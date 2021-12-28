// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteExtensionProviderRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Type")
    public String type;

    public static DeleteExtensionProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionProviderRequest self = new DeleteExtensionProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionProviderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteExtensionProviderRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DeleteExtensionProviderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
