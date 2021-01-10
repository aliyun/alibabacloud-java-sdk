// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody extends TeaModel {
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
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult result;

    public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBody setResult(GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult self = new GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setExtraDiv(String extraDiv) {
            this.extraDiv = extraDiv;
            return this;
        }
        public String getExtraDiv() {
            return this.extraDiv;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setIterationName(String iterationName) {
            this.iterationName = iterationName;
            return this;
        }
        public String getIterationName() {
            return this.iterationName;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setMergeRequestId(Long mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public Long getMergeRequestId() {
            return this.mergeRequestId;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setMergeRequestIid(Long mergeRequestIid) {
            this.mergeRequestIid = mergeRequestIid;
            return this;
        }
        public Long getMergeRequestIid() {
            return this.mergeRequestIid;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setMrState(String mrState) {
            this.mrState = mrState;
            return this;
        }
        public String getMrState() {
            return this.mrState;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setMrType(String mrType) {
            this.mrType = mrType;
            return this;
        }
        public String getMrType() {
            return this.mrType;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setMrWebUrl(String mrWebUrl) {
            this.mrWebUrl = mrWebUrl;
            return this;
        }
        public String getMrWebUrl() {
            return this.mrWebUrl;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setPipelineExecutionStatus(String pipelineExecutionStatus) {
            this.pipelineExecutionStatus = pipelineExecutionStatus;
            return this;
        }
        public String getPipelineExecutionStatus() {
            return this.pipelineExecutionStatus;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setPipelineTag(String pipelineTag) {
            this.pipelineTag = pipelineTag;
            return this;
        }
        public String getPipelineTag() {
            return this.pipelineTag;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setReviewed(Boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }
        public Boolean getReviewed() {
            return this.reviewed;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setShowState(Boolean showState) {
            this.showState = showState;
            return this;
        }
        public Boolean getShowState() {
            return this.showState;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setTimelimeComparingTime(Long timelimeComparingTime) {
            this.timelimeComparingTime = timelimeComparingTime;
            return this;
        }
        public Long getTimelimeComparingTime() {
            return this.timelimeComparingTime;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setTriggerByAdmin(Boolean triggerByAdmin) {
            this.triggerByAdmin = triggerByAdmin;
            return this;
        }
        public Boolean getTriggerByAdmin() {
            return this.triggerByAdmin;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setPipelineExecutionVOS(java.util.List<String> pipelineExecutionVOS) {
            this.pipelineExecutionVOS = pipelineExecutionVOS;
            return this;
        }
        public java.util.List<String> getPipelineExecutionVOS() {
            return this.pipelineExecutionVOS;
        }

        public GetLinkeBahamutPipelinesgetreleasejarpipelineexecutionsbygroupandidResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

    }

}
