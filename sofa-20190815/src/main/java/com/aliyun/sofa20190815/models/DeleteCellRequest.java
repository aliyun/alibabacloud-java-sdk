// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCellRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCellRequest self = new DeleteCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
