// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSBuildRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DockerSecurityBenchmark")
    public Boolean dockerSecurityBenchmark;

    @NameInMap("ScmBranch")
    public String scmBranch;

    @NameInMap("ScmUrl")
    public String scmUrl;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("BuildArgs")
    public java.util.List<ExecAKSBuildRequestBuildArgs> buildArgs;

    public static ExecAKSBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSBuildRequest self = new ExecAKSBuildRequest();
        return TeaModel.build(map, self);
    }

    public ExecAKSBuildRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecAKSBuildRequest setDockerSecurityBenchmark(Boolean dockerSecurityBenchmark) {
        this.dockerSecurityBenchmark = dockerSecurityBenchmark;
        return this;
    }
    public Boolean getDockerSecurityBenchmark() {
        return this.dockerSecurityBenchmark;
    }

    public ExecAKSBuildRequest setScmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
        return this;
    }
    public String getScmBranch() {
        return this.scmBranch;
    }

    public ExecAKSBuildRequest setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
        return this;
    }
    public String getScmUrl() {
        return this.scmUrl;
    }

    public ExecAKSBuildRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ExecAKSBuildRequest setBuildArgs(java.util.List<ExecAKSBuildRequestBuildArgs> buildArgs) {
        this.buildArgs = buildArgs;
        return this;
    }
    public java.util.List<ExecAKSBuildRequestBuildArgs> getBuildArgs() {
        return this.buildArgs;
    }

    public static class ExecAKSBuildRequestBuildArgs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ExecAKSBuildRequestBuildArgs build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSBuildRequestBuildArgs self = new ExecAKSBuildRequestBuildArgs();
            return TeaModel.build(map, self);
        }

        public ExecAKSBuildRequestBuildArgs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecAKSBuildRequestBuildArgs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
