// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUseraccountRequest extends TeaModel {
    @NameInMap("Accounts")
    public String accounts;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutUseraccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUseraccountRequest self = new QueryLinkeBahamutUseraccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUseraccountRequest setAccounts(String accounts) {
        this.accounts = accounts;
        return this;
    }
    public String getAccounts() {
        return this.accounts;
    }

    public QueryLinkeBahamutUseraccountRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
