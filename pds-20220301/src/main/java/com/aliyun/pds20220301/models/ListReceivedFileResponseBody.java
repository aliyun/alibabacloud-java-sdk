// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListReceivedFileResponseBody extends TeaModel {
    /**
     * <p>A list of file objects.</p>
     */
    @NameInMap("items")
    public java.util.List<File> items;

    /**
     * <p>The pagination marker for the next page of results. Pass this value in the marker parameter of a subsequent request to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eym***</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListReceivedFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedFileResponseBody self = new ListReceivedFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReceivedFileResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public ListReceivedFileResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
