// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateExtensionProviderRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Name")
    public String name;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Type")
    public String type;

    public static CreateExtensionProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExtensionProviderRequest self = new CreateExtensionProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateExtensionProviderRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateExtensionProviderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExtensionProviderRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public CreateExtensionProviderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
