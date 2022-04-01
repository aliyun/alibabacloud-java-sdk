// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationsRequest extends TeaModel {
    // listClusterOperationsParam
    @NameInMap("listClusterOperationsParam")
    public ListClusterOperationsParam listClusterOperationsParam;

    public static ListClusterOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationsRequest self = new ListClusterOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationsRequest setListClusterOperationsParam(ListClusterOperationsParam listClusterOperationsParam) {
        this.listClusterOperationsParam = listClusterOperationsParam;
        return this;
    }
    public ListClusterOperationsParam getListClusterOperationsParam() {
        return this.listClusterOperationsParam;
    }

}
