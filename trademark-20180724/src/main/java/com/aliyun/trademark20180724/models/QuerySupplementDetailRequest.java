// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySupplementDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static QuerySupplementDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplementDetailRequest self = new QuerySupplementDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupplementDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
