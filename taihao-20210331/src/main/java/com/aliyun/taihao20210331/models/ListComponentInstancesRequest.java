// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentInstancesRequest extends TeaModel {
    // listComponentsParam
    @NameInMap("listComponentInstancesParam")
    public ListComponentInstancesParam listComponentInstancesParam;

    public static ListComponentInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesRequest self = new ListComponentInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesRequest setListComponentInstancesParam(ListComponentInstancesParam listComponentInstancesParam) {
        this.listComponentInstancesParam = listComponentInstancesParam;
        return this;
    }
    public ListComponentInstancesParam getListComponentInstancesParam() {
        return this.listComponentInstancesParam;
    }

}
