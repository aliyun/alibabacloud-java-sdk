// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppqueryallRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreAppqueryallRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppqueryallRequest self = new QueryLinkedeploycoreDeploycoreAppqueryallRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppqueryallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
