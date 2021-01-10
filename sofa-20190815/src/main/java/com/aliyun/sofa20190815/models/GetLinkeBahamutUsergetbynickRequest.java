// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbynickRequest extends TeaModel {
    @NameInMap("Nick")
    public String nick;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutUsergetbynickRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbynickRequest self = new GetLinkeBahamutUsergetbynickRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbynickRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GetLinkeBahamutUsergetbynickRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
