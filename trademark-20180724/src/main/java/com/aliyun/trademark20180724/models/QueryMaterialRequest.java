// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMaterialRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("QueryUnconfirmedInfo")
    public Boolean queryUnconfirmedInfo;

    public static QueryMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialRequest self = new QueryMaterialRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryMaterialRequest setQueryUnconfirmedInfo(Boolean queryUnconfirmedInfo) {
        this.queryUnconfirmedInfo = queryUnconfirmedInfo;
        return this;
    }
    public Boolean getQueryUnconfirmedInfo() {
        return this.queryUnconfirmedInfo;
    }

}
