// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaInternalsinglecoverageRequest extends TeaModel {
    @NameInMap("AciMode")
    public Boolean aciMode;

    @NameInMap("AciTenant")
    public String aciTenant;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ClassesFileId")
    public String classesFileId;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("CoverageFileId")
    public String coverageFileId;

    @NameInMap("CustomToken")
    public String customToken;

    @NameInMap("CustomUser")
    public String customUser;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("ExcludesRepeatList")
    public java.util.List<String> excludesRepeatList;

    @NameInMap("GitUrl")
    public String gitUrl;

    @NameInMap("Group")
    public String group;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceKind")
    public String sourceKind;

    @NameInMap("StartCommitId")
    public String startCommitId;

    public static UploadLinkeLinkaInternalsinglecoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaInternalsinglecoverageRequest self = new UploadLinkeLinkaInternalsinglecoverageRequest();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setAciMode(Boolean aciMode) {
        this.aciMode = aciMode;
        return this;
    }
    public Boolean getAciMode() {
        return this.aciMode;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setAciTenant(String aciTenant) {
        this.aciTenant = aciTenant;
        return this;
    }
    public String getAciTenant() {
        return this.aciTenant;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setClassesFileId(String classesFileId) {
        this.classesFileId = classesFileId;
        return this;
    }
    public String getClassesFileId() {
        return this.classesFileId;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setCoverageFileId(String coverageFileId) {
        this.coverageFileId = coverageFileId;
        return this;
    }
    public String getCoverageFileId() {
        return this.coverageFileId;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setCustomToken(String customToken) {
        this.customToken = customToken;
        return this;
    }
    public String getCustomToken() {
        return this.customToken;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setCustomUser(String customUser) {
        this.customUser = customUser;
        return this;
    }
    public String getCustomUser() {
        return this.customUser;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setExcludesRepeatList(java.util.List<String> excludesRepeatList) {
        this.excludesRepeatList = excludesRepeatList;
        return this;
    }
    public java.util.List<String> getExcludesRepeatList() {
        return this.excludesRepeatList;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }
    public String getGitUrl() {
        return this.gitUrl;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setSourceKind(String sourceKind) {
        this.sourceKind = sourceKind;
        return this;
    }
    public String getSourceKind() {
        return this.sourceKind;
    }

    public UploadLinkeLinkaInternalsinglecoverageRequest setStartCommitId(String startCommitId) {
        this.startCommitId = startCommitId;
        return this;
    }
    public String getStartCommitId() {
        return this.startCommitId;
    }

}
