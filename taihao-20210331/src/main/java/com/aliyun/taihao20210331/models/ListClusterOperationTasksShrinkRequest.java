// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationTasksShrinkRequest extends TeaModel {
    // listClusterOperationTasksParam
    @NameInMap("listClusterOperationTasksParam")
    public String listClusterOperationTasksParamShrink;

    public static ListClusterOperationTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTasksShrinkRequest self = new ListClusterOperationTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTasksShrinkRequest setListClusterOperationTasksParamShrink(String listClusterOperationTasksParamShrink) {
        this.listClusterOperationTasksParamShrink = listClusterOperationTasksParamShrink;
        return this;
    }
    public String getListClusterOperationTasksParamShrink() {
        return this.listClusterOperationTasksParamShrink;
    }

}
