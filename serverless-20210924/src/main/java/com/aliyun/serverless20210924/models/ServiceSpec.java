// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ServiceSpec extends TeaModel {
    @NameInMap("environment")
    public String environment;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("template")
    public String template;

    @NameInMap("templateVariables")
    public java.util.Map<String, ?> templateVariables;

    @NameInMap("templateVersion")
    public Integer templateVersion;

    public static ServiceSpec build(java.util.Map<String, ?> map) throws Exception {
        ServiceSpec self = new ServiceSpec();
        return TeaModel.build(map, self);
    }

    public ServiceSpec setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ServiceSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ServiceSpec setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public ServiceSpec setTemplateVariables(java.util.Map<String, ?> templateVariables) {
        this.templateVariables = templateVariables;
        return this;
    }
    public java.util.Map<String, ?> getTemplateVariables() {
        return this.templateVariables;
    }

    public ServiceSpec setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

}
