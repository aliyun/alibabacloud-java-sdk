// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSBuildConfigRequest extends TeaModel {
    @NameInMap("AppBuildName")
    public String appBuildName;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CompileDir")
    public String compileDir;

    @NameInMap("CompileDockerfile")
    public String compileDockerfile;

    @NameInMap("ExternalDockerCredential")
    public String externalDockerCredential;

    @NameInMap("ExternalImageName")
    public String externalImageName;

    @NameInMap("GitlabAccessId")
    public String gitlabAccessId;

    @NameInMap("GitlabAccessToken")
    public String gitlabAccessToken;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Region")
    public String region;

    @NameInMap("ScmUrl")
    public String scmUrl;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("DockerCredential")
    public java.util.List<CreateAKSBuildConfigRequestDockerCredential> dockerCredential;

    public static CreateAKSBuildConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSBuildConfigRequest self = new CreateAKSBuildConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSBuildConfigRequest setAppBuildName(String appBuildName) {
        this.appBuildName = appBuildName;
        return this;
    }
    public String getAppBuildName() {
        return this.appBuildName;
    }

    public CreateAKSBuildConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAKSBuildConfigRequest setCompileDir(String compileDir) {
        this.compileDir = compileDir;
        return this;
    }
    public String getCompileDir() {
        return this.compileDir;
    }

    public CreateAKSBuildConfigRequest setCompileDockerfile(String compileDockerfile) {
        this.compileDockerfile = compileDockerfile;
        return this;
    }
    public String getCompileDockerfile() {
        return this.compileDockerfile;
    }

    public CreateAKSBuildConfigRequest setExternalDockerCredential(String externalDockerCredential) {
        this.externalDockerCredential = externalDockerCredential;
        return this;
    }
    public String getExternalDockerCredential() {
        return this.externalDockerCredential;
    }

    public CreateAKSBuildConfigRequest setExternalImageName(String externalImageName) {
        this.externalImageName = externalImageName;
        return this;
    }
    public String getExternalImageName() {
        return this.externalImageName;
    }

    public CreateAKSBuildConfigRequest setGitlabAccessId(String gitlabAccessId) {
        this.gitlabAccessId = gitlabAccessId;
        return this;
    }
    public String getGitlabAccessId() {
        return this.gitlabAccessId;
    }

    public CreateAKSBuildConfigRequest setGitlabAccessToken(String gitlabAccessToken) {
        this.gitlabAccessToken = gitlabAccessToken;
        return this;
    }
    public String getGitlabAccessToken() {
        return this.gitlabAccessToken;
    }

    public CreateAKSBuildConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSBuildConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAKSBuildConfigRequest setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
        return this;
    }
    public String getScmUrl() {
        return this.scmUrl;
    }

    public CreateAKSBuildConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSBuildConfigRequest setDockerCredential(java.util.List<CreateAKSBuildConfigRequestDockerCredential> dockerCredential) {
        this.dockerCredential = dockerCredential;
        return this;
    }
    public java.util.List<CreateAKSBuildConfigRequestDockerCredential> getDockerCredential() {
        return this.dockerCredential;
    }

    public static class CreateAKSBuildConfigRequestDockerCredential extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("User")
        public String user;

        public static CreateAKSBuildConfigRequestDockerCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSBuildConfigRequestDockerCredential self = new CreateAKSBuildConfigRequestDockerCredential();
            return TeaModel.build(map, self);
        }

        public CreateAKSBuildConfigRequestDockerCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAKSBuildConfigRequestDockerCredential setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateAKSBuildConfigRequestDockerCredential setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
