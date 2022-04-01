// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ExecuteClusterScriptParam extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scriptIds
    @NameInMap("scriptIds")
    public java.util.List<String> scriptIds;

    public static ExecuteClusterScriptParam build(java.util.Map<String, ?> map) throws Exception {
        ExecuteClusterScriptParam self = new ExecuteClusterScriptParam();
        return TeaModel.build(map, self);
    }

    public ExecuteClusterScriptParam setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteClusterScriptParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExecuteClusterScriptParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ExecuteClusterScriptParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ExecuteClusterScriptParam setScriptIds(java.util.List<String> scriptIds) {
        this.scriptIds = scriptIds;
        return this;
    }
    public java.util.List<String> getScriptIds() {
        return this.scriptIds;
    }

}
