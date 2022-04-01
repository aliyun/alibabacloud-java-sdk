// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterNodeGroupRequest extends TeaModel {
    // deleteClusterNodeGroupParam
    @NameInMap("deleteNodeGroupParam")
    public DeleteNodeGroupParam deleteNodeGroupParam;

    public static DeleteClusterNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodeGroupRequest self = new DeleteClusterNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodeGroupRequest setDeleteNodeGroupParam(DeleteNodeGroupParam deleteNodeGroupParam) {
        this.deleteNodeGroupParam = deleteNodeGroupParam;
        return this;
    }
    public DeleteNodeGroupParam getDeleteNodeGroupParam() {
        return this.deleteNodeGroupParam;
    }

}
