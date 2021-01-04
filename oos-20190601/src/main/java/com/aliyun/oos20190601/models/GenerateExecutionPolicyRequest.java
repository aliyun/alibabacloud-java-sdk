// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateExecutionPolicyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GenerateExecutionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateExecutionPolicyRequest self = new GenerateExecutionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateExecutionPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateExecutionPolicyRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GenerateExecutionPolicyRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
