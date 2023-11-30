// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ScanFileResponseBody extends TeaModel {
    /**
     * <p>The information about the files.</p>
     */
    @NameInMap("items")
    public java.util.List<File> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ScanFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanFileResponseBody self = new ScanFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanFileResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public ScanFileResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
