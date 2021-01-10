// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvquerydeploymodeRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreEnvquerydeploymodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvquerydeploymodeRequest self = new QueryLinkedeploycoreDeploycoreEnvquerydeploymodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvquerydeploymodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
