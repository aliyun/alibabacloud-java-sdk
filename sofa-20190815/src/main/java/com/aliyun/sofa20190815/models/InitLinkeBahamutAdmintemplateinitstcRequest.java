// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAdmintemplateinitstcRequest extends TeaModel {
    @NameInMap("Opo")
    public String opo;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static InitLinkeBahamutAdmintemplateinitstcRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAdmintemplateinitstcRequest self = new InitLinkeBahamutAdmintemplateinitstcRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAdmintemplateinitstcRequest setOpo(String opo) {
        this.opo = opo;
        return this;
    }
    public String getOpo() {
        return this.opo;
    }

    public InitLinkeBahamutAdmintemplateinitstcRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public InitLinkeBahamutAdmintemplateinitstcRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InitLinkeBahamutAdmintemplateinitstcRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
