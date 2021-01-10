// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody extends TeaModel {
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
    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult result;

    public static GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody self = new GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBody setResult(GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult self = new GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setExtraDiv(String extraDiv) {
            this.extraDiv = extraDiv;
            return this;
        }
        public String getExtraDiv() {
            return this.extraDiv;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setIterationName(String iterationName) {
            this.iterationName = iterationName;
            return this;
        }
        public String getIterationName() {
            return this.iterationName;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setMergeRequestId(Long mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public Long getMergeRequestId() {
            return this.mergeRequestId;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setMergeRequestIid(Long mergeRequestIid) {
            this.mergeRequestIid = mergeRequestIid;
            return this;
        }
        public Long getMergeRequestIid() {
            return this.mergeRequestIid;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setMrState(String mrState) {
            this.mrState = mrState;
            return this;
        }
        public String getMrState() {
            return this.mrState;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setMrType(String mrType) {
            this.mrType = mrType;
            return this;
        }
        public String getMrType() {
            return this.mrType;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setMrWebUrl(String mrWebUrl) {
            this.mrWebUrl = mrWebUrl;
            return this;
        }
        public String getMrWebUrl() {
            return this.mrWebUrl;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setPipelineExecutionStatus(String pipelineExecutionStatus) {
            this.pipelineExecutionStatus = pipelineExecutionStatus;
            return this;
        }
        public String getPipelineExecutionStatus() {
            return this.pipelineExecutionStatus;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setPipelineTag(String pipelineTag) {
            this.pipelineTag = pipelineTag;
            return this;
        }
        public String getPipelineTag() {
            return this.pipelineTag;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setReviewed(Boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }
        public Boolean getReviewed() {
            return this.reviewed;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setShowState(Boolean showState) {
            this.showState = showState;
            return this;
        }
        public Boolean getShowState() {
            return this.showState;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setTimelimeComparingTime(Long timelimeComparingTime) {
            this.timelimeComparingTime = timelimeComparingTime;
            return this;
        }
        public Long getTimelimeComparingTime() {
            return this.timelimeComparingTime;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setTriggerByAdmin(Boolean triggerByAdmin) {
            this.triggerByAdmin = triggerByAdmin;
            return this;
        }
        public Boolean getTriggerByAdmin() {
            return this.triggerByAdmin;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setPipelineExecutionVOS(java.util.List<String> pipelineExecutionVOS) {
            this.pipelineExecutionVOS = pipelineExecutionVOS;
            return this;
        }
        public java.util.List<String> getPipelineExecutionVOS() {
            return this.pipelineExecutionVOS;
        }

        public GetLinkeBahamutMrgroupgetpipelineexecutionsbygroupandmridResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

    }

}
