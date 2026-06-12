// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewsResponseBody extends TeaModel {
    /**
     * <p>The number of materialized views returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>An array of materialized view names.</p>
     */
    @NameInMap("materializedViews")
    public java.util.List<String> materializedViews;

    /**
     * <p>The total number of materialized views that match the query.</p>
     */
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
