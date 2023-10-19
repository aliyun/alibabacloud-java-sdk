// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFileResponseBody extends TeaModel {
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

    /**
     * <p>The total number of retrieved files.</p>
     */
    @NameInMap("total_count")
    public Long totalCount;

    public static SearchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFileResponseBody self = new SearchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFileResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public SearchFileResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public SearchFileResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
