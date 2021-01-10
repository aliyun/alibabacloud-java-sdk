// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSBuildConfigRequest extends TeaModel {
    @NameInMap("AppBuildName")
    public String appBuildName;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CompileDir")
    public String compileDir;

    @NameInMap("CompileDockerfile")
    public String compileDockerfile;

    @NameInMap("DockerCredential")
    public java.util.List<UpdateAKSBuildConfigRequestDockerCredential> dockerCredential;

    @NameInMap("ExternalDockerCredential")
    public String externalDockerCredential;

    @NameInMap("ExternalImageName")
    public String externalImageName;

    @NameInMap("GitlabAccessId")
    public String gitlabAccessId;

    @NameInMap("GitlabAccessToken")
    public String gitlabAccessToken;

    @NameInMap("ScmUrl")
    public String scmUrl;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSBuildConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSBuildConfigRequest self = new UpdateAKSBuildConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSBuildConfigRequest setAppBuildName(String appBuildName) {
        this.appBuildName = appBuildName;
        return this;
    }
    public String getAppBuildName() {
        return this.appBuildName;
    }

    public UpdateAKSBuildConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAKSBuildConfigRequest setCompileDir(String compileDir) {
        this.compileDir = compileDir;
        return this;
    }
    public String getCompileDir() {
        return this.compileDir;
    }

    public UpdateAKSBuildConfigRequest setCompileDockerfile(String compileDockerfile) {
        this.compileDockerfile = compileDockerfile;
        return this;
    }
    public String getCompileDockerfile() {
        return this.compileDockerfile;
    }

    public UpdateAKSBuildConfigRequest setDockerCredential(java.util.List<UpdateAKSBuildConfigRequestDockerCredential> dockerCredential) {
        this.dockerCredential = dockerCredential;
        return this;
    }
    public java.util.List<UpdateAKSBuildConfigRequestDockerCredential> getDockerCredential() {
        return this.dockerCredential;
    }

    public UpdateAKSBuildConfigRequest setExternalDockerCredential(String externalDockerCredential) {
        this.externalDockerCredential = externalDockerCredential;
        return this;
    }
    public String getExternalDockerCredential() {
        return this.externalDockerCredential;
    }

    public UpdateAKSBuildConfigRequest setExternalImageName(String externalImageName) {
        this.externalImageName = externalImageName;
        return this;
    }
    public String getExternalImageName() {
        return this.externalImageName;
    }

    public UpdateAKSBuildConfigRequest setGitlabAccessId(String gitlabAccessId) {
        this.gitlabAccessId = gitlabAccessId;
        return this;
    }
    public String getGitlabAccessId() {
        return this.gitlabAccessId;
    }

    public UpdateAKSBuildConfigRequest setGitlabAccessToken(String gitlabAccessToken) {
        this.gitlabAccessToken = gitlabAccessToken;
        return this;
    }
    public String getGitlabAccessToken() {
        return this.gitlabAccessToken;
    }

    public UpdateAKSBuildConfigRequest setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
        return this;
    }
    public String getScmUrl() {
        return this.scmUrl;
    }

    public UpdateAKSBuildConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSBuildConfigRequestDockerCredential extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Password")
        public String password;

        @NameInMap("User")
        public String user;

        public static UpdateAKSBuildConfigRequestDockerCredential build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSBuildConfigRequestDockerCredential self = new UpdateAKSBuildConfigRequestDockerCredential();
            return TeaModel.build(map, self);
        }

        public UpdateAKSBuildConfigRequestDockerCredential setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateAKSBuildConfigRequestDockerCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateAKSBuildConfigRequestDockerCredential setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
