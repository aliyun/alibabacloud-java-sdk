// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetApplicationActionsParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // componentName
    @NameInMap("componentName")
    public String componentName;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetApplicationActionsParam build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationActionsParam self = new GetApplicationActionsParam();
        return TeaModel.build(map, self);
    }

    public GetApplicationActionsParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationActionsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetApplicationActionsParam setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public GetApplicationActionsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public GetApplicationActionsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
