// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateDashboardRequest extends TeaModel {
    @NameInMap("body")
    public Dashboard body;

    public static CreateDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDashboardRequest self = new CreateDashboardRequest();
        return TeaModel.build(map, self);
    }

    public CreateDashboardRequest setBody(Dashboard body) {
        this.body = body;
        return this;
    }
    public Dashboard getBody() {
        return this.body;
    }

}
