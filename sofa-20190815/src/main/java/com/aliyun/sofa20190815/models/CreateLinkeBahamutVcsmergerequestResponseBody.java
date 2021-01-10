// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsmergerequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CreateLinkeBahamutVcsmergerequestResponseBodyResult result;

    public static CreateLinkeBahamutVcsmergerequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsmergerequestResponseBody self = new CreateLinkeBahamutVcsmergerequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeBahamutVcsmergerequestResponseBody setResult(CreateLinkeBahamutVcsmergerequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeBahamutVcsmergerequestResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeBahamutVcsmergerequestResponseBodyResult extends TeaModel {
        @NameInMap("Reviewed")
        public Boolean reviewed;

        @NameInMap("State")
        public String state;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Author")
        public String author;

        @NameInMap("MergeCommitSha")
        public String mergeCommitSha;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("TargetProjectId")
        public Long targetProjectId;

        @NameInMap("SourceProjectId")
        public Long sourceProjectId;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Review")
        public String review;

        @NameInMap("Description")
        public String description;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MergeStatus")
        public String mergeStatus;

        @NameInMap("Iid")
        public Long iid;

        public static CreateLinkeBahamutVcsmergerequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeBahamutVcsmergerequestResponseBodyResult self = new CreateLinkeBahamutVcsmergerequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setReviewed(Boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }
        public Boolean getReviewed() {
            return this.reviewed;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setMergeCommitSha(String mergeCommitSha) {
            this.mergeCommitSha = mergeCommitSha;
            return this;
        }
        public String getMergeCommitSha() {
            return this.mergeCommitSha;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setReview(String review) {
            this.review = review;
            return this;
        }
        public String getReview() {
            return this.review;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public CreateLinkeBahamutVcsmergerequestResponseBodyResult setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

    }

}
