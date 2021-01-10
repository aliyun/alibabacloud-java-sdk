// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUsersbyacountRequest extends TeaModel {
    @NameInMap("Accounts")
    public String accounts;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutUsersbyacountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUsersbyacountRequest self = new QueryLinkeBahamutUsersbyacountRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUsersbyacountRequest setAccounts(String accounts) {
        this.accounts = accounts;
        return this;
    }
    public String getAccounts() {
        return this.accounts;
    }

    public QueryLinkeBahamutUsersbyacountRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
