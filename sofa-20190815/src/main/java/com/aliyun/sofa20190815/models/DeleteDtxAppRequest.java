// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDtxAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppRequest self = new DeleteDtxAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteDtxAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
