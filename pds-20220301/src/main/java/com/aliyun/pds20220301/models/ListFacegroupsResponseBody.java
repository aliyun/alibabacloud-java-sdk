// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFacegroupsResponseBody extends TeaModel {
    /**
     * <p>The list of face groups.</p>
     */
    @NameInMap("items")
    public java.util.List<FaceGroup> items;

    /**
     * <p>The pagination token for the next page of results. This parameter is empty on the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    /**
     * <p>The total count of matched face groups. This parameter is returned only when <code>return_total_count</code> in the request is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("total_count")
    public Long totalCount;

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

    public ListFacegroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
