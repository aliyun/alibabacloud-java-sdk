// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSConfigmapRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSConfigmapRequest self = new DeleteAKSConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteAKSConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteAKSConfigmapRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
