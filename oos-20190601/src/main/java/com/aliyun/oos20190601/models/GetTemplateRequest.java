// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
