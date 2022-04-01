// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionsRequest extends TeaModel {
    @NameInMap("listMainVersionsParam")
    public ListMainVersionsParam listMainVersionsParam;

    public static ListMainVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsRequest self = new ListMainVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsRequest setListMainVersionsParam(ListMainVersionsParam listMainVersionsParam) {
        this.listMainVersionsParam = listMainVersionsParam;
        return this;
    }
    public ListMainVersionsParam getListMainVersionsParam() {
        return this.listMainVersionsParam;
    }

}
