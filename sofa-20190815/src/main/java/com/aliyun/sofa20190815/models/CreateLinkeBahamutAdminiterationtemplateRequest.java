// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAdminiterationtemplateRequest extends TeaModel {
    @NameInMap("TemplateGroup")
    public String templateGroup;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateLinkeBahamutAdminiterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAdminiterationtemplateRequest self = new CreateLinkeBahamutAdminiterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAdminiterationtemplateRequest setTemplateGroup(String templateGroup) {
        this.templateGroup = templateGroup;
        return this;
    }
    public String getTemplateGroup() {
        return this.templateGroup;
    }

    public CreateLinkeBahamutAdminiterationtemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
