// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskcoveragenodesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ParentId")
    public String parentId;

    public static QueryLinkeLinkaTaskcoveragenodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskcoveragenodesRequest self = new QueryLinkeLinkaTaskcoveragenodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskcoveragenodesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeLinkaTaskcoveragenodesRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
