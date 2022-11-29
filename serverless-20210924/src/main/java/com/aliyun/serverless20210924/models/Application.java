// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    @NameInMap("autoDeploy")
    public String autoDeploy;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("envVars")
    public java.util.Map<String, ?> envVars;

    @NameInMap("lastRelease")
    public java.util.Map<String, ?> lastRelease;

    @NameInMap("name")
    public String name;

    @NameInMap("output")
    public java.util.Map<String, ?> output;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("repoSource")
    public ApplicationRepoSource repoSource;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("template")
    public String template;

    @NameInMap("trigger")
    public ApplicationTrigger trigger;

    @NameInMap("updatedTime")
    public String updatedTime;

    @NameInMap("workDir")
    public String workDir;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
    }

    public Application setAutoDeploy(String autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }
    public String getAutoDeploy() {
        return this.autoDeploy;
    }

    public Application setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Application setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Application setEnvVars(java.util.Map<String, ?> envVars) {
        this.envVars = envVars;
        return this;
    }
    public java.util.Map<String, ?> getEnvVars() {
        return this.envVars;
    }

    public Application setLastRelease(java.util.Map<String, ?> lastRelease) {
        this.lastRelease = lastRelease;
        return this;
    }
    public java.util.Map<String, ?> getLastRelease() {
        return this.lastRelease;
    }

    public Application setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Application setOutput(java.util.Map<String, ?> output) {
        this.output = output;
        return this;
    }
    public java.util.Map<String, ?> getOutput() {
        return this.output;
    }

    public Application setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public Application setRepoSource(ApplicationRepoSource repoSource) {
        this.repoSource = repoSource;
        return this;
    }
    public ApplicationRepoSource getRepoSource() {
        return this.repoSource;
    }

    public Application setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public Application setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public Application setTrigger(ApplicationTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public ApplicationTrigger getTrigger() {
        return this.trigger;
    }

    public Application setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public Application setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

    public static class ApplicationRepoSource extends TeaModel {
        @NameInMap("owner")
        public String owner;

        @NameInMap("provider")
        public String provider;

        @NameInMap("repo")
        public String repo;

        public static ApplicationRepoSource build(java.util.Map<String, ?> map) throws Exception {
            ApplicationRepoSource self = new ApplicationRepoSource();
            return TeaModel.build(map, self);
        }

        public ApplicationRepoSource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ApplicationRepoSource setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ApplicationRepoSource setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

    }

    public static class ApplicationTrigger extends TeaModel {
        @NameInMap("branch")
        public String branch;

        @NameInMap("commit")
        public String commit;

        @NameInMap("on")
        public String on;

        public static ApplicationTrigger build(java.util.Map<String, ?> map) throws Exception {
            ApplicationTrigger self = new ApplicationTrigger();
            return TeaModel.build(map, self);
        }

        public ApplicationTrigger setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ApplicationTrigger setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public ApplicationTrigger setOn(String on) {
            this.on = on;
            return this;
        }
        public String getOn() {
            return this.on;
        }

    }

}
