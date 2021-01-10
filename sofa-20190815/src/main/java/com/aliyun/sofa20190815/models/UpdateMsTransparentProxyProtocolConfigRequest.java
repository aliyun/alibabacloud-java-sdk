// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsTransparentProxyProtocolConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Port")
    public Long port;

    @NameInMap("ProtocolConfig")
    public String protocolConfig;

    public static UpdateMsTransparentProxyProtocolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsTransparentProxyProtocolConfigRequest self = new UpdateMsTransparentProxyProtocolConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsTransparentProxyProtocolConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsTransparentProxyProtocolConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsTransparentProxyProtocolConfigRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public UpdateMsTransparentProxyProtocolConfigRequest setProtocolConfig(String protocolConfig) {
        this.protocolConfig = protocolConfig;
        return this;
    }
    public String getProtocolConfig() {
        return this.protocolConfig;
    }

}
