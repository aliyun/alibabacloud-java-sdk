// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDetailbytypeResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricDetailbytypeResponseBodyData> data;

    public static QueryLinkefabricFabricDetailbytypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDetailbytypeResponseBody self = new QueryLinkefabricFabricDetailbytypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricDetailbytypeResponseBody setData(java.util.List<QueryLinkefabricFabricDetailbytypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricDetailbytypeResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricDetailbytypeResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricDetailbytypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricDetailbytypeResponseBodyData self = new QueryLinkefabricFabricDetailbytypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setCommonState(String commonState) {
            this.commonState = commonState;
            return this;
        }
        public String getCommonState() {
            return this.commonState;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setExecuteDesc(String executeDesc) {
            this.executeDesc = executeDesc;
            return this;
        }
        public String getExecuteDesc() {
            return this.executeDesc;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setTaskInfo(String taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public String getTaskInfo() {
            return this.taskInfo;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setTaskUrl(String taskUrl) {
            this.taskUrl = taskUrl;
            return this;
        }
        public String getTaskUrl() {
            return this.taskUrl;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryLinkefabricFabricDetailbytypeResponseBodyData setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

}
