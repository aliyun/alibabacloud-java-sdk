// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvqueryproducthostRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreEnvqueryproducthostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvqueryproducthostRequest self = new QueryLinkedeploycoreDeploycoreEnvqueryproducthostRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryproducthostRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
