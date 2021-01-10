// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult> result;

    public static GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody self = new GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBody setResult(java.util.List<GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult extends TeaModel {
        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("Author")
        public String author;

        @NameInMap("Created")
        public Long created;

        @NameInMap("ExtraDiv")
        public String extraDiv;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationName")
        public String iterationName;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("MergeRequestId")
        public Long mergeRequestId;

        @NameInMap("MergeRequestIid")
        public Long mergeRequestIid;

        @NameInMap("MrState")
        public String mrState;

        @NameInMap("MrType")
        public String mrType;

        @NameInMap("MrWebUrl")
        public String mrWebUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("PipelineExecutionStatus")
        public String pipelineExecutionStatus;

        @NameInMap("PipelineTag")
        public String pipelineTag;

        @NameInMap("Reviewed")
        public Boolean reviewed;

        @NameInMap("ShowState")
        public Boolean showState;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("TimelimeComparingTime")
        public Long timelimeComparingTime;

        @NameInMap("TriggerByAdmin")
        public Boolean triggerByAdmin;

        @NameInMap("Type")
        public String type;

        @NameInMap("PipelineExecutionVOS")
        public java.util.List<String> pipelineExecutionVOS;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        public static GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult self = new GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setExtraDiv(String extraDiv) {
            this.extraDiv = extraDiv;
            return this;
        }
        public String getExtraDiv() {
            return this.extraDiv;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setIterationName(String iterationName) {
            this.iterationName = iterationName;
            return this;
        }
        public String getIterationName() {
            return this.iterationName;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setMergeRequestId(Long mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public Long getMergeRequestId() {
            return this.mergeRequestId;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setMergeRequestIid(Long mergeRequestIid) {
            this.mergeRequestIid = mergeRequestIid;
            return this;
        }
        public Long getMergeRequestIid() {
            return this.mergeRequestIid;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setMrState(String mrState) {
            this.mrState = mrState;
            return this;
        }
        public String getMrState() {
            return this.mrState;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setMrType(String mrType) {
            this.mrType = mrType;
            return this;
        }
        public String getMrType() {
            return this.mrType;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setMrWebUrl(String mrWebUrl) {
            this.mrWebUrl = mrWebUrl;
            return this;
        }
        public String getMrWebUrl() {
            return this.mrWebUrl;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setPipelineExecutionStatus(String pipelineExecutionStatus) {
            this.pipelineExecutionStatus = pipelineExecutionStatus;
            return this;
        }
        public String getPipelineExecutionStatus() {
            return this.pipelineExecutionStatus;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setPipelineTag(String pipelineTag) {
            this.pipelineTag = pipelineTag;
            return this;
        }
        public String getPipelineTag() {
            return this.pipelineTag;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setReviewed(Boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }
        public Boolean getReviewed() {
            return this.reviewed;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setShowState(Boolean showState) {
            this.showState = showState;
            return this;
        }
        public Boolean getShowState() {
            return this.showState;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setTimelimeComparingTime(Long timelimeComparingTime) {
            this.timelimeComparingTime = timelimeComparingTime;
            return this;
        }
        public Long getTimelimeComparingTime() {
            return this.timelimeComparingTime;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setTriggerByAdmin(Boolean triggerByAdmin) {
            this.triggerByAdmin = triggerByAdmin;
            return this;
        }
        public Boolean getTriggerByAdmin() {
            return this.triggerByAdmin;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setPipelineExecutionVOS(java.util.List<String> pipelineExecutionVOS) {
            this.pipelineExecutionVOS = pipelineExecutionVOS;
            return this;
        }
        public java.util.List<String> getPipelineExecutionVOS() {
            return this.pipelineExecutionVOS;
        }

        public GetLinkeBahamutPipelinesgettoppipelinesofuserResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

    }

}
