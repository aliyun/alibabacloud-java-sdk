// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletecommitnoteRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("NoteId")
    public String noteId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Sha")
    public String sha;

    public static DeleteLinkeantcodeAntcodeDeletecommitnoteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletecommitnoteRequest self = new DeleteLinkeantcodeAntcodeDeletecommitnoteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteRequest setSha(String sha) {
        this.sha = sha;
        return this;
    }
    public String getSha() {
        return this.sha;
    }

}
