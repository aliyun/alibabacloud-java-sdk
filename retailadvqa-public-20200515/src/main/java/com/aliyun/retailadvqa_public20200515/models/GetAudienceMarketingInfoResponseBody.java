// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetAudienceMarketingInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetAudienceMarketingInfoResponseBodyData data;

    public static GetAudienceMarketingInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudienceMarketingInfoResponseBody self = new GetAudienceMarketingInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudienceMarketingInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudienceMarketingInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAudienceMarketingInfoResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public GetAudienceMarketingInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public GetAudienceMarketingInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAudienceMarketingInfoResponseBody setData(GetAudienceMarketingInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudienceMarketingInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Status")
        public String status;

        public static GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs build(java.util.Map<String, ?> map) throws Exception {
            GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs self = new GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs();
            return TeaModel.build(map, self);
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("MarketType")
        public String marketType;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks build(java.util.Map<String, ?> map) throws Exception {
            GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks self = new GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks();
            return TeaModel.build(map, self);
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setMarketType(String marketType) {
            this.marketType = marketType;
            return this;
        }
        public String getMarketType() {
            return this.marketType;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

    public static class GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel extends TeaModel {
        @NameInMap("HasMarketingJob")
        public Boolean hasMarketingJob;

        @NameInMap("HasMarketingTask")
        public Boolean hasMarketingTask;

        @NameInMap("MarketingMainAudienceId")
        public String marketingMainAudienceId;

        @NameInMap("MarketingJobs")
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs> marketingJobs;

        @NameInMap("MarketingTasks")
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks> marketingTasks;

        public static GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel build(java.util.Map<String, ?> map) throws Exception {
            GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel self = new GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel();
            return TeaModel.build(map, self);
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel setHasMarketingJob(Boolean hasMarketingJob) {
            this.hasMarketingJob = hasMarketingJob;
            return this;
        }
        public Boolean getHasMarketingJob() {
            return this.hasMarketingJob;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel setHasMarketingTask(Boolean hasMarketingTask) {
            this.hasMarketingTask = hasMarketingTask;
            return this;
        }
        public Boolean getHasMarketingTask() {
            return this.hasMarketingTask;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel setMarketingMainAudienceId(String marketingMainAudienceId) {
            this.marketingMainAudienceId = marketingMainAudienceId;
            return this;
        }
        public String getMarketingMainAudienceId() {
            return this.marketingMainAudienceId;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel setMarketingJobs(java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs> marketingJobs) {
            this.marketingJobs = marketingJobs;
            return this;
        }
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingJobs> getMarketingJobs() {
            return this.marketingJobs;
        }

        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel setMarketingTasks(java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks> marketingTasks) {
            this.marketingTasks = marketingTasks;
            return this;
        }
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModelMarketingTasks> getMarketingTasks() {
            return this.marketingTasks;
        }

    }

    public static class GetAudienceMarketingInfoResponseBodyDataContent extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LatestDataModifyTime")
        public String latestDataModifyTime;

        @NameInMap("LatestDataModifyStatus")
        public String latestDataModifyStatus;

        @NameInMap("NumberOfAudiences")
        public Long numberOfAudiences;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DefaultMappingType")
        public String defaultMappingType;

        @NameInMap("SmsMarketingModel")
        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel smsMarketingModel;

        public static GetAudienceMarketingInfoResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetAudienceMarketingInfoResponseBodyDataContent self = new GetAudienceMarketingInfoResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setLatestDataModifyTime(String latestDataModifyTime) {
            this.latestDataModifyTime = latestDataModifyTime;
            return this;
        }
        public String getLatestDataModifyTime() {
            return this.latestDataModifyTime;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setLatestDataModifyStatus(String latestDataModifyStatus) {
            this.latestDataModifyStatus = latestDataModifyStatus;
            return this;
        }
        public String getLatestDataModifyStatus() {
            return this.latestDataModifyStatus;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setDefaultMappingType(String defaultMappingType) {
            this.defaultMappingType = defaultMappingType;
            return this;
        }
        public String getDefaultMappingType() {
            return this.defaultMappingType;
        }

        public GetAudienceMarketingInfoResponseBodyDataContent setSmsMarketingModel(GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel smsMarketingModel) {
            this.smsMarketingModel = smsMarketingModel;
            return this;
        }
        public GetAudienceMarketingInfoResponseBodyDataContentSmsMarketingModel getSmsMarketingModel() {
            return this.smsMarketingModel;
        }

    }

    public static class GetAudienceMarketingInfoResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("Content")
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContent> content;

        public static GetAudienceMarketingInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudienceMarketingInfoResponseBodyData self = new GetAudienceMarketingInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudienceMarketingInfoResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetAudienceMarketingInfoResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAudienceMarketingInfoResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public GetAudienceMarketingInfoResponseBodyData setContent(java.util.List<GetAudienceMarketingInfoResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetAudienceMarketingInfoResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
