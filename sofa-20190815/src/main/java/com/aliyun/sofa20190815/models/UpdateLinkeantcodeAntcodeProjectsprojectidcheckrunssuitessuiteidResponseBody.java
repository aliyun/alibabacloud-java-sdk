// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CompletedAt")
    public String completedAt;

    @NameInMap("Conclusion")
    public String conclusion;

    @NameInMap("Context")
    public String context;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("DetailUrl")
    public String detailUrl;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("StartedAt")
    public String startedAt;

    @NameInMap("Status")
    public String status;

    @NameInMap("SuiteId")
    public Long suiteId;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateAt")
    public String updateAt;

    @NameInMap("Annotations")
    public java.util.List<UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations> annotations;

    public static UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody self = new UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }
    public String getDetailUrl() {
        return this.detailUrl;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setSuiteId(Long suiteId) {
        this.suiteId = suiteId;
        return this;
    }
    public Long getSuiteId() {
        return this.suiteId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }
    public String getUpdateAt() {
        return this.updateAt;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBody setAnnotations(java.util.List<UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public static class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations extends TeaModel {
        @NameInMap("CheckRunId")
        public Long checkRunId;

        @NameInMap("Details")
        public String details;

        @NameInMap("EndCol")
        public Long endCol;

        @NameInMap("EndLine")
        public Long endLine;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Path")
        public String path;

        @NameInMap("StartCol")
        public Long startCol;

        @NameInMap("StartLine")
        public Long startLine;

        @NameInMap("Title")
        public String title;

        public static UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations self = new UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setCheckRunId(Long checkRunId) {
            this.checkRunId = checkRunId;
            return this;
        }
        public Long getCheckRunId() {
            return this.checkRunId;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setEndCol(Long endCol) {
            this.endCol = endCol;
            return this;
        }
        public Long getEndCol() {
            return this.endCol;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setStartCol(Long startCol) {
            this.startCol = startCol;
            return this;
        }
        public Long getStartCol() {
            return this.startCol;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseBodyAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
