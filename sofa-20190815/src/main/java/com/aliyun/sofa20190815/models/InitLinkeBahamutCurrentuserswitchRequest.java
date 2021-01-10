// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutCurrentuserswitchRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserAccounts")
    public String userAccounts;

    public static InitLinkeBahamutCurrentuserswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutCurrentuserswitchRequest self = new InitLinkeBahamutCurrentuserswitchRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutCurrentuserswitchRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

    public InitLinkeBahamutCurrentuserswitchRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InitLinkeBahamutCurrentuserswitchRequest setUserAccounts(String userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }
    public String getUserAccounts() {
        return this.userAccounts;
    }

}
