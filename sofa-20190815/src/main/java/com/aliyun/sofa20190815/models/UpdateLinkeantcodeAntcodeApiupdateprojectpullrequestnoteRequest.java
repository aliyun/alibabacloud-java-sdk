// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("LabelsRepeatList")
    public java.util.List<String> labelsRepeatList;

    @NameInMap("Note")
    public String note;

    @NameInMap("NoteId")
    public String noteId;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("State")
    public String state;

    public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
