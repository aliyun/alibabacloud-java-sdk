// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("materializedViews")
    public java.util.List<String> materializedViews;

    @NameInMap("total")
    public Integer total;

    public static ListMaterializedViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewsResponseBody self = new ListMaterializedViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMaterializedViewsResponseBody setMaterializedViews(java.util.List<String> materializedViews) {
        this.materializedViews = materializedViews;
        return this;
    }
    public java.util.List<String> getMaterializedViews() {
        return this.materializedViews;
    }

    public ListMaterializedViewsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
