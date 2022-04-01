// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterScriptParam extends TeaModel {
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

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // clusterScriptArgs
    @NameInMap("scriptArgs")
    public String scriptArgs;

    // clusterScriptContent
    @NameInMap("scriptContent")
    public String scriptContent;

    // clusterScriptContentSpec
    @NameInMap("scriptContentSpec")
    public String scriptContentSpec;

    // clusterScriptName
    @NameInMap("scriptName")
    public String scriptName;

    // clusterScriptPath
    @NameInMap("scriptPath")
    public String scriptPath;

    // clusterScriptType
    @NameInMap("scriptType")
    public String scriptType;

    public static CreateClusterScriptParam build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterScriptParam self = new CreateClusterScriptParam();
        return TeaModel.build(map, self);
    }

    public CreateClusterScriptParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterScriptParam setExecuteFailStrategy(String executeFailStrategy) {
        this.executeFailStrategy = executeFailStrategy;
        return this;
    }
    public String getExecuteFailStrategy() {
        return this.executeFailStrategy;
    }

    public CreateClusterScriptParam setExecuteMoment(String executeMoment) {
        this.executeMoment = executeMoment;
        return this;
    }
    public String getExecuteMoment() {
        return this.executeMoment;
    }

    public CreateClusterScriptParam setExecuteScope(String executeScope) {
        this.executeScope = executeScope;
        return this;
    }
    public String getExecuteScope() {
        return this.executeScope;
    }

    public CreateClusterScriptParam setExecuteScopeParams(String executeScopeParams) {
        this.executeScopeParams = executeScopeParams;
        return this;
    }
    public String getExecuteScopeParams() {
        return this.executeScopeParams;
    }

    public CreateClusterScriptParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateClusterScriptParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateClusterScriptParam setScriptArgs(String scriptArgs) {
        this.scriptArgs = scriptArgs;
        return this;
    }
    public String getScriptArgs() {
        return this.scriptArgs;
    }

    public CreateClusterScriptParam setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public CreateClusterScriptParam setScriptContentSpec(String scriptContentSpec) {
        this.scriptContentSpec = scriptContentSpec;
        return this;
    }
    public String getScriptContentSpec() {
        return this.scriptContentSpec;
    }

    public CreateClusterScriptParam setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public CreateClusterScriptParam setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }
    public String getScriptPath() {
        return this.scriptPath;
    }

    public CreateClusterScriptParam setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
