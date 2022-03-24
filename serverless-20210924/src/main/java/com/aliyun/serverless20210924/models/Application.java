// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    // 是否直接跳过plan直接进行发布
    @NameInMap("autoDeploy")
    public String autoDeploy;

    // 应用创建时间
    @NameInMap("createdTime")
    public String createdTime;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 环境变量
    @NameInMap("envVars")
    public java.util.Map<String, ?> envVars;

    // 指定本地代码源
    @NameInMap("localSource")
    public String localSource;

    // 应用名称，同账号下唯一，创建后不允许变更
    @NameInMap("name")
    public String name;

    // 指定OSS的代码源
    @NameInMap("ossSource")
    public ApplicationOssSource ossSource;

    // 应用参数，schema由应用模板所定义
    @NameInMap("parameter")
    public java.util.Map<String, ?> parameter;

    // 指定仓库的代码源
    @NameInMap("repoSource")
    public ApplicationRepoSource repoSource;

    // 指定role进行角色扮演
    @NameInMap("roleArn")
    public String roleArn;

    // 关联的模板，用于Web应用、模板应用的创建
    @NameInMap("template")
    public String template;

    // 触发配置，不指定表示手动触发
    @NameInMap("trigger")
    public ApplicationTrigger trigger;

    // 阿里云主账号ID，只读
    @NameInMap("uid")
    public String uid;

    // 应用更新时间
    @NameInMap("updatedTime")
    public String updatedTime;

    // s.yaml所在目录，不指定则默认使用当前目录
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

    public Application setLocalSource(String localSource) {
        this.localSource = localSource;
        return this;
    }
    public String getLocalSource() {
        return this.localSource;
    }

    public Application setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Application setOssSource(ApplicationOssSource ossSource) {
        this.ossSource = ossSource;
        return this;
    }
    public ApplicationOssSource getOssSource() {
        return this.ossSource;
    }

    public Application setParameter(java.util.Map<String, ?> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, ?> getParameter() {
        return this.parameter;
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

    public Application setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
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

    public static class ApplicationOssSource extends TeaModel {
        // OSS Bucket名字
        @NameInMap("bucketName")
        public String bucketName;

        // OSS Object名字
        @NameInMap("objectName")
        public String objectName;

        public static ApplicationOssSource build(java.util.Map<String, ?> map) throws Exception {
            ApplicationOssSource self = new ApplicationOssSource();
            return TeaModel.build(map, self);
        }

        public ApplicationOssSource setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ApplicationOssSource setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class ApplicationRepoSource extends TeaModel {
        // 代码库owner
        @NameInMap("owner")
        public String owner;

        // 代码源VCS
        @NameInMap("provider")
        public String provider;

        // 代码库名称
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
        // 代码分支
        @NameInMap("branch")
        public java.util.List<String> branch;

        // 触发条件
        @NameInMap("on")
        public String on;

        // 代码路径。指定时，只有当匹配的path变化才触发
        @NameInMap("paths")
        public java.util.List<String> paths;

        public static ApplicationTrigger build(java.util.Map<String, ?> map) throws Exception {
            ApplicationTrigger self = new ApplicationTrigger();
            return TeaModel.build(map, self);
        }

        public ApplicationTrigger setBranch(java.util.List<String> branch) {
            this.branch = branch;
            return this;
        }
        public java.util.List<String> getBranch() {
            return this.branch;
        }

        public ApplicationTrigger setOn(String on) {
            this.on = on;
            return this;
        }
        public String getOn() {
            return this.on;
        }

        public ApplicationTrigger setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

    }

}
