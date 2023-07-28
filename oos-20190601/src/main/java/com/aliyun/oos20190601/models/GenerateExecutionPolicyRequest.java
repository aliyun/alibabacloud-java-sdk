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
