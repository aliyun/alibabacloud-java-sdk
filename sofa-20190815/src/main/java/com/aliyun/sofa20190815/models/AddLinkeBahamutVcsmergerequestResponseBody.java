// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutVcsmergerequestResponseBody extends TeaModel {
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
    public AddLinkeBahamutVcsmergerequestResponseBodyResult result;

    public static AddLinkeBahamutVcsmergerequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutVcsmergerequestResponseBody self = new AddLinkeBahamutVcsmergerequestResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutVcsmergerequestResponseBody setResult(AddLinkeBahamutVcsmergerequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutVcsmergerequestResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutVcsmergerequestResponseBodyResult extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Author")
        public String author;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("TargetProjectId")
        public Long targetProjectId;

        @NameInMap("CanMergeClick")
        public Boolean canMergeClick;

        @NameInMap("Description")
        public String description;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Iid")
        public Long iid;

        @NameInMap("MergeStatus")
        public String mergeStatus;

        public static AddLinkeBahamutVcsmergerequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutVcsmergerequestResponseBodyResult self = new AddLinkeBahamutVcsmergerequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setCanMergeClick(Boolean canMergeClick) {
            this.canMergeClick = canMergeClick;
            return this;
        }
        public Boolean getCanMergeClick() {
            return this.canMergeClick;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public AddLinkeBahamutVcsmergerequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

    }

}
