// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterScriptDTO extends TeaModel {
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

    // scriptArgs
    @NameInMap("scriptArgs")
    public String scriptArgs;

    // scriptContent
    @NameInMap("scriptContent")
    public String scriptContent;

    // scriptContentSpec
    @NameInMap("scriptContentSpec")
    public String scriptContentSpec;

    // scriptName
    @NameInMap("scriptName")
    public String scriptName;

    // scriptPath
    @NameInMap("scriptPath")
    public String scriptPath;

    // scriptType
    @NameInMap("scriptType")
    public String scriptType;

    public static ClusterScriptDTO build(java.util.Map<String, ?> map) throws Exception {
        ClusterScriptDTO self = new ClusterScriptDTO();
        return TeaModel.build(map, self);
    }

    public ClusterScriptDTO setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterScriptDTO setExecuteFailStrategy(String executeFailStrategy) {
        this.executeFailStrategy = executeFailStrategy;
        return this;
    }
    public String getExecuteFailStrategy() {
        return this.executeFailStrategy;
    }

    public ClusterScriptDTO setExecuteMoment(String executeMoment) {
        this.executeMoment = executeMoment;
        return this;
    }
    public String getExecuteMoment() {
        return this.executeMoment;
    }

    public ClusterScriptDTO setExecuteScope(String executeScope) {
        this.executeScope = executeScope;
        return this;
    }
    public String getExecuteScope() {
        return this.executeScope;
    }

    public ClusterScriptDTO setExecuteScopeParams(String executeScopeParams) {
        this.executeScopeParams = executeScopeParams;
        return this;
    }
    public String getExecuteScopeParams() {
        return this.executeScopeParams;
    }

    public ClusterScriptDTO setLastEditTime(Long lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }
    public Long getLastEditTime() {
        return this.lastEditTime;
    }

    public ClusterScriptDTO setScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
        return this;
    }
    public String getScriptArgs() {
        return this.scriptArgs;
    }

    public ClusterScriptDTO setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public ClusterScriptDTO setScriptContentSpec(String scriptContentSpec) {
        this.scriptContentSpec = scriptContentSpec;
        return this;
    }
    public String getScriptContentSpec() {
        return this.scriptContentSpec;
    }

    public ClusterScriptDTO setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ClusterScriptDTO setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }
    public String getScriptPath() {
        return this.scriptPath;
    }

    public ClusterScriptDTO setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
