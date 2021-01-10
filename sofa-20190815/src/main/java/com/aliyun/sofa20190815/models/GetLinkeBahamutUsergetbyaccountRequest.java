// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyaccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutUsergetbyaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyaccountRequest self = new GetLinkeBahamutUsergetbyaccountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyaccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetLinkeBahamutUsergetbyaccountRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
