// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeSnippetnoteResponseBody extends TeaModel {
    @NameInMap("DiscussionId")
    public Long discussionId;

    @NameInMap("StDiff")
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff stDiff;

    @NameInMap("LatestStDiff")
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff latestStDiff;

    @NameInMap("Discussions")
    public java.util.List<CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions> discussions;

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
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy resolvedBy;

    @NameInMap("State")
    public String state;

    @NameInMap("Note")
    public String note;

    @NameInMap("Author")
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeSnippetnoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeSnippetnoteResponseBody self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public Long getDiscussionId() {
        return this.discussionId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setStDiff(CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff stDiff) {
        this.stDiff = stDiff;
        return this;
    }
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff getStDiff() {
        return this.stDiff;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setLatestStDiff(CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff latestStDiff) {
        this.latestStDiff = latestStDiff;
        return this;
    }
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff getLatestStDiff() {
        return this.latestStDiff;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setDiscussions(java.util.List<CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions> discussions) {
        this.discussions = discussions;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions> getDiscussions() {
        return this.discussions;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setNoteableType(String noteableType) {
        this.noteableType = noteableType;
        return this;
    }
    public String getNoteableType() {
        return this.noteableType;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }
    public String getResolvedAt() {
        return this.resolvedAt;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setIsAward(Boolean isAward) {
        this.isAward = isAward;
        return this;
    }
    public Boolean getIsAward() {
        return this.isAward;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setOutdated(Boolean outdated) {
        this.outdated = outdated;
        return this;
    }
    public Boolean getOutdated() {
        return this.outdated;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setNoteableId(Long noteableId) {
        this.noteableId = noteableId;
        return this;
    }
    public Long getNoteableId() {
        return this.noteableId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setResolvedBy(CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy getResolvedBy() {
        return this.resolvedBy;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setAuthor(CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

    }

    public static class CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyLatestStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

    }

    public static class CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setResolvedBy(String resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }
        public String getResolvedBy() {
            return this.resolvedBy;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setNoteableType(String noteableType) {
            this.noteableType = noteableType;
            return this;
        }
        public String getNoteableType() {
            return this.noteableType;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setDiscussions(java.util.List<String> discussions) {
            this.discussions = discussions;
            return this;
        }
        public java.util.List<String> getDiscussions() {
            return this.discussions;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setStDiff(String stDiff) {
            this.stDiff = stDiff;
            return this;
        }
        public String getStDiff() {
            return this.stDiff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setNoteableId(Long noteableId) {
            this.noteableId = noteableId;
            return this;
        }
        public Long getNoteableId() {
            return this.noteableId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setLatestStDiff(String latestStDiff) {
            this.latestStDiff = latestStDiff;
            return this;
        }
        public String getLatestStDiff() {
            return this.latestStDiff;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setOutdated(Boolean outdated) {
            this.outdated = outdated;
            return this;
        }
        public Boolean getOutdated() {
            return this.outdated;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setIsAward(Boolean isAward) {
            this.isAward = isAward;
            return this;
        }
        public Boolean getIsAward() {
            return this.isAward;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setDiscussionId(Long discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        public Long getDiscussionId() {
            return this.discussionId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyDiscussions setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

    }

    public static class CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyResolvedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor self = new CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeSnippetnoteResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
