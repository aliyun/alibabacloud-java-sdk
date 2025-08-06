// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCloudMonitorConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteMessageCloudMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCloudMonitorConfigRequest self = new DeleteMessageCloudMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCloudMonitorConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMessageCloudMonitorConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
