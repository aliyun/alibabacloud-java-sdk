// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest extends TeaModel {
    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("DiffId")
    public String diffId;

    @NameInMap("DiscussionId")
    public String discussionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("LeftLineNum")
    public String leftLineNum;

    @NameInMap("LineCode")
    public String lineCode;

    @NameInMap("Note")
    public String note;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("RightLineNum")
    public String rightLineNum;

    @NameInMap("StartSha")
    public String startSha;

    @NameInMap("Type")
    public String type;

    @NameInMap("LabelsRepeatList")
    public java.util.List<String> labelsRepeatList;

    @NameInMap("PathRepeatList")
    public java.util.List<String> pathRepeatList;

    public static AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest self = new AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setDiffId(String diffId) {
        this.diffId = diffId;
        return this;
    }
    public String getDiffId() {
        return this.diffId;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public String getDiscussionId() {
        return this.discussionId;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setLeftLineNum(String leftLineNum) {
        this.leftLineNum = leftLineNum;
        return this;
    }
    public String getLeftLineNum() {
        return this.leftLineNum;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setRightLineNum(String rightLineNum) {
        this.rightLineNum = rightLineNum;
        return this;
    }
    public String getRightLineNum() {
        return this.rightLineNum;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }
    public String getStartSha() {
        return this.startSha;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsRequest setPathRepeatList(java.util.List<String> pathRepeatList) {
        this.pathRepeatList = pathRepeatList;
        return this;
    }
    public java.util.List<String> getPathRepeatList() {
        return this.pathRepeatList;
    }

}
