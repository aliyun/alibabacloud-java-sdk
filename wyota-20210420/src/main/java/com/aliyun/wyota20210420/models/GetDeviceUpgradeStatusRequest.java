// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceUpgradeStatusRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ClientUid")
    public String clientUid;

    @NameInMap("Project")
    public String project;

    @NameInMap("TaskUid")
    public String taskUid;

    public static GetDeviceUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceUpgradeStatusRequest self = new GetDeviceUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceUpgradeStatusRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetDeviceUpgradeStatusRequest setClientUid(String clientUid) {
        this.clientUid = clientUid;
        return this;
    }
    public String getClientUid() {
        return this.clientUid;
    }

    public GetDeviceUpgradeStatusRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetDeviceUpgradeStatusRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
