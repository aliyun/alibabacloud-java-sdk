// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvquerytypeRequest extends TeaModel {
    @NameInMap("EnvName")
    public String envName;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreEnvquerytypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvquerytypeRequest self = new QueryLinkedeploycoreDeploycoreEnvquerytypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
