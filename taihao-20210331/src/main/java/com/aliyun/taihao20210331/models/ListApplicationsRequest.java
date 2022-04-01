// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    // listApplicationsParam
    @NameInMap("listApplicationsParam")
    public ListApplicationsParam listApplicationsParam;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setListApplicationsParam(ListApplicationsParam listApplicationsParam) {
        this.listApplicationsParam = listApplicationsParam;
        return this;
    }
    public ListApplicationsParam getListApplicationsParam() {
        return this.listApplicationsParam;
    }

}
