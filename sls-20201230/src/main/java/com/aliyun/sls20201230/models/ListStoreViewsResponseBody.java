// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListStoreViewsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("storeviews")
    public java.util.List<String> storeviews;

    @NameInMap("total")
    public Integer total;

    public static ListStoreViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStoreViewsResponseBody self = new ListStoreViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStoreViewsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListStoreViewsResponseBody setStoreviews(java.util.List<String> storeviews) {
        this.storeviews = storeviews;
        return this;
    }
    public java.util.List<String> getStoreviews() {
        return this.storeviews;
    }

    public ListStoreViewsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
