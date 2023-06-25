// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchStoriesResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<Story> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static SearchStoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchStoriesResponseBody self = new SearchStoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchStoriesResponseBody setItems(java.util.List<Story> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Story> getItems() {
        return this.items;
    }

    public SearchStoriesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
