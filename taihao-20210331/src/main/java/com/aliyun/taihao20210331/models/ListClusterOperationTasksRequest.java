// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationTasksRequest extends TeaModel {
    // listClusterOperationTasksParam
    @NameInMap("listClusterOperationTasksParam")
    public ListClusterOperationTasksParam listClusterOperationTasksParam;

    public static ListClusterOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTasksRequest self = new ListClusterOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTasksRequest setListClusterOperationTasksParam(ListClusterOperationTasksParam listClusterOperationTasksParam) {
        this.listClusterOperationTasksParam = listClusterOperationTasksParam;
        return this;
    }
    public ListClusterOperationTasksParam getListClusterOperationTasksParam() {
        return this.listClusterOperationTasksParam;
    }

}
