// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchUserResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<User> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static SearchUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchUserResponseBody self = new SearchUserResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchUserResponseBody setItems(java.util.List<User> items) {
        this.items = items;
        return this;
    }
    public java.util.List<User> getItems() {
        return this.items;
    }

    public SearchUserResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
