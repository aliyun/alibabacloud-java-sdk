// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRecyclebinResponseBody extends TeaModel {
    /**
     * <p>The information about the files and folders in the recycle bin.</p>
     */
    @NameInMap("items")
    public java.util.List<File> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListRecyclebinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecyclebinResponseBody self = new ListRecyclebinResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecyclebinResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public ListRecyclebinResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
