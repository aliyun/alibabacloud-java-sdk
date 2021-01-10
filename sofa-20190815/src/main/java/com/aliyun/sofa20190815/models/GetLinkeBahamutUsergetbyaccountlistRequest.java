// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyaccountlistRequest extends TeaModel {
    @NameInMap("AccountListRepeatList")
    public java.util.List<String> accountListRepeatList;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutUsergetbyaccountlistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyaccountlistRequest self = new GetLinkeBahamutUsergetbyaccountlistRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyaccountlistRequest setAccountListRepeatList(java.util.List<String> accountListRepeatList) {
        this.accountListRepeatList = accountListRepeatList;
        return this;
    }
    public java.util.List<String> getAccountListRepeatList() {
        return this.accountListRepeatList;
    }

    public GetLinkeBahamutUsergetbyaccountlistRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
