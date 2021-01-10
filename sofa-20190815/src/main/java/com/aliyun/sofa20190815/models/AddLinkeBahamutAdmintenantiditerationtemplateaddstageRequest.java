// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest extends TeaModel {
    @NameInMap("AddFormJsonStr")
    public String addFormJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest self = new AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest setAddFormJsonStr(String addFormJsonStr) {
        this.addFormJsonStr = addFormJsonStr;
        return this;
    }
    public String getAddFormJsonStr() {
        return this.addFormJsonStr;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
