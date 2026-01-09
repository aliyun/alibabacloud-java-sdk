// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("materializedViews")
    public java.util.List<String> materializedViews;

    @NameInMap("total")
    public Integer total;

    public static ListMaterializedViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewResponseBody self = new ListMaterializedViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListMaterializedViewResponseBody setMaterializedViews(java.util.List<String> materializedViews) {
        this.materializedViews = materializedViews;
        return this;
    }
    public java.util.List<String> getMaterializedViews() {
        return this.materializedViews;
    }

    public ListMaterializedViewResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
