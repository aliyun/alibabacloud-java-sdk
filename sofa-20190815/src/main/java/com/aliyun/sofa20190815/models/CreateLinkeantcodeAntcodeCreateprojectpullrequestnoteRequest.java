// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest extends TeaModel {
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

    @NameInMap("Notify")
    public String notify;

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

    public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setDiffId(String diffId) {
        this.diffId = diffId;
        return this;
    }
    public String getDiffId() {
        return this.diffId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public String getDiscussionId() {
        return this.discussionId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setLeftLineNum(String leftLineNum) {
        this.leftLineNum = leftLineNum;
        return this;
    }
    public String getLeftLineNum() {
        return this.leftLineNum;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setRightLineNum(String rightLineNum) {
        this.rightLineNum = rightLineNum;
        return this;
    }
    public String getRightLineNum() {
        return this.rightLineNum;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }
    public String getStartSha() {
        return this.startSha;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteRequest setPathRepeatList(java.util.List<String> pathRepeatList) {
        this.pathRepeatList = pathRepeatList;
        return this;
    }
    public java.util.List<String> getPathRepeatList() {
        return this.pathRepeatList;
    }

}
