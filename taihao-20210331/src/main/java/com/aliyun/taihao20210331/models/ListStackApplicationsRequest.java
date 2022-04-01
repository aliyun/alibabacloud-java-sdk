// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListStackApplicationsRequest extends TeaModel {
    // ListApplicationParam
    @NameInMap("listStackApplicationParam")
    public ListStackApplicationParam listStackApplicationParam;

    public static ListStackApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackApplicationsRequest self = new ListStackApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackApplicationsRequest setListStackApplicationParam(ListStackApplicationParam listStackApplicationParam) {
        this.listStackApplicationParam = listStackApplicationParam;
        return this;
    }
    public ListStackApplicationParam getListStackApplicationParam() {
        return this.listStackApplicationParam;
    }

}
