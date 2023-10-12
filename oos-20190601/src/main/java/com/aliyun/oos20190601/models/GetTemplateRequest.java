// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the template. The name can be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (\_). The name cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version of the template. The default value is the latest version of the template.</p>
     */
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
