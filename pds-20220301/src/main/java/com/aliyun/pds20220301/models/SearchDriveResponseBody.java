// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDriveResponseBody extends TeaModel {
    /**
     * <p>The list of drives.</p>
     */
    @NameInMap("items")
    public java.util.List<Drive> items;

    /**
     * <p>The token used to retrieve the next page of results. This parameter is not returned when all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
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
