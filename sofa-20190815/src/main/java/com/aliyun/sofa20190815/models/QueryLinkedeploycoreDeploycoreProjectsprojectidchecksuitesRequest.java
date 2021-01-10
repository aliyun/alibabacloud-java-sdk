// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesRequest self = new QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
