// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyDrivesResponseBody extends TeaModel {
    /**
     * <p>The list of Drives.</p>
     */
    @NameInMap("items")
    public java.util.List<Drive> items;

    /**
     * <p>The pagination token to retrieve the next page of results. This parameter is empty when no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListMyDrivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyDrivesResponseBody self = new ListMyDrivesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyDrivesResponseBody setItems(java.util.List<Drive> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    public ListMyDrivesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
