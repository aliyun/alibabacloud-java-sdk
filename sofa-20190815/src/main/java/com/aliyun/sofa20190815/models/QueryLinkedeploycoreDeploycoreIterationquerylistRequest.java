// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreIterationquerylistRequest extends TeaModel {
    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreIterationquerylistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreIterationquerylistRequest self = new QueryLinkedeploycoreDeploycoreIterationquerylistRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
