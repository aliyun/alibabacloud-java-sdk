// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("IterationId")
    public String iterationId;

    public static QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest self = new QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

}
