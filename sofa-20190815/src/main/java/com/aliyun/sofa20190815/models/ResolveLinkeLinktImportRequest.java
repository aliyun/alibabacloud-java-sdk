// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResolveLinkeLinktImportRequest extends TeaModel {
    @NameInMap("Link")
    public String link;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateId")
    public String templateId;

    public static ResolveLinkeLinktImportRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveLinkeLinktImportRequest self = new ResolveLinkeLinktImportRequest();
        return TeaModel.build(map, self);
    }

    public ResolveLinkeLinktImportRequest setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public ResolveLinkeLinktImportRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ResolveLinkeLinktImportRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
