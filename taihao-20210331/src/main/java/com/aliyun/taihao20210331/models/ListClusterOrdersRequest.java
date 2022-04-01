// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOrdersRequest extends TeaModel {
    // listClusterOrdersParam
    @NameInMap("listClusterOrdersParam")
    public ListClusterOrdersParam listClusterOrdersParam;

    public static ListClusterOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOrdersRequest self = new ListClusterOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOrdersRequest setListClusterOrdersParam(ListClusterOrdersParam listClusterOrdersParam) {
        this.listClusterOrdersParam = listClusterOrdersParam;
        return this;
    }
    public ListClusterOrdersParam getListClusterOrdersParam() {
        return this.listClusterOrdersParam;
    }

}
