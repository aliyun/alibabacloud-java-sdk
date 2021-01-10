// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody extends TeaModel {
    @NameInMap("DiscussionId")
    public Long discussionId;

    @NameInMap("StDiff")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff stDiff;

    @NameInMap("LatestStDiff")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff latestStDiff;

    @NameInMap("Discussions")
    public java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions> discussions;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("LineCode")
    public String lineCode;

    @NameInMap("Url")
    public String url;

    @NameInMap("NoteableType")
    public String noteableType;

    @NameInMap("System")
    public Boolean system;

    @NameInMap("ResolvedAt")
    public String resolvedAt;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("IsAward")
    public Boolean isAward;

    @NameInMap("LineType")
    public String lineType;

    @NameInMap("Outdated")
    public Boolean outdated;

    @NameInMap("Path")
    public String path;

    @NameInMap("NoteableId")
    public Long noteableId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Type")
    public String type;

    @NameInMap("ResolvedBy")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy resolvedBy;

    @NameInMap("State")
    public String state;

    @NameInMap("Note")
    public String note;

    @NameInMap("Author")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public Long getDiscussionId() {
        return this.discussionId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setStDiff(CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff stDiff) {
        this.stDiff = stDiff;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff getStDiff() {
        return this.stDiff;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setLatestStDiff(CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff latestStDiff) {
        this.latestStDiff = latestStDiff;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff getLatestStDiff() {
        return this.latestStDiff;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setDiscussions(java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions> discussions) {
        this.discussions = discussions;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions> getDiscussions() {
        return this.discussions;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setNoteableType(String noteableType) {
        this.noteableType = noteableType;
        return this;
    }
    public String getNoteableType() {
        return this.noteableType;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }
    public String getResolvedAt() {
        return this.resolvedAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setIsAward(Boolean isAward) {
        this.isAward = isAward;
        return this;
    }
    public Boolean getIsAward() {
        return this.isAward;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setOutdated(Boolean outdated) {
        this.outdated = outdated;
        return this;
    }
    public Boolean getOutdated() {
        return this.outdated;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setNoteableId(Long noteableId) {
        this.noteableId = noteableId;
        return this;
    }
    public Long getNoteableId() {
        return this.noteableId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setResolvedBy(CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy getResolvedBy() {
        return this.resolvedBy;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setAuthor(CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff extends TeaModel {
        @NameInMap("CharsetName")
        public String charsetName;

        @NameInMap("AddLineNum")
        public Long addLineNum;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("HighlightedDiff")
        public String highlightedDiff;

        @NameInMap("BinaryFile")
        public Boolean binaryFile;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("BMode")
        public String BMode;

        @NameInMap("Amode")
        public String amode;

        @NameInMap("CompareDiffId")
        public Long compareDiffId;

        @NameInMap("DelLineNum")
        public Long delLineNum;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("Bmode")
        public String bmode;

        @NameInMap("TooLarge")
        public Boolean tooLarge;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("Id")
        public Long id;

        @NameInMap("AMode")
        public String AMode;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff extends TeaModel {
        @NameInMap("CharsetName")
        public String charsetName;

        @NameInMap("AddLineNum")
        public Long addLineNum;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("HighlightedDiff")
        public String highlightedDiff;

        @NameInMap("BinaryFile")
        public Boolean binaryFile;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("BMode")
        public String BMode;

        @NameInMap("Amode")
        public String amode;

        @NameInMap("CompareDiffId")
        public Long compareDiffId;

        @NameInMap("DelLineNum")
        public Long delLineNum;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("Bmode")
        public String bmode;

        @NameInMap("TooLarge")
        public Boolean tooLarge;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("Id")
        public Long id;

        @NameInMap("AMode")
        public String AMode;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyLatestStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ResolvedBy")
        public String resolvedBy;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Author")
        public String author;

        @NameInMap("NoteableType")
        public String noteableType;

        @NameInMap("Discussions")
        public java.util.List<String> discussions;

        @NameInMap("StDiff")
        public String stDiff;

        @NameInMap("Note")
        public String note;

        @NameInMap("NoteableId")
        public Long noteableId;

        @NameInMap("ResolvedAt")
        public String resolvedAt;

        @NameInMap("LatestStDiff")
        public String latestStDiff;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("State")
        public String state;

        @NameInMap("Outdated")
        public Boolean outdated;

        @NameInMap("IsAward")
        public Boolean isAward;

        @NameInMap("Url")
        public String url;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("DiscussionId")
        public Long discussionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LineType")
        public String lineType;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setResolvedBy(String resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }
        public String getResolvedBy() {
            return this.resolvedBy;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setNoteableType(String noteableType) {
            this.noteableType = noteableType;
            return this;
        }
        public String getNoteableType() {
            return this.noteableType;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setDiscussions(java.util.List<String> discussions) {
            this.discussions = discussions;
            return this;
        }
        public java.util.List<String> getDiscussions() {
            return this.discussions;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setStDiff(String stDiff) {
            this.stDiff = stDiff;
            return this;
        }
        public String getStDiff() {
            return this.stDiff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setNoteableId(Long noteableId) {
            this.noteableId = noteableId;
            return this;
        }
        public Long getNoteableId() {
            return this.noteableId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setLatestStDiff(String latestStDiff) {
            this.latestStDiff = latestStDiff;
            return this;
        }
        public String getLatestStDiff() {
            return this.latestStDiff;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setOutdated(Boolean outdated) {
            this.outdated = outdated;
            return this;
        }
        public Boolean getOutdated() {
            return this.outdated;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setIsAward(Boolean isAward) {
            this.isAward = isAward;
            return this;
        }
        public Boolean getIsAward() {
            return this.isAward;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setDiscussionId(Long discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        public Long getDiscussionId() {
            return this.discussionId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyDiscussions setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyResolvedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
