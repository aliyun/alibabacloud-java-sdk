// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDriveResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<Drive> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDriveResponseBody self = new ListDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDriveResponseBody setItems(java.util.List<Drive> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    public ListDriveResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
