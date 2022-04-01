// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationMetaRequest extends TeaModel {
    // listApplicationMetaParam
    @NameInMap("listApplicationMetaParam")
    public ListApplicationMetaParam listApplicationMetaParam;

    public static ListApplicationMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMetaRequest self = new ListApplicationMetaRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationMetaRequest setListApplicationMetaParam(ListApplicationMetaParam listApplicationMetaParam) {
        this.listApplicationMetaParam = listApplicationMetaParam;
        return this;
    }
    public ListApplicationMetaParam getListApplicationMetaParam() {
        return this.listApplicationMetaParam;
    }

}
