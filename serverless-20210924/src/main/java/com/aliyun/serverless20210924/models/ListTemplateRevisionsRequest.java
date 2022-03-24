// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListTemplateRevisionsRequest extends TeaModel {
    // The name of a template.
    @NameInMap("templateName")
    public String templateName;

    // The major version of the template. "1" by default.
    @NameInMap("templateVersion")
    public Integer templateVersion;

    public static ListTemplateRevisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateRevisionsRequest self = new ListTemplateRevisionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateRevisionsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplateRevisionsRequest setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

}
