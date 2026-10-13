// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupResponseBody extends TeaModel {
    /**
     * <p>A list of group objects.</p>
     */
    @NameInMap("items")
    public java.util.List<Group> items;

    /**
     * <p>The token that you can use to retrieve the next page of results. This parameter is not returned if all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupResponseBody self = new ListGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupResponseBody setItems(java.util.List<Group> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Group> getItems() {
        return this.items;
    }

    public ListGroupResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
