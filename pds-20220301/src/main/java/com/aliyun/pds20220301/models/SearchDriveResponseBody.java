// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDriveResponseBody extends TeaModel {
    /**
     * <p>The information about the drives.</p>
     */
    @NameInMap("items")
    public java.util.List<Drive> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static SearchDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDriveResponseBody self = new SearchDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDriveResponseBody setItems(java.util.List<Drive> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    public SearchDriveResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
