// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Release extends TeaModel {
    // 本次发布的应用快照，只读
    @NameInMap("appConfig")
    public java.util.Map<String, ?> appConfig;

    // 代码版本，不指定则使用最新的commit
    @NameInMap("codeVersion")
    public ReleaseCodeVersion codeVersion;

    // 创建时间，只读
    @NameInMap("createdTime")
    public String createdTime;

    // 本地发布描述
    @NameInMap("description")
    public String description;

    // 完成时间，只读
    @NameInMap("finishedTime")
    public String finishedTime;

    // 本次发布的输出，只读
    @NameInMap("output")
    public java.util.Map<String, ?> output;

    // 流水线配置，不指定则直接部署
    @NameInMap("pipeline")
    public ReleasePipeline pipeline;

    // 本地发布状态：published: 发布完成 publishing：发布中 failed：发布失败 canceled：已撤销
    @NameInMap("status")
    public String status;

    // 阿里云主账号ID，只读
    @NameInMap("uid")
    public String uid;

    // 本次发布版本号，由系统生成，只读
    @NameInMap("versionId")
    public Long versionId;

    public static Release build(java.util.Map<String, ?> map) throws Exception {
        Release self = new Release();
        return TeaModel.build(map, self);
    }

    public Release setAppConfig(java.util.Map<String, ?> appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public java.util.Map<String, ?> getAppConfig() {
        return this.appConfig;
    }

    public Release setCodeVersion(ReleaseCodeVersion codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public ReleaseCodeVersion getCodeVersion() {
        return this.codeVersion;
    }

    public Release setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Release setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Release setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public Release setOutput(java.util.Map<String, ?> output) {
        this.output = output;
        return this;
    }
    public java.util.Map<String, ?> getOutput() {
        return this.output;
    }

    public Release setPipeline(ReleasePipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public ReleasePipeline getPipeline() {
        return this.pipeline;
    }

    public Release setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Release setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public Release setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public static class ReleaseCodeVersion extends TeaModel {
        // 代码分支，不指定则使用default分支
        @NameInMap("branch")
        public String branch;

        // commit id
        @NameInMap("commit")
        public String commit;

        public static ReleaseCodeVersion build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCodeVersion self = new ReleaseCodeVersion();
            return TeaModel.build(map, self);
        }

        public ReleaseCodeVersion setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ReleaseCodeVersion setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

    }

    public static class ReleasePipelineStages extends TeaModel {
        // 执行环境
        @NameInMap("environment")
        public String environment;

        // stage名字
        @NameInMap("name")
        public String name;

        public static ReleasePipelineStages build(java.util.Map<String, ?> map) throws Exception {
            ReleasePipelineStages self = new ReleasePipelineStages();
            return TeaModel.build(map, self);
        }

        public ReleasePipelineStages setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ReleasePipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ReleasePipeline extends TeaModel {
        // stage配置
        @NameInMap("stages")
        public java.util.List<ReleasePipelineStages> stages;

        public static ReleasePipeline build(java.util.Map<String, ?> map) throws Exception {
            ReleasePipeline self = new ReleasePipeline();
            return TeaModel.build(map, self);
        }

        public ReleasePipeline setStages(java.util.List<ReleasePipelineStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ReleasePipelineStages> getStages() {
            return this.stages;
        }

    }

}
