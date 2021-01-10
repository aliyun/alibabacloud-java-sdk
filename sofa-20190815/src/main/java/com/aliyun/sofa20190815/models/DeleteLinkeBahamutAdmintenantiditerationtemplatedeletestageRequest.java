// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest extends TeaModel {
    @NameInMap("DelFormJsonStr")
    public String delFormJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest self = new DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest setDelFormJsonStr(String delFormJsonStr) {
        this.delFormJsonStr = delFormJsonStr;
        return this;
    }
    public String getDelFormJsonStr() {
        return this.delFormJsonStr;
    }

    public DeleteLinkeBahamutAdmintenantiditerationtemplatedeletestageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
