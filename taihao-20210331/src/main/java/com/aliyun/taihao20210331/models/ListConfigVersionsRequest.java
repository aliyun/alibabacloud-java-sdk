// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigVersionsRequest extends TeaModel {
    // listConfigVersionsParam
    @NameInMap("listConfigVersionsParam")
    public ListConfigVersionsParam listConfigVersionsParam;

    public static ListConfigVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigVersionsRequest self = new ListConfigVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigVersionsRequest setListConfigVersionsParam(ListConfigVersionsParam listConfigVersionsParam) {
        this.listConfigVersionsParam = listConfigVersionsParam;
        return this;
    }
    public ListConfigVersionsParam getListConfigVersionsParam() {
        return this.listConfigVersionsParam;
    }

}
