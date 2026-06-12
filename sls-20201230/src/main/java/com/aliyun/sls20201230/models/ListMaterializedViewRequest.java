// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewRequest extends TeaModel {
    /**
     * <p>The name of the materialized view. Use this to query for a specific materialized view.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of entries to skip before returning results. This parameter is used for pagination. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The maximum number of materialized views to return per page. Default value: 100. Maximum value: 500.</p>
     */
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
