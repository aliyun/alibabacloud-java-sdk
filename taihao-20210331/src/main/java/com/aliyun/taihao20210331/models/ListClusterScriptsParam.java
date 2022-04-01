// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterScriptsParam extends TeaModel {
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

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // queryEndTime
    @NameInMap("queryEndTime")
    public Long queryEndTime;

    // queryStartTime
    @NameInMap("queryStartTime")
    public Long queryStartTime;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // clusterScriptName
    @NameInMap("scriptName")
    public String scriptName;

    // clusterScriptType
    @NameInMap("scriptType")
    public String scriptType;

    public static ListClusterScriptsParam build(java.util.Map<String, ?> map) throws Exception {
        ListClusterScriptsParam self = new ListClusterScriptsParam();
        return TeaModel.build(map, self);
    }

    public ListClusterScriptsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterScriptsParam setExecuteFailStrategy(String executeFailStrategy) {
        this.executeFailStrategy = executeFailStrategy;
        return this;
    }
    public String getExecuteFailStrategy() {
        return this.executeFailStrategy;
    }

    public ListClusterScriptsParam setExecuteMoment(String executeMoment) {
        this.executeMoment = executeMoment;
        return this;
    }
    public String getExecuteMoment() {
        return this.executeMoment;
    }

    public ListClusterScriptsParam setExecuteScope(String executeScope) {
        this.executeScope = executeScope;
        return this;
    }
    public String getExecuteScope() {
        return this.executeScope;
    }

    public ListClusterScriptsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClusterScriptsParam setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    public ListClusterScriptsParam setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public ListClusterScriptsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListClusterScriptsParam setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ListClusterScriptsParam setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
