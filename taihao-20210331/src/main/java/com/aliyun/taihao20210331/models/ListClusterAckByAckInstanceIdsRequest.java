// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByAckInstanceIdsRequest extends TeaModel {
    // listClusterAckByInstanceIdsParam
    @NameInMap("listClusterAckByInstanceIdsParam")
    public ListClusterAckByInstanceIdsParam listClusterAckByInstanceIdsParam;

    public static ListClusterAckByAckInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByAckInstanceIdsRequest self = new ListClusterAckByAckInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByAckInstanceIdsRequest setListClusterAckByInstanceIdsParam(ListClusterAckByInstanceIdsParam listClusterAckByInstanceIdsParam) {
        this.listClusterAckByInstanceIdsParam = listClusterAckByInstanceIdsParam;
        return this;
    }
    public ListClusterAckByInstanceIdsParam getListClusterAckByInstanceIdsParam() {
        return this.listClusterAckByInstanceIdsParam;
    }

}
