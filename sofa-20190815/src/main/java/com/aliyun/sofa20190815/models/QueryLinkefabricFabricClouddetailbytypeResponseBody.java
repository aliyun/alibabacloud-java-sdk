// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricClouddetailbytypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricClouddetailbytypeResponseBodyData> data;

    public static QueryLinkefabricFabricClouddetailbytypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricClouddetailbytypeResponseBody self = new QueryLinkefabricFabricClouddetailbytypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricClouddetailbytypeResponseBody setData(java.util.List<QueryLinkefabricFabricClouddetailbytypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricClouddetailbytypeResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricClouddetailbytypeResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CommonState")
        public String commonState;

        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("Env")
        public String env;

        @NameInMap("EnvDisplayName")
        public String envDisplayName;

        @NameInMap("ExecuteDesc")
        public String executeDesc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("TaskInfo")
        public String taskInfo;

        @NameInMap("TaskState")
        public String taskState;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskUrl")
        public String taskUrl;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UtcModified")
        public Long utcModified;

        public static QueryLinkefabricFabricClouddetailbytypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricClouddetailbytypeResponseBodyData self = new QueryLinkefabricFabricClouddetailbytypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setCommonState(String commonState) {
            this.commonState = commonState;
            return this;
        }
        public String getCommonState() {
            return this.commonState;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setExecuteDesc(String executeDesc) {
            this.executeDesc = executeDesc;
            return this;
        }
        public String getExecuteDesc() {
            return this.executeDesc;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setTaskInfo(String taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public String getTaskInfo() {
            return this.taskInfo;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setTaskUrl(String taskUrl) {
            this.taskUrl = taskUrl;
            return this;
        }
        public String getTaskUrl() {
            return this.taskUrl;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkefabricFabricClouddetailbytypeResponseBodyData setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

}
