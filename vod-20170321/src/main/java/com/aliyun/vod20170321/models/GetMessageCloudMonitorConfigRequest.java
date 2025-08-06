// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCloudMonitorConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static GetMessageCloudMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCloudMonitorConfigRequest self = new GetMessageCloudMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageCloudMonitorConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageCloudMonitorConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
