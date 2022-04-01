// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodesRequest extends TeaModel {
    // listAckClusterNodesParam
    @NameInMap("listAckClusterNodesParam")
    public ListAckClusterNodesParam listAckClusterNodesParam;

    public static ListAckClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodesRequest self = new ListAckClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodesRequest setListAckClusterNodesParam(ListAckClusterNodesParam listAckClusterNodesParam) {
        this.listAckClusterNodesParam = listAckClusterNodesParam;
        return this;
    }
    public ListAckClusterNodesParam getListAckClusterNodesParam() {
        return this.listAckClusterNodesParam;
    }

}
