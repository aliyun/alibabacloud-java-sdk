// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsTransparentProxyAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("SupportProtocols")
    public String supportProtocols;

    public static AddMsTransparentProxyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsTransparentProxyAppRequest self = new AddMsTransparentProxyAppRequest();
        return TeaModel.build(map, self);
    }

    public AddMsTransparentProxyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsTransparentProxyAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsTransparentProxyAppRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public AddMsTransparentProxyAppRequest setSupportProtocols(String supportProtocols) {
        this.supportProtocols = supportProtocols;
        return this;
    }
    public String getSupportProtocols() {
        return this.supportProtocols;
    }

}
