// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsTransparentProxyAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMsTransparentProxyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsTransparentProxyAppRequest self = new DeleteMsTransparentProxyAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsTransparentProxyAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteMsTransparentProxyAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
