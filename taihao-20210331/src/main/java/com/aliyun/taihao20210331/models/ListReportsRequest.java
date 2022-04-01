// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListReportsRequest extends TeaModel {
    @NameInMap("listReportsParam")
    public ListReportsParam listReportsParam;

    public static ListReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportsRequest self = new ListReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListReportsRequest setListReportsParam(ListReportsParam listReportsParam) {
        this.listReportsParam = listReportsParam;
        return this;
    }
    public ListReportsParam getListReportsParam() {
        return this.listReportsParam;
    }

}
