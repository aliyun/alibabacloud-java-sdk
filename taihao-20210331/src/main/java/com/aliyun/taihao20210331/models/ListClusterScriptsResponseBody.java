// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterScriptsResponseBody extends TeaModel {
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

    public static ListClusterScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterScriptsResponseBody self = new ListClusterScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterScriptsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClusterScriptsResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListClusterScriptsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterScriptsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        // clusterId
        @NameInMap("clusterId")
        public String clusterId;

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

        // clusterScriptArgs
        @NameInMap("scriptArgs")
        public String scriptArgs;

        // clusterScriptContent
        @NameInMap("scriptContent")
        public String scriptContent;

        // clusterScriptContentSpec
        @NameInMap("scriptContentSpec")
        public String scriptContentSpec;

        // clusterScriptId
        @NameInMap("scriptId")
        public String scriptId;

        // clusterScriptName
        @NameInMap("scriptName")
        public String scriptName;

        // clusterScriptPath
        @NameInMap("scriptPath")
        public String scriptPath;

        // clusterScriptType
        @NameInMap("scriptType")
        public String scriptType;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Items setExecuteFailStrategy(String executeFailStrategy) {
            this.executeFailStrategy = executeFailStrategy;
            return this;
        }
        public String getExecuteFailStrategy() {
            return this.executeFailStrategy;
        }

        public Items setExecuteMoment(String executeMoment) {
            this.executeMoment = executeMoment;
            return this;
        }
        public String getExecuteMoment() {
            return this.executeMoment;
        }

        public Items setExecuteScope(String executeScope) {
            this.executeScope = executeScope;
            return this;
        }
        public String getExecuteScope() {
            return this.executeScope;
        }

        public Items setExecuteScopeParams(String executeScopeParams) {
            this.executeScopeParams = executeScopeParams;
            return this;
        }
        public String getExecuteScopeParams() {
            return this.executeScopeParams;
        }

        public Items setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public Items setScriptArgs(String scriptArgs) {
            this.scriptArgs = scriptArgs;
            return this;
        }
        public String getScriptArgs() {
            return this.scriptArgs;
        }

        public Items setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

        public Items setScriptContentSpec(String scriptContentSpec) {
            this.scriptContentSpec = scriptContentSpec;
            return this;
        }
        public String getScriptContentSpec() {
            return this.scriptContentSpec;
        }

        public Items setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public Items setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public Items setScriptPath(String scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        public String getScriptPath() {
            return this.scriptPath;
        }

        public Items setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

    }

}
