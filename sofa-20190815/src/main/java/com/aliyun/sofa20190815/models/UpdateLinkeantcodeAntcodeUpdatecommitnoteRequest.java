// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("LabelsRepeatList")
    public java.util.List<String> labelsRepeatList;

    @NameInMap("Note")
    public String note;

    @NameInMap("NoteId")
    public String noteId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Sha")
    public String sha;

    @NameInMap("State")
    public String state;

    public static UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }
    public String getSha() {
        return this.sha;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
