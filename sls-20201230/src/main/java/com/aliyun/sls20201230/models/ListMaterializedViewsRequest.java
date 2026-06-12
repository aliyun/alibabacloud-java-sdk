// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewsRequest extends TeaModel {
    /**
     * <p>The name of the materialized view. Fuzzy search is supported.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The position from which to start returning results for pagination. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of materialized views to return. The actual number of returned materialized views may be less than the specified value. If you do not specify this parameter, a system default is used.</p>
     */
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
