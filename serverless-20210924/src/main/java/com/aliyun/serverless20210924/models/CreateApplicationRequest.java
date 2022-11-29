// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    @NameInMap("description")
    public String description;

    @NameInMap("envVars")
    public java.util.Map<String, String> envVars;

    @NameInMap("name")
    public String name;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("repoSource")
    public RepoSource repoSource;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("template")
    public String template;

    @NameInMap("trigger")
    public TriggerConfig trigger;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setEnvVars(java.util.Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public CreateApplicationRequest setRepoSource(RepoSource repoSource) {
        this.repoSource = repoSource;
        return this;
    }
    public RepoSource getRepoSource() {
        return this.repoSource;
    }

    public CreateApplicationRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateApplicationRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreateApplicationRequest setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }
    public TriggerConfig getTrigger() {
        return this.trigger;
    }

}
