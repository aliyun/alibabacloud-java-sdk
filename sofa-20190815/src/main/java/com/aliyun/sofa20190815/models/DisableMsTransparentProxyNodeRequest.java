// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsTransparentProxyNodeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeIds")
    public String nodeIds;

    public static DisableMsTransparentProxyNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMsTransparentProxyNodeRequest self = new DisableMsTransparentProxyNodeRequest();
        return TeaModel.build(map, self);
    }

    public DisableMsTransparentProxyNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DisableMsTransparentProxyNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableMsTransparentProxyNodeRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

}
