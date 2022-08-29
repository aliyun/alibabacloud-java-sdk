// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFacegroupsResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<FaceGroup> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListFacegroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFacegroupsResponseBody self = new ListFacegroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFacegroupsResponseBody setItems(java.util.List<FaceGroup> items) {
        this.items = items;
        return this;
    }
    public java.util.List<FaceGroup> getItems() {
        return this.items;
    }

    public ListFacegroupsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
