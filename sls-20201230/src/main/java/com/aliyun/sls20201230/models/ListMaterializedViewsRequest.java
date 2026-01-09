// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewsRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListMaterializedViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewsRequest self = new ListMaterializedViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMaterializedViewsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListMaterializedViewsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
