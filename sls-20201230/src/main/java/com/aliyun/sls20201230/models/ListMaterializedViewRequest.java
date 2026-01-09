// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListMaterializedViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewRequest self = new ListMaterializedViewRequest();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMaterializedViewRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListMaterializedViewRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
