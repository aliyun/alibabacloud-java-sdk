// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryDigitalHumanProjectRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static QueryDigitalHumanProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalHumanProjectRequest self = new QueryDigitalHumanProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalHumanProjectRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public QueryDigitalHumanProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
