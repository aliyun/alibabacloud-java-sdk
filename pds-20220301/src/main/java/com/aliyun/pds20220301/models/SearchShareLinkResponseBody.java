// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchShareLinkResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<ShareLink> items;

    @NameInMap("next_marker")
    public String nextMarker;

    @NameInMap("total_count")
    public Long totalCount;

    public static SearchShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchShareLinkResponseBody self = new SearchShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchShareLinkResponseBody setItems(java.util.List<ShareLink> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ShareLink> getItems() {
        return this.items;
    }

    public SearchShareLinkResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public SearchShareLinkResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
