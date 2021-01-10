// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaTaskcoverageRequest extends TeaModel {
    @NameInMap("Branch")
    public String branch;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ClassesFile")
    public String classesFile;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("CoverageFileRepeatList")
    public java.util.List<String> coverageFileRepeatList;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("Excludes")
    public String excludes;

    @NameInMap("GitUrl")
    public String gitUrl;

    @NameInMap("Group")
    public String group;

    @NameInMap("Source")
    public String source;

    @NameInMap("StartCommitId")
    public String startCommitId;

    public static UploadLinkeLinkaTaskcoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaTaskcoverageRequest self = new UploadLinkeLinkaTaskcoverageRequest();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaTaskcoverageRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UploadLinkeLinkaTaskcoverageRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadLinkeLinkaTaskcoverageRequest setClassesFile(String classesFile) {
        this.classesFile = classesFile;
        return this;
    }
    public String getClassesFile() {
        return this.classesFile;
    }

    public UploadLinkeLinkaTaskcoverageRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UploadLinkeLinkaTaskcoverageRequest setCoverageFileRepeatList(java.util.List<String> coverageFileRepeatList) {
        this.coverageFileRepeatList = coverageFileRepeatList;
        return this;
    }
    public java.util.List<String> getCoverageFileRepeatList() {
        return this.coverageFileRepeatList;
    }

    public UploadLinkeLinkaTaskcoverageRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public UploadLinkeLinkaTaskcoverageRequest setExcludes(String excludes) {
        this.excludes = excludes;
        return this;
    }
    public String getExcludes() {
        return this.excludes;
    }

    public UploadLinkeLinkaTaskcoverageRequest setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }
    public String getGitUrl() {
        return this.gitUrl;
    }

    public UploadLinkeLinkaTaskcoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UploadLinkeLinkaTaskcoverageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UploadLinkeLinkaTaskcoverageRequest setStartCommitId(String startCommitId) {
        this.startCommitId = startCommitId;
        return this;
    }
    public String getStartCommitId() {
        return this.startCommitId;
    }

}
