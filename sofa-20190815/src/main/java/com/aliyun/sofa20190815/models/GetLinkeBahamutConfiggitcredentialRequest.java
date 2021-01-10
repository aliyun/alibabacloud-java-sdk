// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfiggitcredentialRequest extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Token")
    public String token;

    public static GetLinkeBahamutConfiggitcredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfiggitcredentialRequest self = new GetLinkeBahamutConfiggitcredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfiggitcredentialRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetLinkeBahamutConfiggitcredentialRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
