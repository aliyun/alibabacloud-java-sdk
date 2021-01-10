// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengettenantsRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    public static GetLinkeBahamutOpengettenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengettenantsRequest self = new GetLinkeBahamutOpengettenantsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengettenantsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
