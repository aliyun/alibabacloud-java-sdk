// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByClusterIdsRequest extends TeaModel {
    // listClusterAckClusterByClusterIdsParam
    @NameInMap("listClusterAckClusterByClusterIdsParam")
    public ListClusterAckClusterByClusterIdsParam listClusterAckClusterByClusterIdsParam;

    public static ListClusterAckByClusterIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByClusterIdsRequest self = new ListClusterAckByClusterIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByClusterIdsRequest setListClusterAckClusterByClusterIdsParam(ListClusterAckClusterByClusterIdsParam listClusterAckClusterByClusterIdsParam) {
        this.listClusterAckClusterByClusterIdsParam = listClusterAckClusterByClusterIdsParam;
        return this;
    }
    public ListClusterAckClusterByClusterIdsParam getListClusterAckClusterByClusterIdsParam() {
        return this.listClusterAckClusterByClusterIdsParam;
    }

}
