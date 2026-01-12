// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryAreaMapRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static QueryAreaMapRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaMapRequest self = new QueryAreaMapRequest();
        return TeaModel.build(map, self);
    }

    public QueryAreaMapRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryAreaMapRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
