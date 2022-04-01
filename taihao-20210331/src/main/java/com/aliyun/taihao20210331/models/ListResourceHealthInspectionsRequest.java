// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsRequest extends TeaModel {
    // listResourceHealthInspectionsParam
    @NameInMap("listResourceHealthInspectionsParam")
    public ListResourceHealthParam listResourceHealthInspectionsParam;

    public static ListResourceHealthInspectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsRequest self = new ListResourceHealthInspectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsRequest setListResourceHealthInspectionsParam(ListResourceHealthParam listResourceHealthInspectionsParam) {
        this.listResourceHealthInspectionsParam = listResourceHealthInspectionsParam;
        return this;
    }
    public ListResourceHealthParam getListResourceHealthInspectionsParam() {
        return this.listResourceHealthInspectionsParam;
    }

}
