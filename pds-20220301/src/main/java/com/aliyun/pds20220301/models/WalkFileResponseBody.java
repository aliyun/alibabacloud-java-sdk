// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class WalkFileResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<File> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static WalkFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WalkFileResponseBody self = new WalkFileResponseBody();
        return TeaModel.build(map, self);
    }

    public WalkFileResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public WalkFileResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
