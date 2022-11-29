// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class Release extends TeaModel {
    @NameInMap("appConfig")
    public java.util.Map<String, ?> appConfig;

    @NameInMap("codeVersion")
    public ReleaseCodeVersion codeVersion;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("output")
    public java.util.Map<String, ?> output;

    @NameInMap("status")
    public String status;

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

    public Release setOutput(java.util.Map<String, ?> output) {
        this.output = output;
        return this;
    }
    public java.util.Map<String, ?> getOutput() {
        return this.output;
    }

    public Release setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Release setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public static class ReleaseCodeVersion extends TeaModel {
        @NameInMap("branch")
        public String branch;

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

}
