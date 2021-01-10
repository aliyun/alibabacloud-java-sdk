// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsTransparentProxyNodeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Nodes")
    public String nodes;

    public static AddMsTransparentProxyNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsTransparentProxyNodeRequest self = new AddMsTransparentProxyNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddMsTransparentProxyNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsTransparentProxyNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsTransparentProxyNodeRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

}
