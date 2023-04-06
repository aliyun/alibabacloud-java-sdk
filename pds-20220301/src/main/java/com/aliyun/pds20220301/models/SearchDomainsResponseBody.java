// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDomainsResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<Domain> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static SearchDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDomainsResponseBody self = new SearchDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDomainsResponseBody setItems(java.util.List<Domain> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Domain> getItems() {
        return this.items;
    }

    public SearchDomainsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
