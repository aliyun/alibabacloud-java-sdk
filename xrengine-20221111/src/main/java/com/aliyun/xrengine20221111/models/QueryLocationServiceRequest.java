// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryLocationServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static QueryLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationServiceRequest self = new QueryLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLocationServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLocationServiceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
