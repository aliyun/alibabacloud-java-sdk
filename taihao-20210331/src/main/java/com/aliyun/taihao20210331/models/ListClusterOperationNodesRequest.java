// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationNodesRequest extends TeaModel {
    // listClusterOperationNodesParam
    @NameInMap("listClusterOperationNodesParam")
    public ListClusterOperationNodesParam listClusterOperationNodesParam;

    public static ListClusterOperationNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationNodesRequest self = new ListClusterOperationNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationNodesRequest setListClusterOperationNodesParam(ListClusterOperationNodesParam listClusterOperationNodesParam) {
        this.listClusterOperationNodesParam = listClusterOperationNodesParam;
        return this;
    }
    public ListClusterOperationNodesParam getListClusterOperationNodesParam() {
        return this.listClusterOperationNodesParam;
    }

}
