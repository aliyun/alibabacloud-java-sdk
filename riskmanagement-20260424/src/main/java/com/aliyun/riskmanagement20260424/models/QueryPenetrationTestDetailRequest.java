// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryPenetrationTestDetailRequest extends TeaModel {
    /**
     * <p>The unique ID of the application record.</p>
     * <blockquote>
     * <p>This field is of the Long type. Precision loss may occur when you serialize or deserialize the value. Make sure that the value does not exceed 9007199254740991.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2398</p>
     */
    @NameInMap("Id")
    public Long id;

    public static QueryPenetrationTestDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPenetrationTestDetailRequest self = new QueryPenetrationTestDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryPenetrationTestDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
