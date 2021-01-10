// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest self = new QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryglobalRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
