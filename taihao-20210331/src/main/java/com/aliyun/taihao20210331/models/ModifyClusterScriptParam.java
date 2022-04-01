// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ModifyClusterScriptParam extends TeaModel {
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

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ModifyClusterScriptParam build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterScriptParam self = new ModifyClusterScriptParam();
        return TeaModel.build(map, self);
    }

    public ModifyClusterScriptParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterScriptParam setClusterScriptArgs(String clusterScriptArgs) {
        this.clusterScriptArgs = clusterScriptArgs;
        return this;
    }
    public String getClusterScriptArgs() {
        return this.clusterScriptArgs;
    }

    public ModifyClusterScriptParam setClusterScriptContent(String clusterScriptContent) {
        this.clusterScriptContent = clusterScriptContent;
        return this;
    }
    public String getClusterScriptContent() {
        return this.clusterScriptContent;
    }

    public ModifyClusterScriptParam setClusterScriptContentSpec(String clusterScriptContentSpec) {
        this.clusterScriptContentSpec = clusterScriptContentSpec;
        return this;
    }
    public String getClusterScriptContentSpec() {
        return this.clusterScriptContentSpec;
    }

    public ModifyClusterScriptParam setClusterScriptId(String clusterScriptId) {
        this.clusterScriptId = clusterScriptId;
        return this;
    }
    public String getClusterScriptId() {
        return this.clusterScriptId;
    }

    public ModifyClusterScriptParam setClusterScriptName(String clusterScriptName) {
        this.clusterScriptName = clusterScriptName;
        return this;
    }
    public String getClusterScriptName() {
        return this.clusterScriptName;
    }

    public ModifyClusterScriptParam setClusterScriptPath(String clusterScriptPath) {
        this.clusterScriptPath = clusterScriptPath;
        return this;
    }
    public String getClusterScriptPath() {
        return this.clusterScriptPath;
    }

    public ModifyClusterScriptParam setClusterScriptType(String clusterScriptType) {
        this.clusterScriptType = clusterScriptType;
        return this;
    }
    public String getClusterScriptType() {
        return this.clusterScriptType;
    }

    public ModifyClusterScriptParam setExecuteFailStrategy(String executeFailStrategy) {
        this.executeFailStrategy = executeFailStrategy;
        return this;
    }
    public String getExecuteFailStrategy() {
        return this.executeFailStrategy;
    }

    public ModifyClusterScriptParam setExecuteMoment(String executeMoment) {
        this.executeMoment = executeMoment;
        return this;
    }
    public String getExecuteMoment() {
        return this.executeMoment;
    }

    public ModifyClusterScriptParam setExecuteScope(String executeScope) {
        this.executeScope = executeScope;
        return this;
    }
    public String getExecuteScope() {
        return this.executeScope;
    }

    public ModifyClusterScriptParam setExecuteScopeParams(String executeScopeParams) {
        this.executeScopeParams = executeScopeParams;
        return this;
    }
    public String getExecuteScopeParams() {
        return this.executeScopeParams;
    }

    public ModifyClusterScriptParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ModifyClusterScriptParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
