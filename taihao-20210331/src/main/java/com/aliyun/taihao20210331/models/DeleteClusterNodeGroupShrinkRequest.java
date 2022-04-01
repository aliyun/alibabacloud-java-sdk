// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterNodeGroupShrinkRequest extends TeaModel {
    // deleteClusterNodeGroupParam
    @NameInMap("deleteNodeGroupParam")
    public String deleteNodeGroupParamShrink;

    public static DeleteClusterNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodeGroupShrinkRequest self = new DeleteClusterNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodeGroupShrinkRequest setDeleteNodeGroupParamShrink(String deleteNodeGroupParamShrink) {
        this.deleteNodeGroupParamShrink = deleteNodeGroupParamShrink;
        return this;
    }
    public String getDeleteNodeGroupParamShrink() {
        return this.deleteNodeGroupParamShrink;
    }

}
