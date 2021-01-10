// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreIterationqueryappsRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreIterationqueryappsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreIterationqueryappsRequest self = new QueryLinkedeploycoreDeploycoreIterationqueryappsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreIterationqueryappsRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkedeploycoreDeploycoreIterationqueryappsRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryLinkedeploycoreDeploycoreIterationqueryappsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
