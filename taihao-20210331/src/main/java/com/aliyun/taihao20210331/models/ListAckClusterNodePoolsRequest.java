// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodePoolsRequest extends TeaModel {
    // listAckClusterNodePoolsParam
    @NameInMap("listAckClusterNodePoolsParam")
    public ListAckClusterNodePoolsParam listAckClusterNodePoolsParam;

    public static ListAckClusterNodePoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodePoolsRequest self = new ListAckClusterNodePoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodePoolsRequest setListAckClusterNodePoolsParam(ListAckClusterNodePoolsParam listAckClusterNodePoolsParam) {
        this.listAckClusterNodePoolsParam = listAckClusterNodePoolsParam;
        return this;
    }
    public ListAckClusterNodePoolsParam getListAckClusterNodePoolsParam() {
        return this.listAckClusterNodePoolsParam;
    }

}
