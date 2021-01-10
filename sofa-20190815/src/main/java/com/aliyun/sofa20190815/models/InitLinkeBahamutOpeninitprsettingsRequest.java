// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutOpeninitprsettingsRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static InitLinkeBahamutOpeninitprsettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutOpeninitprsettingsRequest self = new InitLinkeBahamutOpeninitprsettingsRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutOpeninitprsettingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
