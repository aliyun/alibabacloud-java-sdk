// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentsRequest extends TeaModel {
    // listComponentsParam
    @NameInMap("listComponentsParam")
    public ListComponentsParam listComponentsParam;

    public static ListComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsRequest self = new ListComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentsRequest setListComponentsParam(ListComponentsParam listComponentsParam) {
        this.listComponentsParam = listComponentsParam;
        return this;
    }
    public ListComponentsParam getListComponentsParam() {
        return this.listComponentsParam;
    }

}
