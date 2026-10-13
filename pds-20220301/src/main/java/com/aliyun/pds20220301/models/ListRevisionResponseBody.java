// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRevisionResponseBody extends TeaModel {
    /**
     * <p>An array of revision objects.</p>
     */
    @NameInMap("items")
    public java.util.List<Revision> items;

    /**
     * <p>The pagination marker for the next page of results. If this parameter is empty, it indicates that all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRevisionResponseBody self = new ListRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRevisionResponseBody setItems(java.util.List<Revision> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Revision> getItems() {
        return this.items;
    }

    public ListRevisionResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
