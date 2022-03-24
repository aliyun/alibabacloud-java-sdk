// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ServiceSpec extends TeaModel {
    // The name of the associated Environment for the Service
    @NameInMap("environment")
    public String environment;

    // The ARN (Aliyun Resource Name) of the role designated by a user to allow the system to manage his Aliyun resources. If null, use roleArn of role AliyunFCDefaultRole.
    @NameInMap("roleArn")
    public String roleArn;

    // The name of the template for the Service
    @NameInMap("template")
    public String template;

    // Variables for specified template
    @NameInMap("templateVariables")
    public java.util.Map<String, ?> templateVariables;

    // The major version of the template. "1" by default.
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
