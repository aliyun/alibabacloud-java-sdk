// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    // listNodesParam
    @NameInMap("listNodeParam")
    public ListNodesParam listNodeParam;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setListNodeParam(ListNodesParam listNodeParam) {
        this.listNodeParam = listNodeParam;
        return this;
    }
    public ListNodesParam getListNodeParam() {
        return this.listNodeParam;
    }

}
