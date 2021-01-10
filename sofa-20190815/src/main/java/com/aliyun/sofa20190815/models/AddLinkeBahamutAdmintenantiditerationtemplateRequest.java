// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmintenantiditerationtemplateRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("TenantId")
    public String tenantId;

    public static AddLinkeBahamutAdmintenantiditerationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmintenantiditerationtemplateRequest self = new AddLinkeBahamutAdmintenantiditerationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
