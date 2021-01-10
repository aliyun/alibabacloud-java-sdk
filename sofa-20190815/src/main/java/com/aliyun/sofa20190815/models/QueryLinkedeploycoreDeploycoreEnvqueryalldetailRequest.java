// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvqueryalldetailRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkedeploycoreDeploycoreEnvqueryalldetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvqueryalldetailRequest self = new QueryLinkedeploycoreDeploycoreEnvqueryalldetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryalldetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
