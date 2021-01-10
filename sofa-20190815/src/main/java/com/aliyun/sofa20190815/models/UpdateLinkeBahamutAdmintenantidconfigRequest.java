// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdmintenantidconfigRequest extends TeaModel {
    @NameInMap("ConfigJsonStr")
    public String configJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutAdmintenantidconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdmintenantidconfigRequest self = new UpdateLinkeBahamutAdmintenantidconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdmintenantidconfigRequest setConfigJsonStr(String configJsonStr) {
        this.configJsonStr = configJsonStr;
        return this;
    }
    public String getConfigJsonStr() {
        return this.configJsonStr;
    }

    public UpdateLinkeBahamutAdmintenantidconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
