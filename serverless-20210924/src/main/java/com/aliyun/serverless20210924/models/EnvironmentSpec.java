// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class EnvironmentSpec extends TeaModel {
    @NameInMap("region")
    public String region;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("template")
    public String template;

    @NameInMap("templateVariables")
    public java.util.Map<String, ?> templateVariables;

    @NameInMap("templateVersion")
    public Integer templateVersion;

    public static EnvironmentSpec build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentSpec self = new EnvironmentSpec();
        return TeaModel.build(map, self);
    }

    public EnvironmentSpec setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public EnvironmentSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public EnvironmentSpec setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public EnvironmentSpec setTemplateVariables(java.util.Map<String, ?> templateVariables) {
        this.templateVariables = templateVariables;
        return this;
    }
    public java.util.Map<String, ?> getTemplateVariables() {
        return this.templateVariables;
    }

    public EnvironmentSpec setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

}
