// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyGroupDriveResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<Drive> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListMyGroupDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupDriveResponseBody self = new ListMyGroupDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyGroupDriveResponseBody setItems(java.util.List<Drive> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    public ListMyGroupDriveResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
