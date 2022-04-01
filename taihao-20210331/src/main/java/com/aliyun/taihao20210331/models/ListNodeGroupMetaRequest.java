// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeGroupMetaRequest extends TeaModel {
    // listNodeGroupMetaParam
    @NameInMap("listNodeGroupMetaParam")
    public ListNodeGroupMetaParam listNodeGroupMetaParam;

    public static ListNodeGroupMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupMetaRequest self = new ListNodeGroupMetaRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupMetaRequest setListNodeGroupMetaParam(ListNodeGroupMetaParam listNodeGroupMetaParam) {
        this.listNodeGroupMetaParam = listNodeGroupMetaParam;
        return this;
    }
    public ListNodeGroupMetaParam getListNodeGroupMetaParam() {
        return this.listNodeGroupMetaParam;
    }

}
