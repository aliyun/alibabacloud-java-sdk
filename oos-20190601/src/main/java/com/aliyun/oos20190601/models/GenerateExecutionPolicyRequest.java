// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateExecutionPolicyRequest extends TeaModel {
    /**
     * <p>The RAM role.</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The content of the template in the JSON or YAML format. This parameter is the same as the Content parameter that you can specify when you call the CreateTemplate operation. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version of the template. The default value is the latest version of the template.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GenerateExecutionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateExecutionPolicyRequest self = new GenerateExecutionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateExecutionPolicyRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public GenerateExecutionPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateExecutionPolicyRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
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
