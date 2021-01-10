// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DeleteWorkspaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceGroupRequest self = new DeleteWorkspaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
