// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminiterationtemplateRequest extends TeaModel {
    @NameInMap("IterationTemplateJsonStr")
    public String iterationTemplateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static AddLinkeBahamutAdminiterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminiterationtemplateRequest self = new AddLinkeBahamutAdminiterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminiterationtemplateRequest setIterationTemplateJsonStr(String iterationTemplateJsonStr) {
        this.iterationTemplateJsonStr = iterationTemplateJsonStr;
        return this;
    }
    public String getIterationTemplateJsonStr() {
        return this.iterationTemplateJsonStr;
    }

    public AddLinkeBahamutAdminiterationtemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
