// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCloudMonitorConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SetMessageCloudMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCloudMonitorConfigRequest self = new SetMessageCloudMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetMessageCloudMonitorConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMessageCloudMonitorConfigRequest setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    public SetMessageCloudMonitorConfigRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public SetMessageCloudMonitorConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
