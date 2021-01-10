// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDTXAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsRequest self = new DeleteDTXAppsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteDTXAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
