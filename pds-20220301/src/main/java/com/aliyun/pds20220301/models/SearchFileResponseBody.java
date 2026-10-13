// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFileResponseBody extends TeaModel {
    /**
     * <p>List of file information.</p>
     */
    @NameInMap("items")
    public java.util.List<File> items;

    /**
     * <p>The identity of the starting resource on the next page. This value is empty on the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    /**
     * <p>Total number of files that match the search.</p>
     * 
     * <strong>example:</strong>
     * <p>1022</p>
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
