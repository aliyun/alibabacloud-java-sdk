// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterScriptDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetClusterScriptDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScriptDetailResponseBody self = new GetClusterScriptDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterScriptDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClusterScriptDetailResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetClusterScriptDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterScriptDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterScriptDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // clusterId
        @NameInMap("clusterId")
        public String clusterId;

        // clusterScriptArgs
        @NameInMap("clusterScriptArgs")
        public String clusterScriptArgs;

        // clusterScriptContent
        @NameInMap("clusterScriptContent")
        public String clusterScriptContent;

        // clusterScriptContentSpec
        @NameInMap("clusterScriptContentSpec")
        public String clusterScriptContentSpec;

        // clusterScriptId
        @NameInMap("clusterScriptId")
        public String clusterScriptId;

        // clusterScriptName
        @NameInMap("clusterScriptName")
        public String clusterScriptName;

        // clusterScriptPath
        @NameInMap("clusterScriptPath")
        public String clusterScriptPath;

        // clusterScriptType
        @NameInMap("clusterScriptType")
        public String clusterScriptType;

        // executeFailStrategy
        @NameInMap("executeFailStrategy")
        public String executeFailStrategy;

        // executeMoment
        @NameInMap("executeMoment")
        public String executeMoment;

        // executeScope
        @NameInMap("executeScope")
        public String executeScope;

        // executeScopeParams
        @NameInMap("executeScopeParams")
        public String executeScopeParams;

        // lastEditTime
        @NameInMap("lastEditTime")
        public Long lastEditTime;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setClusterScriptArgs(String clusterScriptArgs) {
            this.clusterScriptArgs = clusterScriptArgs;
            return this;
        }
        public String getClusterScriptArgs() {
            return this.clusterScriptArgs;
        }

        public Data setClusterScriptContent(String clusterScriptContent) {
            this.clusterScriptContent = clusterScriptContent;
            return this;
        }
        public String getClusterScriptContent() {
            return this.clusterScriptContent;
        }

        public Data setClusterScriptContentSpec(String clusterScriptContentSpec) {
            this.clusterScriptContentSpec = clusterScriptContentSpec;
            return this;
        }
        public String getClusterScriptContentSpec() {
            return this.clusterScriptContentSpec;
        }

        public Data setClusterScriptId(String clusterScriptId) {
            this.clusterScriptId = clusterScriptId;
            return this;
        }
        public String getClusterScriptId() {
            return this.clusterScriptId;
        }

        public Data setClusterScriptName(String clusterScriptName) {
            this.clusterScriptName = clusterScriptName;
            return this;
        }
        public String getClusterScriptName() {
            return this.clusterScriptName;
        }

        public Data setClusterScriptPath(String clusterScriptPath) {
            this.clusterScriptPath = clusterScriptPath;
            return this;
        }
        public String getClusterScriptPath() {
            return this.clusterScriptPath;
        }

        public Data setClusterScriptType(String clusterScriptType) {
            this.clusterScriptType = clusterScriptType;
            return this;
        }
        public String getClusterScriptType() {
            return this.clusterScriptType;
        }

        public Data setExecuteFailStrategy(String executeFailStrategy) {
            this.executeFailStrategy = executeFailStrategy;
            return this;
        }
        public String getExecuteFailStrategy() {
            return this.executeFailStrategy;
        }

        public Data setExecuteMoment(String executeMoment) {
            this.executeMoment = executeMoment;
            return this;
        }
        public String getExecuteMoment() {
            return this.executeMoment;
        }

        public Data setExecuteScope(String executeScope) {
            this.executeScope = executeScope;
            return this;
        }
        public String getExecuteScope() {
            return this.executeScope;
        }

        public Data setExecuteScopeParams(String executeScopeParams) {
            this.executeScopeParams = executeScopeParams;
            return this;
        }
        public String getExecuteScopeParams() {
            return this.executeScopeParams;
        }

        public Data setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

    }

}
