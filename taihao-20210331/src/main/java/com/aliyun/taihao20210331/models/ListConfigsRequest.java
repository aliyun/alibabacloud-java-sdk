// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
    // listConfigsParam
    @NameInMap("listConfigsParam")
    public ListConfigsParam listConfigsParam;

    public static ListConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsRequest self = new ListConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigsRequest setListConfigsParam(ListConfigsParam listConfigsParam) {
        this.listConfigsParam = listConfigsParam;
        return this;
    }
    public ListConfigsParam getListConfigsParam() {
        return this.listConfigsParam;
    }

}
