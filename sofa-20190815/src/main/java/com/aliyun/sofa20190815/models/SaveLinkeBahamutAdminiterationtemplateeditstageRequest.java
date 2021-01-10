// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminiterationtemplateeditstageRequest extends TeaModel {
    @NameInMap("EditFormJsonStr")
    public String editFormJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static SaveLinkeBahamutAdminiterationtemplateeditstageRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminiterationtemplateeditstageRequest self = new SaveLinkeBahamutAdminiterationtemplateeditstageRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageRequest setEditFormJsonStr(String editFormJsonStr) {
        this.editFormJsonStr = editFormJsonStr;
        return this;
    }
    public String getEditFormJsonStr() {
        return this.editFormJsonStr;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
