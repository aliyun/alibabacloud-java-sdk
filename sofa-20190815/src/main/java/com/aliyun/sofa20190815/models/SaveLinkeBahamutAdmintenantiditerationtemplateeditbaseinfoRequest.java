// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest self = new SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
