// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSMeshWorkspaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteAKSMeshWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSMeshWorkspaceRequest self = new DeleteAKSMeshWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSMeshWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
