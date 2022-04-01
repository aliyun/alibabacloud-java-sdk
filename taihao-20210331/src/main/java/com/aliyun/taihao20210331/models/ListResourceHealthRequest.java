// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthRequest extends TeaModel {
    // listResourceHealthParam
    @NameInMap("listResourceHealthParam")
    public ListResourceHealthParam listResourceHealthParam;

    public static ListResourceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthRequest self = new ListResourceHealthRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthRequest setListResourceHealthParam(ListResourceHealthParam listResourceHealthParam) {
        this.listResourceHealthParam = listResourceHealthParam;
        return this;
    }
    public ListResourceHealthParam getListResourceHealthParam() {
        return this.listResourceHealthParam;
    }

}
